package Main;
//°„F = (9/5)*°„C + 32
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f;
		Scanner in=new Scanner(System.in);
		f=in.nextInt();
		System.out.println((int)((5.0/9)*(f-32)));
	}

}
