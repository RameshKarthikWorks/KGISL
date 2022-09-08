abstract class students
{

abstract void studentlist();

}
public class college extends students
{
void studentlist()
{

System.out.println("The Students strength is 17");

}

public static void main (String args[])
{

students sc = new college();
sc.studentlist();

}

}