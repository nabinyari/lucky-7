import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scr = new Scanner(System.in);
       Random random = new Random();
       System.out.println("*****Note:");
       System.out.println("          1- You have 5 euro for this game.");
       System.out.println("          2- If you get one 7 number then 3 euro will be added to your balance.");
       System.out.println("          3- If you get two 7 number then 5 euro will be added to your balance.");
       System.out.println("          4- If you get three 7 number then 10 euro will be added to your balance.");
       System.out.println(" ");
       System.out.println("How much money does you want to spend?");
       int money = scr.nextInt();
       System.out.println(" ");
       System.out.println(" ");
       //int money = 5;
       Scanner scr2 = new Scanner(System.in);
       String userInput;
       do{
        int ranNum1 = random.nextInt(10)+1;
        System.out.println( ranNum1);
        int ranNum2 = random.nextInt(10)+1;
        System.out.println( ranNum2);
        int ranNum3 = random.nextInt(10)+1;
        System.out.println( ranNum3);
        if(ranNum1 == 7 && ranNum2 == 7 && ranNum3 == 7)
        {
            System.out.println("You won!");
            money = (money-1) + 10;
        }
        else if(ranNum1 == 7 && ranNum2 == 7)
        {
           System.out.println("You won!");
           money = (money-1) + 5;
        }
        else if(ranNum1 == 7 || ranNum2 == 7 || ranNum3 == 7 )
            {
                System.out.println("You won!");
                money = (money-1) + 3;
            }
        else
        {
            System.out.println("You lost!");
            money--;
        }
        System.out.println("Do you want to play again if yes press 'yes' or 'no' for not to play:");
        userInput = scr2.nextLine();
       }while(!userInput.equals("no"));
    }
}
