public class highestarr{

public static void main (String args[])
{


int arr[] ={2,5,6,8,10,12,13,14,15,16};

for (int i=0;i<arr.length-1;i++)
{

for (j=i+1;j<=i;j++)
{

if(arr[i]<arr[j])
{

temp=arr[i];
arr[j]=arr[i];
arr[j]=temp;

System.out.println(temp);

}

}
}

}


