import java.io.*; 
import java.net.*; 
class serverRPC {
	public static void main(String args[]){ 
		new server().go();
	}
public void go(){
while(true){
try{
ServerSocket server=new ServerSocket(8081); 
Socket socket=server.accept();
new Thread(new thread(socket)).start();
}catch(Exception e){}
}
}
class thread implements Runnable{ 
	Socket s;thread(Socket s){ 
		this.s=s;
	}
	public void run(){ 
		try{
			InputStream is=s.getInputStream();
			FileOutputStream out =new FileOutputStream(new File("clientcopy.class")); 
			int ch=0;ch=is.read();
			do{
				out.write(ch);
				ch=is.read(); 
			}while(ch!=-1); 
			out.flush();
			System.out.println("File (client.class) Copied to server as (clientcopy.class)");
			out.close();
			s.close();
		}catch(Exception e){ 
			System.out.println(e);
		}}}}