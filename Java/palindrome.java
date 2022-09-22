public class palindrome {
	
  public static void main(String[] args) {

    String name = "Kamala", revstr = "";
    
    int len = name.length();

    for (int i = (len - 1); i >=0; --i) {
      revstr = revstr + name.charAt(i);
    }

    if (name.equals(revstr)) {
      System.out.println(name+ " is a Palindrome String");
    }
    else {
      System.out.println(name + " is not a Palindrome String");
    }
  }
}