import java.util.*;
public class tables {
    
    public static void main(String[] args) {

        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num  = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println("The table value is "+num +"X"+ i + " "+"="+(num*i));
        }


    }
}
