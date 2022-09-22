import java.util.Arrays;

public class insertarray {

    public static void main(String[] args) {
        int a[]={10,20,40,50,60,70,80};

        int index=2;
        int value=30;
        System.out.println(Arrays.toString(a));

        for (int i=a.length-1;i>index;i--)
        {
            a[i]=a[i-1];
         System.out.println(a[i]);

        }

        a[index]=value;
        System.out.println(Arrays.toString(a));


       
    }
    
}
