// LAB Assingment04_04
import java.util.Scanner;
public class Coding_Task_04
{
  public static void main(String [] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of N: ");
    int N = sc.nextInt();
    int count = 0;
    boolean is_prime = true;
    for( int i = 2 ; true ; i++ )
    {
      is_prime = true;
      for( int j = 2 ; j < ((i/2)+1) ; j++ )
      {
        if (j%i == 0) {
          is_prime = false;
          break;
          }
      }
      if( is_prime == true )
      {
        count++;
        System.out.println(i);
      }
      if( N == count )
      {
        break;
      }
    }
  }
}