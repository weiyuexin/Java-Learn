package weiyuexin;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    private static Socket socket;
    private static ObjectOutputStream oos;
    public static boolean connect_state = false;//链接状态

    public static void main(String[] args) {
        while (!connect_state){
            connect();
            try{
                System.out.println("连接失败，正在尝试重新连接...");
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    //连接函数
    private static void connect(){
        try {
            socket =new Socket("127.0.0.1",9999);
            connect_state = true;

            if(connect_state){ //判断是否连接成功
                try{
                    oos = new ObjectOutputStream(socket.getOutputStream());
                    new Thread(new Client_listen(socket)).start();
                    new Thread(new Client_send(socket,oos)).start();
                    new Thread(new Client_heart(socket,oos)).start();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }catch (Exception e){
            connect_state = false;
            e.printStackTrace();
        }
    }
    public static void reconnect(){
        while (!connect_state){
            System.out.println("正在尝试重新连接...");
            connect();
            try {
                Thread.sleep(3000);
            }catch (Exception e){
                e.printStackTrace();
            }

        }
    }
}
//监听服务器发送来的消息
class Client_listen implements Runnable{
    private Socket socket;

    public Client_listen(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            while (true){
                System.out.println(ois.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
//向服务端发送信息
class Client_send implements Runnable{
    private Socket socket;
    private ObjectOutputStream oos;

    public Client_send(Socket socket,ObjectOutputStream oos) {
        this.socket = socket;
        this.oos = oos;
    }

    @Override
    public void run() {
        try{
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.print("请输入你要发送的信息:");
                String str = sc.nextLine();
                JSONObject object = new JSONObject();
                object.put("type","chat");
                object.put("msg",str);
                oos.writeObject(object);
                oos.flush();  //刷新缓冲区
            }
        }catch (Exception e){
            e.printStackTrace();
            try {
                socket.close();
                Client.connect_state = false;
                Client.reconnect();//尝试重新连接
            }catch (Exception ee){
                ee.printStackTrace();
            }
        }
    }
}

//构造心跳包，定时向服务器发送连接信息
class Client_heart implements Runnable{
    private Socket socket;
    private ObjectOutputStream oos; //因为客户端会验证ObjectOutputStream是否是同一个，所以不能新建ObjectOutputStream

    public Client_heart(Socket socket,ObjectOutputStream oos) {
        this.socket = socket;
        this.oos = oos;
    }

    @Override
    public void run() {
        try {
            System.out.println("心跳包线程已启动...");
            while(true) {
                Thread.sleep(5000);
                JSONObject object = new JSONObject();
                object.put("type", "heart");
                object.put("msg", "心跳包");
                oos.writeObject(object); //发送给客户端
                oos.flush();//刷新缓冲区
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                socket.close();
                Client.connect_state = false;
                Client.reconnect();//尝试重新连接
            }catch (Exception ee){
                ee.printStackTrace();
            }
        }
    }
}
