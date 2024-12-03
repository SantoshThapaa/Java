import java.net.*;
import java.io.*;
import java.io.IOException;


public class DatagramSocketClient {
    public static void main(String[] args) {
        try {
            // Create a DatagramSocket for sending and receiving data
            DatagramSocket socket = new DatagramSocket();

            // Define the server address and port
            InetAddress serverAddress = InetAddress.getByName("localhost");
            int serverPort = 9876;

            // Prepare the message to send to the server
            String message = "Hello, Server!";
            byte[] sendData = message.getBytes();

            // Create a DatagramPacket to send the data
            DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverAddress, serverPort);

            // Send the packet to the server
            System.out.println("Sending message to the server...");
            socket.send(sendPacket);

            // Buffer to receive the server's response
            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);

            // Wait for the server's response
            socket.receive(receivePacket);
            String response = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("Response from server: " + response);

            // Close the socket
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
