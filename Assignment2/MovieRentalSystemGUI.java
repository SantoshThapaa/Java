import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieRentalSystemGUI extends JFrame {
    // Swing components
    private JTextField titleField, genreField, languageField, lengthField;
    private JButton okButton;

    public MovieRentalSystemGUI() {
        // Create frame
        setTitle("Movie Rental System");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2));

        // Initialize components
        titleField = new JTextField();
        genreField = new JTextField();
        languageField = new JTextField();
        lengthField = new JTextField();
        okButton = new JButton("OK");

        // Add components to frame
        add(new JLabel("Title:"));
        add(titleField);
        add(new JLabel("Genre:"));
        add(genreField);
        add(new JLabel("Language:"));
        add(languageField);
        add(new JLabel("Length (min):"));
        add(lengthField);
        add(okButton);

        // Button click event
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                insertMovie();
            }
        });

        setVisible(true);
    }

    private void insertMovie() {
        String title = titleField.getText();
        String genre = genreField.getText();
        String language = languageField.getText();
        int length;

        try {
            length = Integer.parseInt(lengthField.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid length.");
            return;
        }

        // Database connection
        String url = "jdbc:mysql://localhost:3306/MRS"; // Update this with your database URL
        String user = "root"; // Update with your database username
        String password = "password"; // Update with your database password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO Movie (Title, Genre, Language, Length) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, title);
            pstmt.setString(2, genre);
            pstmt.setString(3, language);
            pstmt.setInt(4, length);

            int rowsInserted = pstmt.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Movie inserted successfully!");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new MovieRentalSystemGUI());
    }
}
