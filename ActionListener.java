
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.awt.*;
class Simple extends Frame{
    // creating a button - create inside a constructor
    Simple(){
        Label email = new Label("Email :");
        email.setBounds(50,130,100,30);
        TextField emailInput = new TextField();
        emailInput.setBounds(170,130,100,30);

        Label password = new Label("password :");
        password.setBounds(50,170,100,30);
        TextField passwordInput = new TextField();
        passwordInput.setBounds(170,170,100,30);

        Label age = new Label("age :");
        age.setBounds(50,210,100,30);
        TextField ageInput = new TextField();
        ageInput.setBounds(170,210,100,30);

        Button button = new Button("Submit");
        button.setBounds(200,270,100,30);

        // creating object
        ButtonListener listener = new ButtonListener(emailInput,passwordInput,ageInput);
        button.addActionListener(listener);
        add(email);
        add(password);
        add(age);
        add(emailInput);
        add(passwordInput);
        add(ageInput);
        add(button);


        // set layout - style
        setLayout(null);
        setVisible(true);
        setSize(700,900);


    }
    class ButtonListener implements ActionListener{
        TextField emailInput;
        TextField passwordInput;
        TextField ageInput;
        // constructor
        ButtonListener(TextField emailInput,TextField passwordInput,TextField ageInput){

            this.emailInput = emailInput;
            this.passwordInput=passwordInput;
            this.ageInput=ageInput;
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(emailInput.getText());
            System.out.println(passwordInput.getText());
            System.out.println(ageInput.getText());


        }
    }
    

    public static void main(String[] args) {
        new Simple();
    }

}

