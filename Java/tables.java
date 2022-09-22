import java.util.Scanner;

public class tables {

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=n.nextInt();
        System.out.println("Enter the limit:");
        int num2=n.nextInt();
        int res;

        for (int i=1;i<=num2;i++)
        {

            res= num*i;
            System.out.println(num+" "+"*"+i+" ="+res);
        }
        
    }
    
}
