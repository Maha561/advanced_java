import java.util.*;
import java.awt.*;
class Simple extends Frame{
    // creating a button - create inside a constructor
    Simple(){
        Button btn1 = new Button("click me");
        // setting our own layout
        btn1.setBounds(100,100,100,50);

        Label label = new Label(" this is label");
        add(btn1);
        add(label);
        // to get input from the user in 1 line
        TextField textField = new TextField(" enter you name");
        add(textField);
        // for more than 1 line input
        TextArea textArea = new TextArea(" enter your reason");
        add(textArea);
        //Checkbox
        Checkbox checkbox = new Checkbox(" male");
        add(checkbox);
        // choices
        Choice choice = new Choice();
        choice.add(" python");
        choice.add(" java");
        choice.add(" c++");
        add(choice);


        // set layout - style
        setLayout(null);
        setVisible(true);
        setSize(500,500);


    }

    public static void main(String[] args) {
        new Simple();
    }

}

