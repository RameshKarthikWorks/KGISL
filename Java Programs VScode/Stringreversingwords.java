public class Stringreversingwords {

    public static void main(String[] args) {
        

       String words ="I love my india";

       String len[] =words.split(" ");

       String rev="";

       for (int i=len.length-1;i>=0;i--)
       {

        rev =rev+ len[i]+" ";

       }


       System.out.println(rev);




    }
    
}
