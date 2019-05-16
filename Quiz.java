import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class Quiz {

    public static void main(String[] args){
        int correct = 0;
        int incorrect = 0;
        int notValid = 0;
        double random = Math.random() * 3;
        String[] entry = {"Are you a pretty cool guy?", "Are you good at math?", "Do you like Football?\n" +
                "Would you like some chicken?", "Do you care about the environment", "Could you help that guy?\n" +
                "Would you like a back rub?", "Do you know the muffin man?", "Are you a loser?\n" +
                "Are you excited for summer?", "Would you take this quiz again?"};
        String[] answers = {"Correct", "Incorrect", "Not Valid"};
        boolean quit = true;

        while (quit) {
            String name = JOptionPane.showInputDialog(null, "Please enter A: Yes, B: No, C: I don't know");
            for(int i = 0; i < entry.length; i++){
                System.out.println(entry[i]);

                if(answers.equals("A")){
                    random = correct;
                }
                if(answers.equals("B")){
                    random = incorrect;
                }
                if(answers.equals("B")){
                    random = notValid;
                }
            }
            if(name.equals("quit")){
                quit = false;
            }
        }
        System.out.println("Customer names are " + entry);
    }
}
