public class primenumbers{

    public static void main (String args[])
    {
       
        int f=0;
        int i;
  for (int num=1;num<=20;num++)
  {
    for (i=1;i<=num;i++)
    {
        if(num%i==0)
        {
            f++;
        }
    }
        if(f==2)
        {
            System.out.println("The number is prime number"+num);

        }
    }
      f=0;

    }
    
}

