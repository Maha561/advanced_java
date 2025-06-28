
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
        ActionListener output = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // we need to display out output
                System.out.println(emailInput.getText());
                System.out.println(passwordInput.getText());
                System.out.println(ageInput.getText());

            }
        };
        button.addActionListener(output);


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

    public static void main(String[] args) {
        new Simple();
    }

}

