import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicketManagementSystem extends JFrame {
    private JTextField nameField, destinationField, dateField;
    private JComboBox<String> ticketTypeComboBox;
    private JButton bookButton;

    public TicketManagementSystem() {
        setTitle("Transport Ticket Booking System");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));

        inputPanel.add(new JLabel("Name:"));
        nameField = new JTextField();
        inputPanel.add(nameField);

        inputPanel.add(new JLabel("Destination:"));
        destinationField = new JTextField();
        inputPanel.add(destinationField);

        inputPanel.add(new JLabel("Date:"));
        dateField = new JTextField();
        inputPanel.add(dateField);

        inputPanel.add(new JLabel("Ticket Type:"));
        String[] ticketTypes = {"Economy", "Business", "First Class"};
        ticketTypeComboBox = new JComboBox<>(ticketTypes);
        inputPanel.add(ticketTypeComboBox);

        bookButton = new JButton("Book Ticket");
        bookButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookTicket();
            }
        });
        inputPanel.add(bookButton);

        add(inputPanel, BorderLayout.CENTER);
    }

    private void bookTicket() {
        String name = nameField.getText();
        String destination = destinationField.getText();
        String date = dateField.getText();
        String ticketType = (String) ticketTypeComboBox.getSelectedItem();

        // Add your ticket booking logic here
        // You can process the user input and make API calls to book tickets with actual transport providers

        // For this example, we'll just display a confirmation message
        String message = "Ticket booked for:\n"
                + "Name: " + name + "\n"
                + "Destination: " + destination + "\n"
                + "Date: " + date + "\n"
                + "Ticket Type: " + ticketType;

        JOptionPane.showMessageDialog(this, message, "Ticket Booked", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                TicketManagementSystem app = new TicketManagementSystem();
                app.setVisible(true);
            }
   });
}
}
