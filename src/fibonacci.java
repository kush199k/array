import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 13
        Scanner sc= new Scanner(System.in);
        int a=0;
        int b=1;
        //System.out.println(a+" "+b);
        int c ;
        for(int i=1;i<sc.nextInt();i++){
           // System.out.println(a);
            c=a+b;

          //  System.out.println(" "+c);
            a=b;
            b=c;
           // int lastdigits = c % 10;

           // lastdigits++;
            System.out.println(+c);
           // System.out.println(lastdigits);

        }


       // System.out.println(lastdigits);
    }
}
