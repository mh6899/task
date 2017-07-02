package Main2;
//UTC是世界协调时，BJT是北京时间，UTC时间相当于BJT减去8。

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bjt;
		int utc;
		Scanner in=new Scanner(System.in);
		bjt=in.nextInt();
		if(bjt>=800)
		{
			utc=bjt-800;
		}
		else 
		{
			utc=bjt+1600;
		}
		System.out.println(utc);
	}

}
