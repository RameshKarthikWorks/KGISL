public class image1
{
void bike()
{
System.out.println("I love my Bike");
}

}

public class image2
{

void car()
{

System.out.println("I love my Car");

}
}

public class image3 extends image2,image1
{

public static void main (String args[])
{

image3 img = new image3();

img.bike();

}

}