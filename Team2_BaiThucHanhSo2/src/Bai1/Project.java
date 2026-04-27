package Bai1;

import javax.swing.*;
import java.awt.*;

public class Bai1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Library");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        // ===== Banner =====
        JPanel banner = new JPanel();
        banner.setBackground(Color.WHITE);
        banner.setLayout(new BoxLayout(banner, BoxLayout.Y_AXIS));
        banner.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel line1 = new JLabel("BACK TO SCHOOL");
        JLabel line2 = new JLabel("SPECIAL 50% OFF");
        JLabel line3 = new JLabel("FOR OUR STUDENT COMMUNITY");

        line2.setForeground(Color.RED);
        line2.setFont(new Font("Arial", Font.BOLD, 20));

        banner.add(line1);
        banner.add(line2);
        banner.add(line3);

        // ===== Books Title =====
        JLabel title = new JLabel("Featured books");
        title.setFont(new Font("Arial", Font.BOLD, 16));

        // ===== Books Panel =====
        JPanel booksPanel = new JPanel();
        booksPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        booksPanel.setBackground(new Color(245, 246, 250));

        // Book 1
        booksPanel.add(createBook("Learn Python"));

        // Book 2
        booksPanel.add(createBook("Data Structures"));

        // Book 3
        booksPanel.add(createBook("C Programming"));

        // ===== Main Layout =====
        JPanel center = new JPanel();
        center.setLayout(new BorderLayout());
        center.add(title, BorderLayout.NORTH);
        center.add(booksPanel, BorderLayout.CENTER);

        frame.add(banner, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    // Hàm tạo 1 book
    public static JPanel createBook(String name) {
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(150, 180));
        panel.setBackground(Color.WHITE);
        panel.setLayout(new BorderLayout());

        // Image (placeholder)
        JLabel img = new JLabel("Image", SwingConstants.CENTER);
        img.setPreferredSize(new Dimension(150, 100));
        img.setBorder(BorderFactory.createLineBorder(Color.GRAY));

        // Title
        JLabel title = new JLabel(name, SwingConstants.CENTER);

        panel.add(img, BorderLayout.CENTER);
        panel.add(title, BorderLayout.SOUTH);

        return panel;
    }
}
