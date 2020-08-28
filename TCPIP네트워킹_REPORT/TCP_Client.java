import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class TCP_Client {
	public static void main(String[] arg) {
		Socket socket = null; 
		BufferedReader in = null; 
		BufferedReader in2 = null; 
		PrintWriter out = null; 
		InetAddress ia = null;
		try {
			ia = InetAddress.getByName("192.168.219.101"); 
			socket = new Socket(ia, 1000);
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			in2 = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())));

			System.out.println(socket.toString());
		} catch (IOException e) {
		}

		try {
			System.out.print("서버로 보낼 메세제 : ");
			String data = in2.readLine(); 
			out.println(data);
			out.flush();

			String str2 = in.readLine(); 
			System.out.println("서버로부터 되돌아온 메세지 : " + str2);
			socket.close();

		} catch (IOException e) {
		}
	}
}