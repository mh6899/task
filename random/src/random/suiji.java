package random;
		import java.util.Random;
public class suiji {


		    public static void main(String[] args) {
		        int max=10000000;
		        int min=1000000;
		        Random random = new Random();
		        int s = random.nextInt(max)%(max-min+1) + min;
		        System.out.println(s);
	}

}
