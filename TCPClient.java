import java.net.Socket; 
import java.io.OutputStream;
import java.io.DataOutputStream;

public class CTSClient
{
   public static void main(String args[]) throws Exception
   {
     Socket sock = new Socket("localhost", 5000);       
     String message1 = "This message was stored in the Client,no Cheating see the Code XD";
     OutputStream ostream = sock.getOutputStream();                 
     DataOutputStream dos = new DataOutputStream(ostream);
     dos.writeBytes(message1);                                                         
     dos.close();                            
     ostream.close();   
     sock.close();
  }
}
