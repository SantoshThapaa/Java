import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) {
        try {
            // Create a server socket that listens on port 1234
            ServerSocket serverSocket = new ServerSocket(1234);
            System.out.println("Server started, waiting for client connection...");

            // Accept a connection from the client
            Socket socket = serverSocket.accept();
            System.out.println("Client connected: " + socket.getInetAddress());

            // Set up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Read message from the client
            String clientMessage = input.readLine();
            System.out.println("Message from client: " + clientMessage);

            // Send a response to the client
            output.println("Hello from the server! You said: " + clientMessage);

            // Close the connection
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
