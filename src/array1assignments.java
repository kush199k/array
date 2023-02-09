import java.util.Scanner;

public class array1assignments {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       // int n= sc.nextInt();

        int arr[]={5,10,15,20,26};
        int x= sc.nextInt();
        int ans =5;
                for(int i=0;i< arr.length;i++){
                    if(arr[i]==x){
                        ans=i;
                    }
                }
        System.out.println("found "+x+" on the index  "+ans);



    }
}
