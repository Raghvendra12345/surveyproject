// import javax.swing.*;

// public class SurveyApp extends JFrame {
//     // GUI components
//     private JLabel questionLabel;
//     private JRadioButton option1, option2, option3;
//     private JButton nextButton;

//     public SurveyApp() {
//         super("Online Survey");

//         // Initialize GUI components
//         questionLabel = new JLabel("What is your favorite color?");
//         option1 = new JRadioButton("Red");
//         option2 = new JRadioButton("Blue");
//         option3 = new JRadioButton("Green");
//         nextButton = new JButton("Next");

//         // Add components to the frame
//         JPanel panel = new JPanel();
//         panel.add(questionLabel);
//         panel.add(option1);
//         panel.add(option2);
//         panel.add(option3);
//         panel.add(nextButton);
//         add(panel);

//         // Set frame properties
//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         setSize(400, 200);
//         setLocationRelativeTo(null); // Center the frame
//         setVisible(true);
//     }

//     public static void main(String[] args) {
//         SwingUtilities.invokeLater(SurveyApp::new);
//     }
// }


import javax.swing.*;

public class SurveyApp extends JFrame {
    // GUI components
    private JLabel questionLabel;
    private JTextField answerField; // Text field for open-ended questions
    private JRadioButton option1, option2, option3; // Radio buttons for single-choice questions
    private JCheckBox checkBox1, checkBox2, checkBox3; // Checkboxes for multiple-choice questions
    private JButton nextButton;

    public SurveyApp() {
        super("Online Survey");

        // Initialize GUI components
        questionLabel = new JLabel("What is your favorite color?");
        answerField = new JTextField(20); // For open-ended questions
        option1 = new JRadioButton("Red");
        option2 = new JRadioButton("Blue");
        option3 = new JRadioButton("Green");
        checkBox1 = new JCheckBox("Option 1");
        checkBox2 = new JCheckBox("Option 2");
        checkBox3 = new JCheckBox("Option 3");
        nextButton = new JButton("Next");

        // Group radio buttons to make them mutually exclusive
        ButtonGroup radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(option1);
        radioButtonGroup.add(option2);
        radioButtonGroup.add(option3);

        // Add components to the frame
        JPanel panel = new JPanel();
        panel.add(questionLabel);
        panel.add(answerField);
        panel.add(option1);
        panel.add(option2);
        panel.add(option3);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(nextButton);
        add(panel);

        // Set frame properties
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // Center the frame
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SurveyApp::new);
    }
}

