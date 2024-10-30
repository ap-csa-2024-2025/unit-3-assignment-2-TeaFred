import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    //Problem 1
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a double: ");
    double num1 = sc.nextDouble();

    if(num1 == 12.345){
      System.out.println("YES");
    }
    //Problem 2
    System.out.println("Enter an integer: ");
    int num2 = sc.nextInt();

    if(num2 == 48){
      System.out.println("YES");
    }
    //Problem 3
    System.out.println("Enter two integers: ");
    int num3 = sc.nextInt();
    int num4 = sc.nextInt();

    if((2*num3) == num4){
    System.out.println("YES");  
    }

    //Problem 4
    System.out.println("Enter two integers: ");

    int num5 = sc.nextInt();
    if(num5%2 == 0){
      System.out.println("Divisible by 2!");
    }
    if(num5%3 == 0){
      System.out.println("Divisible by 3!");
    }
    if((num5%2 == 0) && (num5%3 == 0)){
      System.out.println("Divisible by 2!\n" + "Divisible by 3!");
    }

    //Problem 5
    System.out.println("Enter an integer: ");
    int num6 = sc.nextInt();

    if(num6%2 == 0)
    {
      System.out.println(num6 + "\nEven");
    }
    else
    {
      System.out.println(num6 + "\nOdd");    
    }

    //Problem 6
    System.out.println("Type in a letter grade: ");
    String word1 = sc.nextLine();

    if ((word1.compareTo("F") > 0) || (word1.compareTo("E") == 0))
    {
      System.out.println("Invalid letter grade");
    }
    else
    {
      if (word1.compareTo("A") == 0){
        System.out.println("90-100");
      }
      if (word1.compareTo("B") == 0){
        System.out.println("80-90");
      }
      if (word1.compareTo("C") == 0){
        System.out.println("70-80");
      }
      if (word1.compareTo("D") == 0){
        System.out.println("60-70");
      }
      if (word1.compareTo("F") == 0){
        System.out.println("0-60");
      }
    }
    
    //Problem 7
    int num7 = ((int)Math.random()*51);
    int num8 = ((int)Math.random()*50) + 51;

    System.out.println("What is " + num7 + " + " + num8 + " = ?");
    int num9 = sc.nextInt();

    if((num7+num8) == num9)
    {
      System.out.println("Correct!");
    }
    else
    {
      System.out.println("Incorrect!");
    }

    //Problem 8
    System.out.println("What is the temperature?");

    int num10 = sc.nextInt();
    if ( (num10 >=97) && (num10 <=99) )
    {
      System.out.println("Temperature is OK");
    }
    else
    {
      System.out.println("NOT NORMAL");
    }
  }
}
