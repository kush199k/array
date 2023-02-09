public class array {
    public static void main(String[] args) {
        //smallest number of array

        int a[]={10,20,30,40,50,60,70,80,90,100,110,112};
        int n=a.length;
        System.out.println(n);
        int mn=a[5];
        for (int i=0;i<n;i++){
            if (a[i]<mn){
                mn=a[i];
            }
        }
        System.out.println(mn);
    }
}
