import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try { 
            // Create a socket that connects to the server at localhost on port 1234
            Socket socket = new Socket("localhost", 1234);
            System.out.println("Connected to the server.");

            // Set up input and output streams
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            // Get a message from the user and send it to the server
            System.out.print("Enter a message for the server: ");
            String message = input.readLine();
            output.println(message);

            // Set up a reader to read the server's response
            BufferedReader serverResponse = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = serverResponse.readLine();
            System.out.println("Server says: " + response);

            // Close the socket connection
            socket.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
