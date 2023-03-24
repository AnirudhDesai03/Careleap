import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;

class app implements ActionListener {
    static JFrame frame1;
    static JFrame frame2;
    static JFrame frame3;
    static JFrame frame4;
    static JFrame frame5;
    static JButton admin;
    static JButton close;
    static JButton signup;
    static JButton signin;
    static JButton login;
    static JButton back;
    static JButton about;
    static JButton record;
    static JButton logout;

    //Driver function
    public static void main(String args[]) {
        //Create frame 1
        frame1 = new JFrame("Frame 1");
        frame1.setBounds(400, 50, 750, 750);
        frame1.setLayout(null);
        frame1.setBackground(Color.WHITE);

        //To set a background image
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("D:\\Work\\linkpage7\\output-onlinepngtools (1).png"));
        background.setBounds(0, 0, 300, 500);
        background.setForeground(new Color(255, 255, 255, 128)); // 50% opacity
        contentPane.add(background);
        frame1.setContentPane(background);
        frame1.setLayout(null);


        //Create Admin buttons
        admin = new JButton("Admin");
        admin.setOpaque(false);
        admin.setContentAreaFilled(false);
        admin.setForeground(Color.black);
        admin.setBackground(Color.RED);
        admin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        admin.setBounds(200, 170, 100, 50);

        //Set font to Times New Roman and style to Bold
        Font font = new Font("Times New Roman", Font.BOLD, 16);
        admin.setFont(font);

        //Create Close Button
        close = new JButton("Close");
        close.setOpaque(false);
        close.setContentAreaFilled(false);
        close.setForeground(Color.BLACK);
        close.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        close.setBounds(450, 170, 100, 50);

        //Set font to Times New Roman and style to Bold
        Font font1 = new Font("Times New Roman", Font.BOLD, 16);
        close.setFont(font1);

        //Add the buttons to frame 1
        frame1.add(admin);
        frame1.add(close);

        //Create an object
        app obj = new app();

        //Associate ActionListener with the buttons
        admin.addActionListener(obj);
        close.addActionListener(obj);

