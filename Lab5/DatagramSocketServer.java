import java.net.*;
import java.io.IOException;


public class DatagramSocketServer {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket to listen on port 9876
            DatagramSocket serverSocket = new DatagramSocket(9876);
            System.out.println("Server is running and waiting for messages...");

            while (true) {
                // Buffer to receive incoming data
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

                // Receive a packet from the client
                serverSocket.receive(receivePacket);
                String clientMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Message from client: " + clientMessage);

                // Prepare a response
                String response = "Hello, Client! Received your message.";
                byte[] sendData = response.getBytes();

                // Send the response back to the client
                InetAddress clientAddress = receivePacket.getAddress();
                int clientPort = receivePacket.getPort();
                DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientAddress, clientPort);

                serverSocket.send(sendPacket);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
