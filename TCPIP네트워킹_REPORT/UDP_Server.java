import java.net.*;

public class UDP_Server {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
         
        try{
            // ������ �����Ҽ� �ֵ��� UDP ���� ����
            DatagramSocket dsoc = new DatagramSocket(7777);
            // ���۹��� �����͸� ������ ����Ʈ �迭����
            byte [] date = new byte[66536];
             
            // UDP ������� ������ ���� packet ��ü����
            DatagramPacket dp = new DatagramPacket(date, date.length);
             
            System.out.println("������ ���� �غ� �Ϸ�....");
            while(true){
                // ������ ���� �ޱ�
                dsoc.receive(dp);
                // ������ ������ Ȯ��
                System.out.println(" �۽� IP : " + dp.getAddress());
                // ���� �����͸� Utf-8�� ���ڿ��� ��ȯ
                String msg = new String(dp.getData(),"UTF-8");
                System.out.println("���� �� ����  : " + msg);
            }
     
             
             
        }catch(Exception e){
            System.out.println(e.getMessage()
                    );      }
 
    }
 
}

