import java.util.Scanner;

public class IT24102967Lab05Q1 {
   public static void main(String[] args) {

	Scanner input = new Scanner(System.in);

	System.out.print("Enter the first integer: ");
	int fInt = input.nextInt();

	System.out.print("Enter the second integer: ");
	int sInt = input.nextInt();

	System.out.print("Enter the third integer: ");
 	int tInt = input.nextInt();


	System.out.println("user entered numbers are: "+fInt+" "+sInt+" "+tInt);

	int large = fInt;
	int small = sInt;

	if(sInt>large){
	large=sInt;}

	if (tInt>large){
	large=tInt;}

	if (fInt<small){
	small=fInt;}

	if (tInt<small){
	small=tInt;}

	System.out.println("The Smallest number is:"+small);

	System.out.println("The largest number is:"+large);

	input.close();
	}
}