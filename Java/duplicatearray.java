public class duplicatearray {

    public static void main(String[] args) {
        
        int a[]={1,2,5,2,6,7,5};

        for (int i=0;i<a.length-1;i++)
        {
            for (int j=i+1;j<a.length;j++)
            {
                if (a[i]==a[j])
                {

                int temp=a[i];
                System.out.println(temp);
                }
//                 else if (!(a[i]==a[j]))
//                 {
// int nondup=a[j];
// System.out.println(nondup);
//                 }

               
               
            }
        }


    }
    
}
