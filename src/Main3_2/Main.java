package Main3_2;
////对数字求特征值是常用的编码算法，奇偶特征是一种简单的特征值。
////对于一个整数，一个非负整数，整数的范围是[0,100000]。从个位开始对每一位数字编号，个位是1号，十位是2号，以此类推。这个整数在第n位上的数字记作x，
////如果x和n的奇偶性相同，则记下一个1，否则记下一个0。按照整数的顺序把对应位的表示奇偶性的0和1都记录下来，就形成了一个二进制数字。
////输出它对应的十进制值
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
