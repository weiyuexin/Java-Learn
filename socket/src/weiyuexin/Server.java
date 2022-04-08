package weiyuexin;

import org.json.simple.JSONObject;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args)  {

        try{
            System.out.println("Socket服务器开始运行...");
            ServerSocket serverSocket = new ServerSocket(9999);
            while(true){
                Socket socket = serverSocket.accept(); //接收客户请求
                new Thread(new Server_listen(socket)).start();//创建监听线程
                new Thread(new Server_send(socket)).start();//创建发送线程
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
//监听客户端发送来的信息
class Server_listen implements Runnable{
    private Socket socket;

    //构造函数初始化
    public Server_listen(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            //创建输入对象流
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            //读取客户传递的信息
            while(true){
                System.out.println(ois.readObject());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
class Server_send implements Runnable{
    private Socket socket;
    public Server_send(Socket socket) {
        this.socket=socket;
    }

    @Override
    public void run() {
        try {
            //对象输出流
            ObjectOutputStream ops = new ObjectOutputStream(socket.getOutputStream());
            Scanner sc = new Scanner(System.in);
            while(true) {
                System.out.print("请输入你要发送的信息:");
                String str = sc.nextLine();
                JSONObject object = new JSONObject();
                object.put("type", "chat");
                object.put("msg", str);
                ops.writeObject(object); //发送给客户端
                ops.flush();//刷新缓冲区
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}