import java.util.Scanner;

public class contest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];

        for (int i=1;i<=(size-1);i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i=1;i<=(size-1);i++)
        {
            System.out.println(arr[i]);
        }

    }
}
