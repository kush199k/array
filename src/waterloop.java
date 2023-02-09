import java.util.Scanner;

public class waterloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
int w= sc.nextInt();

        int waterBill = 0;
        if(w<=100){
            waterBill=w*15;
            System.out.println(waterBill);
        }
        else if((w>100) && (w<=200) ){
            waterBill=100*15+(w-100)*14;
            System.out.println(waterBill);
        }
		else if(w>200){
            waterBill=(100*15)+(100*14)+(w-200)*12;
            System.out.println(waterBill);
        }
       // System.out.println(waterBill);
    }
}
