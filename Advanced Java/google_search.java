import java.awt.Desktop;
import java.io.UnsupportedEncodingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.net.URI;
import java.net.URLEncoder;
public class google_search {
    public static void main(String[] args) {
        JFrame f = new JFrame("Google Widget");
        f.setSize(400, 120);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create search label and text field
        JLabel searchLabel = new JLabel("Enter search query:");
        searchLabel.setBounds(10, 10, 120, 20);
        JTextField searchField = new JTextField();
        searchField.setBounds(130, 10, 200, 20);

        // Create search button
        JButton searchButton = new JButton("Google Search");
        searchButton.setBounds(10, 40, 320, 30);
        searchButton.addActionListener(e -> {
            String query = searchField.getText();
            try {
                query = URLEncoder.encode(query, "UTF-8");
            } catch (UnsupportedEncodingException ex) {
                System.out.println("Error encoding query: " + ex.getMessage());
                return;
            }
            String url = "https://www.google.com/search?q=" + query;
            try {
                Desktop.getDesktop().browse(new URI(url));
            } catch (Exception ex) {
                System.out.println("Error opening browser: " + ex.getMessage());
            }
        });

        // Add components to frame
        f.add(searchLabel);
        f.add(searchField);
        f.add(searchButton);

        // Set layout to null for absolute positioning of components
        f.setLayout(null);
        f.setVisible(true);
    }
}
