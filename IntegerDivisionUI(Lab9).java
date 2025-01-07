import java.awt.*;
import java.awt.event.*;

public class IntegerDivisionUI 
{
    private Frame frame;
    private TextField num1Field;
    private TextField num2Field;
    private TextField resultField;

    public IntegerDivisionUI() 
    {
        frame = new Frame("Integer Division");
        frame.setLayout(new FlowLayout());

        frame.add(new Label("Enter Num1: "));
        num1Field = new TextField(10);
        frame.add(num1Field);

        frame.add(new Label("Enter Num2: "));
        num2Field = new TextField(10);
        frame.add(num2Field);

        frame.add(new Label("Result: "));
        resultField = new TextField(10);
        resultField.setEditable(false);
        frame.add(resultField);

        Button divideButton = new Button("Divide");
        frame.add(divideButton);

        divideButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                try 
                {
                    String num1Text = num1Field.getText();
                    String num2Text = num2Field.getText();

                    int num1 = Integer.parseInt(num1Text);
                    int num2 = Integer.parseInt(num2Text);

                    int result = num1 / num2;
                    resultField.setText(String.valueOf(result));
                } 
                catch (NumberFormatException ex) 
                {
                    showErrorDialog("Error: Please enter valid integers.");
                } 
                catch (ArithmeticException ex) 
                {
                    showErrorDialog("Error: Cannot divide by zero.");
                }
            }
        });

        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });
    }

    private void showErrorDialog(String message) 
    {
        Dialog errorDialog = new Dialog(frame, "Error", true);
        errorDialog.setSize(250, 100);
        errorDialog.setLayout(new FlowLayout());

        Label errorLabel = new Label(message);
        errorDialog.add(errorLabel);

        Button okButton = new Button("OK");
        okButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e) 
            {
                errorDialog.setVisible(false);
            }
        });
        errorDialog.add(okButton);

        errorDialog.setVisible(true);
    }

    public static void main(String[] args) 
    {
        new IntegerDivisionUI();
    }
}
