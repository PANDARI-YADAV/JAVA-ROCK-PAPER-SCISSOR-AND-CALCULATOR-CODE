import java.util.Scanner;

class Calculator2 extends Exception{
    public void calculator2(string massage){
        System.out.println("invalid input or u entered the maximum number");

}

}
 class CalculatorException{
      public   static int  add(int a , int b) throws Calculator2{
        if (a<100 && b<100) {
            throw new Calculator2();
        }
        return a+b ;
      }
      public static int sub(int a, int b) throws Calculator2{
        if(a<100 && b<100){
            throw new Calculator2();
        }
        return a-b;
      }
      public static int  div(int a, int b) throws Calculator2{
        if(a<100 && b<100){
            throw new Calculator2();
        }
        if (b==0){
            try{
                return a/b ;
            } catch(Exception e){
                    System.out.println(e);
            }
        
        }
        return a/b ;
      }
      public static int multi(int a , int b) throws Calculator2{
        if(a<100 && b<100){
             throw new Calculator2();
        }
        return a*b ;
      }
   
}


public class k{
public static void main(String[] args) {
    CalculatorException fire = new CalculatorException() ;
    
    Scanner me = new Scanner(System.in);
   

    System.out.println("enter the choice which shoud be do.....");
    int bh = me.nextInt();
    switch (bh) {
        case 1:System.out.println("enter two numbers");
                int a =me.nextInt();
                int b = me.nextInt();
               int  res = a+b ;
               try{
               System.out.println("sum of two numbers are "+res);

               } catch(Exception e){
                System.out.println(e);
               }
            break;
        case 2: System.out.println("enter two numbers");
                int a1 =me.nextInt();
                int b1 = me.nextInt();
               int  res1 = a1-b1 ;
               try{
               System.out.println("sum of two numbers are "+res1);

               } catch(Exception e){
                System.out.println(e);
               }
            break;
         case 3: System.out.println("enter two numbers");
                int a2 =me.nextInt();
                int b2 = me.nextInt();
               int  res2 = a2*b2 ;
               try{
               System.out.println("sum of two numbers are "+res2);

               } catch(Exception e){
                System.out.println(e);
               }
            break;
          case 4:System.out.println("enter two numbers");
                int a3 =me.nextInt();
                int b3 = me.nextInt();
               int  res3 = a3/b3 ;
               try{
               System.out.println("sum of two numbers are "+res3);

               } catch(Exception e){
                System.out.println(e);
               }
            break;
        default: System.out.println("sorry you did not choosed any one");
            break;
    }
}
}
