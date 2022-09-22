import java.util.Scanner;

public class multidimensional {

    public static void main(String[] args) {
        
    Scanner in= new Scanner(System.in);
    System.out.println("Enter the value:");
    int n=in.nextInt();
    
    System.out.println("Enter the array value of m:");
    int m=in.nextInt();

    System.out.println("Enter the array value of O:");
    int o=in.nextInt();




    int arr[][] = new int[m][o];

   

    for (int i=0;i<n;i++)
    {
        for(int j=0;j<n;j++)
        {
            arr[i][j]= in.nextInt();

            System.out.println("Row"+arr[i]+"Column" +arr[j]);

        }
    
        }

        System.out.println(arr[m][m]);

        

    
    }
    
}
