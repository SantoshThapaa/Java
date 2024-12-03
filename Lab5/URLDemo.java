import java.net.URL;

public class URLDemo {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://www.example.com:8080/path/to/resource?query=123#section");

            // Demonstrate commonly used methods
            System.out.println("URL: " + url);
            System.out.println("Protocol: " + url.getProtocol()); // https
            System.out.println("Host: " + url.getHost());         // www.example.com
            System.out.println("Port: " + url.getPort());         // 8080
            System.out.println("Path: " + url.getPath());         // /path/to/resource
            System.out.println("Query: " + url.getQuery());       // query=123
            System.out.println("Ref (Fragment): " + url.getRef()); // section
            System.out.println("File: " + url.getFile());         // /path/to/resource?query=123

        } catch (Exception e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}
