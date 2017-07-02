package Main;
//¡ãF = (9/5)*¡ãC + 32
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	
		int f;
		Scanner in=new Scanner(System.in);
		f=in.nextInt();
		System.out.println((int)((5.0/9)*(f-32)));
		
		in.close();
	}

}
