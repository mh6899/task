package Main2;
//UTC������Э��ʱ��BJT�Ǳ���ʱ�䣬UTCʱ���൱��BJT��ȥ8��

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
