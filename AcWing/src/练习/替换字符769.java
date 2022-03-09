package Á·Ï°;

import java.util.*;
public class Ìæ»»×Ö·û769{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.next();
        char ch = sc.next().toCharArray()[0];
        char c[] = str.toCharArray();
        for(int i=0;i<c.length;i++){
            if(c[i] == ch){
                System.out.print('#');
            }else{
                System.out.print(c[i]);
            }
        }
        
        sc.close();
    }
    
    
}
