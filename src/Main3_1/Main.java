package Main3_1;
//��ĳ���Ҫ����һϵ�����������ݣ�����-1��ʾ���������-1��������������ݡ�������������������е�������ż���ĸ�����
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
