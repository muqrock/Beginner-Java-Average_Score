import java.util.Scanner;
class AverageScore
{
  public static void main (String[]args)
  {
   Scanner input = new Scanner (System.in);
   System.out.print("Enter your Bahasa Melayu score: ");
   int BM = input.nextInt();
   System.out.print("Enter your Math score: ");
   int MT = input.nextInt();
   System.out.print("Enter your English score: ");
   int EN = input.nextInt();
   System.out.print("Enter your Science score: ");
   int SC = input.nextInt();
   System.out.print("Enter your History score: ");
   int HS = input.nextInt();

   System.out.println("Average is = " +(+BM + +MT + +EN + +SC + +HS)/5);
   input.close();
 }
}
  