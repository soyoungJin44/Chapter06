package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		//소켓생성
		ServerSocket serverSocket = new ServerSocket();
		
		// 이걸로 ip, 포트번호 한번 싸서 bind값 넣어줘야함.>> new InetSocketAdress("192.168.0.52",10001);
		// **걍외우셈
		serverSocket.bind(new InetSocketAddress("192.168.0.52", 10001)); // 포트 세팅 완료 (서버켜짐 대기중 이라고 생각)
		
		System.out.println("<서버 스따뜨>");
		System.out.println("===============");
		System.out.println("[연결을 기다리고있슴당]");
		
		Socket socket = serverSocket.accept();		//socket은 종이컵 전화기라고 생각 대기상태에 있다가 누가 오면 알려줌
		System.out.println("[클라이언트가 연결 되었습니다.]");
		
		
		//socket에서 가져와야하기때문에
		InputStream in = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(in,"UTF-8");
		
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter osw = new OutputStreamWriter(out, "UTF-8");
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		//메세지 받기
		String msg = br.readLine();
		System.out.println("받은 메세지: " + msg);         //테스트테스트
		
		//보내기
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		System.out.println("=============");
		System.out.println("종료오");
		
		br.close();
		bw.close();
		socket.close();
		serverSocket.close();
	}

}
