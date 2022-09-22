import java.util.Scanner;
public class armstrongnumber
{
    public static void main (String args[])
    {
    

        int firstdigit,seconddigit,thirddigit,temp;

        for (int number=100;number<=999;number++)
        {

            temp=number;

            thirddigit= temp%10;  
            temp=temp/10;

            seconddigit =temp%10;
            temp=temp/10;

            firstdigit = temp%10;

            int result =(firstdigit*firstdigit*firstdigit)+(seconddigit*seconddigit*seconddigit)+(thirddigit*thirddigit*thirddigit);

        if (number==result)
        {
            System.out.println("It is a armstrong number"+result);
        }

        }

    }
}