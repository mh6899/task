package Main2_2;
/*
���ߵ�̨��RS���źű�������������������ɵģ�
R(Readability) �źſɱ�ȼ�������.
S(Strength)    �ź�ǿ�ȼ���С.
����Rλ�ڱ����һλ������5������1��5���ֱ�ʾ.
1---Unreadable
2---Barely readable, occasional words distinguishable
3---Readable with considerable difficulty
4---Readable with practically no difficulty
5---Perfectly readable
����ڶ�λ��S�����־Ÿ�������1��9�е�һλ���ֱ�ʾ
1---Faint signals, barely perceptible
2---Very weak signals
3---Weak signals
4---Fair signals
5---Fairly good signals
6---Good signals
7---Moderately strong signals
8---Strong signals
9---Extremely strong signals
һ���������źű��档������ʮλ���ֱ�ʾ�ɱ�ȣ���λ���ֱ�ʾǿ�ȡ�
*/

import java.util.Scanner;
	public class Main {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int signal;
			Scanner in=new Scanner(System.in);
			signal=in.nextInt();
			switch((signal%10)) 
			{
			case 1:System.out.print("Faint signals, barely perceptible");break;
			case 2:System.out.print("Very weak signals");break;
			case 3:System.out.print("Weak signals");break;
			case 4:System.out.print("Fair signals");break;
			case 5:System.out.print("Fairly good signals");break;
			case 6:System.out.print("Good signals");break;
			case 7:System.out.print("Moderately strong signals");break;
			case 8:System.out.print("Strong signals");break;
			case 9:System.out.print("Extremely strong signals");break;
			}
			System.out.print(", ");
			switch((signal/10))
			{
			case 1:System.out.print("unreadable");break;
			case 2:System.out.print("barely readable, occasional words distinguishable");break;
			case 3:System.out.print("readable with considerable difficulty");break;
			case 4:System.out.print("readable with practically no difficulty");break;
			case 5:System.out.print("perfectly readable");break;
			}
			System.out.println(".");
		}
}
