import java.util.*;
public class Ascendingorder {


    public static void main(String[] args) {

        System.out.println("Enter the values");
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("Enter the Array Values");
        int arr[] = new int[n];

        for (int i=0;i<=n;i++)
        {
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("The Array values are"+arr[i]);
        }

        
    
    }
    
}
