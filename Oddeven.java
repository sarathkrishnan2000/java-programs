import java.util.Scanner;
import java.lang.Math;
public class Oddeven{
    public static void main(String  args[]) {
      Scanner reader=new Scanner(System.in);
      System.out.print("Enter a number:");
      int x=reader.nextInt();
      if(x%2==0)
      {
      System.out.println("Number "  + x +  " is Even");
      }
      else
      {
       System.out.println("Number "  + x +  " is Odd");   
      }
    }
}
