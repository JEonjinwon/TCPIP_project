import java.net.*;

import java.io.*;
import java.util.*;

public class UDP_Client {
	public static void main(String[] args) {
        // Ű���� �Է� �ޱ� ���� ����
        Scanner scanner =new Scanner(System.in);
        System.out.println("���� �޼��� �Է� :");
        String msg = scanner.next();
         
        try{
            // ������ �� �ִ� UDP ���� ����
            DatagramSocket dsoc =new DatagramSocket();
             
            // ���� ���� �ּ� ����
            InetAddress ia = InetAddress.getByName("127.0.0.1");
             
            // ������ ������ ����
            DatagramPacket dp =new DatagramPacket(msg.getBytes(),msg.getBytes().length,ia, 7779);
             
            //epdlxj wjsthd
            dsoc.send(dp);
            dsoc.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
     
         
         
    }
 
}
