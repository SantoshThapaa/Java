//For client DatagramSocket, DatagramPacket, InotAddress
import java.util.*;
import java.net.*;
import java.io.*;
public class UDPClient{
    public static void main(String[] args) throws Exception{
        DatagramSocket socket = new DatagramSocket();
        byte[] buf= new byte[256];
        DatagramPacket packet = new DatagramPacket(buf, buf.length,address,4245);
        InotAddress  

    }
}