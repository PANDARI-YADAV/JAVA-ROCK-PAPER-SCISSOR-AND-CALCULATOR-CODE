import java.util.Scanner;
import java.util.Random;
public class p {
    public static void main(String[] args) throws Exception {
       System.out.println("0= ROCK");
       System.out.println("1=Scissor");
       System.out.println("2=Paper");
       System.out.println("enter your choice");
        Scanner me = new Scanner(System.in);
        int a = me.nextInt();
        Random ra = new Random();
        int b = ra.nextInt(3);
        switch (a) {
            case 0: System.out.println("your choose: ROCK");
            break;
            case 1: System.out.println("your choose:Scissor");
            break;
            case 2: System.out.println("your choose:Paper");
            break;
            default: System.out.println("enter valid input");                
        }
        switch (b) {
            case 0 : System.out.println("computer choose:ROCK");
            break;
            case 1 : System.out.println("computer choose: Scissor");
            break;
            case 2 : System.out.println("computer choose:Paper");
        }
        if (a==0 && b==0 ||  a==1 && b==1 || a==2 && b==2) {
            System.out.println("draw");
        }
        else if (a==1 && b==0 || a==0 && b==1 || a==2 && b==1 || a==0 && b==2 ){
            System.out.println("computer win the game");
        }
        else if (a==2 && b==0 || a==1 && b==0 || a==1 && b==2 || a==0 && b==1){
            System.out.println("you win the game");
        }
        
    }
}