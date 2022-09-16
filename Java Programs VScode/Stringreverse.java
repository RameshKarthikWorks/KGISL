public class Stringreverse {

    public static void main(String[] args) {
        
        String str= "Ramesh";


        String rev="";

        char letter;

        for(int i=0;i<str.length();i++)
        {
             letter=str.charAt(i);

             rev = letter+rev;

        }

        System.out.println(rev);
    }

}
