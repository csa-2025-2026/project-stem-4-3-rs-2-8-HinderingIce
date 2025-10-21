import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    //  for(int i; i <= 25; i++)
    //  {
    //     System.out.println(i);
    //  }

    // for(int i = 17; i <= 73;)
    // {
    //   for(int e = 1; e <= 10 && i <= 73; e++)
    //   {
    //     System.out.print(i + " ");
    //     i++;
    //   }
    //   System.out.println();
    // }
    int a =sc.nextInt();

    if (a < 0)
    {
      System.out.println("error");
    }
    else
    {
      for(int i = a; i <= 50;)
    {
      for(int e = 1; e <= 5 && i <= 50; e++)
      {
        System.out.print(i + " ");
        i++;
      }
      System.out.println();
    }
    }

    sc.close();
  }
}
