import java.net.*;
import java.io.*;

public class URLConnectionDemo {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com");

            // Open a connection to the URL
            URLConnection connection = url.openConnection();

            // Read data from the URL
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
