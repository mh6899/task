package Main3_2;
////������������ֵ�ǳ��õı����㷨����ż������һ�ּ򵥵�����ֵ��
////����һ��������һ���Ǹ������������ķ�Χ��[0,100000]���Ӹ�λ��ʼ��ÿһλ���ֱ�ţ���λ��1�ţ�ʮλ��2�ţ��Դ����ơ���������ڵ�nλ�ϵ����ּ���x��
////���x��n����ż����ͬ�������һ��1���������һ��0������������˳��Ѷ�Ӧλ�ı�ʾ��ż�Ե�0��1����¼���������γ���һ�����������֡�
////�������Ӧ��ʮ����ֵ
//
//import java.util.Scanner;
//public class Main {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in=new Scanner(System.in);
//		int a,jiou,b,c;
//		int shu=0;
//		int shuzuber=in.nextInt();
//		for(int i=5;i>=0;i--)
//		{
//			a=(int) (shuzuber/(Math.pow(10, i)));
//			jiou=i%2;
//			if(a%2==jiou)
//			{
//				c=0;
//			}
//			else
//			{
//				b=1;
//				c=(int) (b*(Math.pow(2, i)));
//			}
//		shu=shu+c;
//		}
//		System.out.println(shu);
//	}
//
//}
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a,jiou,b,e;
		int c=1,d=1;
		int shu=0;
		int shuzuber=in.nextInt();
		a=shuzuber;
		for(int i=0;i<6;i++)
		{
			b=a%10;
			a=a/10;
			jiou=(i+1)%2;
			if(b%2==jiou)
			{
				c=1;
			}
			else
			{
				c=0;
			}
			e=c*d;
			d=d*2;
		shu=shu+e;
		}
		System.out.println(shu);
	}

}
