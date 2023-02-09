import java.util.Scanner;

public class integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

     if (a>b) {
         if (a > c) {
             System.out.println(a);
         }
     }
      if (b>c) {
          if (b > a) {
              System.out.println(b);
          }
      }
      else{
          System.out.println(c);



     }
     }
    }