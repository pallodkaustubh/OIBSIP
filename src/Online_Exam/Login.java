package Online_Exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Login extends JFrame implements ActionListener {
    private JButton submitButton;
    private JPanel newPanel;
    private JLabel userLabel, passLabel;
    private final JTextField textField1, textField2;

    Login() {

        userLabel = new JLabel("Username: ");
        textField1 = new JTextField(15);
        passLabel = new JLabel("Password: ");
        textField2 = new JPasswordField(8);
        submitButton = new JButton("SUBMIT");
        newPanel = new JPanel(new GridLayout(3, 2));
        newPanel.add(userLabel);
        newPanel.add(textField1);
        newPanel.add(passLabel);
        newPanel.add(textField2);
        newPanel.add(new JLabel());
        newPanel.add(submitButton);
        add(newPanel, BorderLayout.CENTER);
        submitButton.addActionListener(this);
        setTitle("Login Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // center the window on the screen
        setResizable(false); // prevent resizing the window
        pack(); // adjust the size of the window to fit the components
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        String userValue = textField1.getText();
        String passValue = textField2.getText();
        if (passValue.isEmpty()) {
            textField2.setText("Enter Password");
        } else {
            new OnlineExam(userValue);
            dispose(); // close the login window
        }
    }
}
