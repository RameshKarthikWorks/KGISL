public class reverse

{

public static void main (String args[])
{

String name="I Love my work";

String revstr="";

char ch;

for(int i=0;i<name.length();i++)
{
   ch= name.charAt(i);
   revstr = ch+revstr;
   }
   
   System.out.println("The reverse words are"+" "+ revstr);
}
}