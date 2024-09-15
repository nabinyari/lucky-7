import java.util.Scanner;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scr = new Scanner(System.in);
       Random random = new Random();
       for(int i= 0; i<3; i++)
       {
        int randNum = random.nextInt(10)+1;
        System.out.println(randNum);
        if(randNum == 7)
        {
            System.out.println("You won.");
        }
        else
        {
            System.out.println("You lost.");
        }
       }

    }
}
 