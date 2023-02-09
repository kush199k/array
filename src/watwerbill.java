import java.util.Scanner;

public class watwerbill {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int w=sc.nextInt();
        int bill=0;
       //public static int waterBill(int w){
            if (w<=100){
                bill=w*15;
                System.out.println(bill);

            } else if (w>100&&w<=200){
                bill=w*14;
                System.out.println(bill);


            }
            while (w>200){
                System.out.println(w*12);

            }
        }
    }


