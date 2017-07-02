package Main3_1;
//你的程序要读入一系列正整数数据，输入-1表示输入结束，-1本身不是输入的数据。程序输出读到的数据中的奇数和偶数的个数。
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int jishu=0,oushu=0;
		Scanner in=new Scanner(System.in);
		do{
			a=in.nextInt();
			if(a!=-1)
			{
			if(a%2==0)
			{
				oushu++;
			}
			else
			{
				jishu++;
			}
		}
		}while(a!=-1);
		System.out.println(jishu+" "+oushu);
	}

}