        //Display frame 1
        frame1.setVisible(true);
    }

    //Function to perform actions related to button clicked
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if (button.equals("Admin")) {
            create_frame2();
        }

        if (button.equals("Close")) {
            frame1.dispose();
        }

        if (button.equals("Signin")) {
            create_frame3();
        }
        if (button.equals("Back")) {
            frame3.dispose();
        }
        if (button.equals("Login")) {
            create_frame4();
        }
        if (button.equals("Record")) {
            create_frame5();
        }
        if (button.equals("Logout")) {
            frame5.dispose();
            frame4.dispose();
            create_frame3();
        }
    }

    //Frame 2
    public static void create_frame2() {
        // Create frame 2
        frame2 = new JFrame("Frame 2");
        frame2.setBounds(400, 50, 750, 750);
        frame2.setLayout(null);
        frame2.getContentPane().setBackground(new Color(135, 206, 235)); // Set background color to sky blue

        //To set a background image
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("D:\\Work\\linkpage7\\output-onlinepngtools (1).png"));
        background.setBounds(0, 0, 300, 500);
        background.setForeground(new Color(255, 255, 255, 128)); // 50% opacity
        contentPane.add(background);
        frame2.setContentPane(background);
        frame2.setLayout(null);

        //Add a new User logo to the Frame
        JLabel logoLabel = new JLabel();
        ImageIcon logoIcon = new ImageIcon("D:\\Work\\linkpage7\\newuser.png");
        logoLabel.setIcon(logoIcon);
        logoLabel.setBounds(50, 50, 75, 75);
        frame2.add(logoLabel, BorderLayout.CENTER);

        // Create and add Registration Label
        JLabel registrationLabel = new JLabel("Registration");
        registrationLabel.setBounds(135, 50, 600, 100);
        registrationLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 48));
        frame2.add(registrationLabel);

        // Create and add JTextField for First Name
        JTextField firstNameField = new JTextField();
        firstNameField.setBounds(185, 180, 400, 30);
        firstNameField.setOpaque(false); // Make the text field transparent
        firstNameField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(firstNameField);


        // Create and add JTextField for Last Name
        JTextField lastNameField = new JTextField();
        lastNameField.setBounds(185, 220, 400, 30);
        lastNameField.setOpaque(false); // Make the text field transparent
        lastNameField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(lastNameField);

        // Create and add JTextField for Mobile Number
        JTextField mnoField = new JTextField();
        mnoField.setBounds(185, 260, 400, 30);
        mnoField.setOpaque(false); // Make the text field transparent
        mnoField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(mnoField);


        // Create and add JPasswordField for Password
        JPasswordField passField = new JPasswordField();
        passField.setBounds(185, 300, 400, 30);
        passField.setOpaque(false); // Make the text field transparent
        passField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(passField);


        // Create and add JPasswordField for Confirm Password
        JPasswordField confirmPassField = new JPasswordField();
        confirmPassField.setBounds(185, 340, 400, 30);
        confirmPassField.setOpaque(false); // Make the text field transparent
        confirmPassField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(confirmPassField);

        // Create and add signup button
        signup = new JButton("SignUp");
        signup.setOpaque(false);
        signup.setContentAreaFilled(false);
        signup.setForeground(Color.BLACK);
        signup.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        signup.setBounds(35, 600, 200, 40);

        // Add action listener to check if any of the text fields are empty
        // Create ActionListener for Submit button
        signup.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Check if any text field is empty
                if (firstNameField.getText().equals("") || lastNameField.getText().equals("") ||
                        mnoField.getText().equals("") || passField.getPassword().length == 0 ||
                        confirmPassField.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(frame2, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (mnoField.getText().length() != 10) {
                    JOptionPane.showMessageDialog(frame2, "Mobile number should be 10 digits long.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                if (!Arrays.equals(passField.getPassword(), confirmPassField.getPassword())) {
                    JOptionPane.showMessageDialog(frame2, "Passwords do not match. Please Try Again", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    JOptionPane.showMessageDialog(frame2, "Sign Up Successfull", "Success", JOptionPane.INFORMATION_MESSAGE);
                    create_frame4();
                }
            }
        });

        //Text for Already have an Account
        JTextArea area2 = new JTextArea();
        area2.setEditable(false);
        area2.setLineWrap(true);
        area2.setWrapStyleWord(true);
        area2.setOpaque(false); // Make the text field transparent
        area2.setText("If Already have an account");
        area2.setFont(new Font("Times new Roman", Font.BOLD, 14));
        area2.setBounds(500, 580, 200, 20);
        area2.setBackground(new Color(135, 206, 235));
        frame2.add(area2, BorderLayout.CENTER);

        // Create and add signin button
        signin = new JButton("Signin");
        signin.setOpaque(false);
        signin.setContentAreaFilled(false);
        signin.setForeground(Color.BLACK);
        signin.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        signin.setBounds(500, 600, 200, 40);

        // Create and add First Name Label
        JLabel firstNameLabel = new JLabel("Hospital Name");
        firstNameLabel.setBounds(25, 180, 150, 20);
        firstNameLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(firstNameLabel);

        // Create and add Last Name Label
        JLabel lastNameLabel = new JLabel("Id Number");
        lastNameLabel.setBounds(25, 220, 100, 20);
        lastNameLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(lastNameLabel);

        // Create and add Mobile Number Label
        JLabel mobnoLabel = new JLabel("Mobile Number");
        mobnoLabel.setBounds(25, 260, 150, 20);
        mobnoLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(mobnoLabel);

        //Create and add PasswordLabel
        JLabel passLabel = new JLabel("Password");
        passLabel.setBounds(25, 300, 100, 20);
        passLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(passLabel);

        //Create and add ConfirmPasswordLabel
        JLabel cpassLabel = new JLabel("Confirm Password");
        cpassLabel.setBounds(25, 340, 150, 20);
        cpassLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame2.add(cpassLabel);


        //Add the button to frame 2
        frame2.add(signup);
        frame2.add(signin);

        //Create an object
        app obj = new app();

        //Associate ActionListener with the buttons
        signup.addActionListener(obj);
        signin.addActionListener(obj);

        //Display
        frame2.setVisible(true);
    }

    public static void create_frame3() {
        //Create frame 3
        frame3 = new JFrame("Frame 3");
        frame3.setBounds(400, 50, 750, 750);
        frame3.setLayout(null);
        frame3.getContentPane().setBackground(new Color(135, 206, 235)); // Set background color to sky blue

        //To set a background image
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("D:\\Work\\linkpage7\\output-onlinepngtools (1).png"));
        background.setBounds(0, 0, 300, 500);
        background.setForeground(new Color(255, 255, 255, 128)); // 50% opacity
        contentPane.add(background);
        frame3.setContentPane(background);
        frame3.setLayout(null);

        //Add a new User logo to the Frame
        JLabel logoLabel2 = new JLabel();
        ImageIcon logoIcon = new ImageIcon("D:\\Work\\linkpage7\\next.png");
        logoLabel2.setIcon(logoIcon);
        logoLabel2.setBounds(50, 50, 75, 75);
        frame3.add(logoLabel2, BorderLayout.CENTER);

        // Create and add Registration Label
        JLabel registrationLabel = new JLabel("User Login");
        registrationLabel.setBounds(135, 50, 600, 100);
        registrationLabel.setFont(new Font("Showcard Gothic", Font.BOLD, 48));
        frame3.add(registrationLabel);


        //Create and add JText field for User Name
        JTextField userField = new JTextField();
        userField.setBounds(135, 200, 400, 30);
        userField.setOpaque(false);
        userField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame3.add(userField);

        //Create and add JText field for Password
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(135, 245, 400, 30);
        passwordField.setOpaque(false);
        passwordField.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame3.add(passwordField);

        //Create and add JLabel for password label
        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(25, 250, 100, 20);
        passwordLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame3.add(passwordLabel);

        //Create and add Login button
        login = new JButton("Login");
        login.setOpaque(false);
        login.setContentAreaFilled(false);
        login.setForeground(Color.BLACK);
        login.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        login.setBounds(500, 330, 150, 40);

        //Create and add back button
        back = new JButton("Back");
        back.setOpaque(false);
        back.setContentAreaFilled(false);
        back.setForeground(Color.BLACK);
        back.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        back.setBounds(35, 330, 150, 40);

        //Create and add user name label
        JLabel usernameLabel = new JLabel("ID Number");
        usernameLabel.setBounds(25, 205, 100, 20);
        usernameLabel.setFont(new Font("Times new Roman", Font.BOLD, 18));
        frame3.add(usernameLabel);

        //Add the button and password label to frame 3
        frame3.add(login);
        frame3.add(passwordLabel);
        frame3.add(back);

        //Create an object
        app obj = new app();

        //Associate ActionListener with the buttons
        login.addActionListener(obj);
        back.addActionListener(obj);

        //Display
        frame3.setVisible(true);
    }

    public static void create_frame4() {
        //Create frame 4
        frame4 = new JFrame("Frame 4");
        frame4.setBounds(400, 50, 750, 750);
        frame4.setLayout(null);
        frame4.getContentPane().setBackground(new Color(135, 206, 235)); // Set background color to sky blue

        //To set a background image
        JPanel contentPane = new JPanel();
        contentPane.setOpaque(false);
        contentPane.setLayout(null);
        JLabel background = new JLabel(new ImageIcon("D:\\Work\\linkpage7\\Hospital1.png"));
        background.setBounds(0, 0, 300, 500);
        background.setForeground(new Color(255, 255, 255, 128)); // 50% opacity
        contentPane.add(background);
        frame4.setContentPane(background);
        frame4.setLayout(null);

        //To Set a Hospital Name Label
        JLabel hospitallabel = new JLabel("District Hospital , Belagavi");
        hospitallabel.setBounds(175, 50, 600, 20);
        hospitallabel.setFont(new Font("Algerian", Font.BOLD, 22));
        frame4.add(hospitallabel);

        //Create About buttons
        about = new JButton("About");
        about.setFont(new Font("Times New Roman", Font.BOLD, 18));
        about.setForeground(Color.black);
        about.setBackground(new Color(255, 192, 203));
        about.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        about.setBounds(600, 30, 100, 50);

        //Create Record buttons
        record = new JButton("Record");
        record.setFont(new Font("Times New Roman", Font.BOLD, 18));
        record.setForeground(Color.black);
        record.setBackground(new Color(135, 206, 235));
        record.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        record.setBounds(600, 600, 100, 50);

        //Add the buttons to frame 4
        frame4.add(about);
        frame4.add(record);

        //Creating an Object
        app obj = new app();

        //Associate Action Listner with the Buttons
        about.addActionListener(obj);
        record.addActionListener(obj);

        //Display Frame 4
        frame4.setVisible(true);
    }

    public static void create_frame5() {
        //Create frame 5
        frame5 = new JFrame("Frame 5");
        frame5.setBounds(400, 50, 750, 750);
        frame5.setLayout(null);
        frame5.setBackground(Color.WHITE);

        //Create a JPanel to hold the horizontal lines
        JPanel linePanel = new JPanel(new GridLayout(2, 1));
        linePanel.setBounds(0, 230, 750, 2);
        linePanel.setBackground(Color.WHITE);

        //Create the JLabels with top borders
        JLabel line1 = new JLabel();
        line1.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
        linePanel.add(line1);

        JLabel line2 = new JLabel();
        line2.setBorder(BorderFactory.createMatteBorder(10, 0, 0, 0, Color.BLACK));
        linePanel.add(line2);

        //Add the line panel to the frame
        frame5.add(linePanel);

        //Add Hospital Name
        JLabel hospitallabel = new JLabel("District Hospital , Belagavi");
        hospitallabel.setBounds(175, 110, 600, 20);
        hospitallabel.setForeground(Color.RED);
        hospitallabel.setFont(new Font("Algerian", Font.BOLD, 22));
        frame5.add(hospitallabel);

        //Add a Karnataka Medical Council logo to the Frame
        JLabel logoLabel3 = new JLabel();
        ImageIcon logoIcon = new ImageIcon("D:\\Work\\linkpage7\\Karnataka1.jpg");
        logoLabel3.setIcon(logoIcon);
        logoLabel3.setBounds(550, 20, 200, 200);
        frame5.add(logoLabel3, BorderLayout.CENTER);

        //Add a Hospital Image
        JLabel logoLabel4 = new JLabel();
        ImageIcon logoIcon2 = new ImageIcon("D:\\Work\\linkpage7\\hospital (2).png");
        logoLabel4.setIcon(logoIcon2);
        logoLabel4.setBounds(50, 20, 200, 200);
        frame5.add(logoLabel4, BorderLayout.CENTER);

        //Create Logout Button
        logout = new JButton("Logout");
        logout.setForeground(Color.black);
        logout.setBackground(Color.RED);
        logout.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        logout.setBounds(5, 5, 100, 50);

        //Add the Button to the Frame 5
        frame5.add(logout);

        //Add hospital Column
        JTextArea area3 = new JTextArea();
        area3.setEditable(false);

        // Create and add Medical Label
        JLabel registrationLabel = new JLabel("Available Medical Facilities");
        registrationLabel.setBounds(10, 2, 300, 50);
        registrationLabel.setFont(new Font("Algerian", Font.BOLD, 18));
        area3.add(registrationLabel);
        area3.setLineWrap(true);
        area3.setWrapStyleWord(true);
        area3.setText("\n\n\n• Ambulatory surgical centers\n" +
                "• Birth centers\n" +
                "• Blood banks\n" +
                "• Clinics and medical offices\n" +
                "• Diabetes education centers\n" +
                "• Dialysis Centers\n" +
                "• Hospice homes\n" +
                "• Imaging and radiology centers\n" +
                "• Mental health and addiction treatment centers\n" +
                "• Hospital Infrastructure\n" +
                "• Feedback");

        area3.setFont(new Font("Times new Roman", Font.BOLD, 18));
        area3.setBounds(25, 250, 325, 450);
        area3.setBackground(new Color(223, 230, 233));
        area3.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        frame5.add(area3, BorderLayout.CENTER);

        JPanel panel = new JPanel(new BorderLayout());
        panel.setBackground(new Color(223, 230, 233));
        panel.setBounds(375, 240, 325, 470);
        JLabel label2 = new JLabel("Available Bed \n" +
                "Facilities", SwingConstants.CENTER);
        label2.setFont(new Font("Algerian", Font.BOLD, 20));
        panel.add(label2, BorderLayout.NORTH);

        // Create a table with 2 rows and 7 columns
        String[] columnNames = {"Classes","Available Beds"};
        Object[][] data = {
                {"Critical care beds", "150"},
                {"Curative (acute) \n" +
                        "care beds", "150"},
                {"Adjustable Hospital \n" +
                        "Beds", "150"},
                {"Specialty Hospital \n" +
                        "Beds", "150"},
                {"General", "150"},
                {"Blood Bank", "150"},
        };

        JTable table = new JTable(data, columnNames);
        table.setRowHeight(50);
        table.setBackground(new Color(223, 230, 233));
        table.setFont(new Font("Times New Roman", Font.PLAIN, 18));
        JScrollPane scrollPane = new JScrollPane(table);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Add padding to panel2
        panel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createEmptyBorder(10, 10, 10, 10),
                BorderFactory.createLineBorder(Color.BLACK)
        ));



        // add Panel to frame 5
        frame5.add(panel);
        //Create an Object
        app obj = new app();

        //Associate Action Listner
        logout.addActionListener(obj);

        //Display Frame 5
        frame5.setVisible(true);
    }
}