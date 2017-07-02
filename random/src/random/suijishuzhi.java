package random;

//import java.util.Random;

public class suijishuzhi extends suiji {

	    public static void main(String[] args) {

       
        
        
//        int min=1000000;
//        Random random = new Random();
	//        int s = random.nextInt(max)%(max-min+1) + min;
		for(int n=1;n<=10;n++)
			//循环生成10组数值
			{
	        int a= (int)(Math.random()*10);
	        int b= (int)(Math.random()*10); //随机出0-9的整数
		       
		        switch(a)
		        {
		        case 0:
		        	System.out.println(13.1);	break;	
		        case 1:
		        	System.out.println(13.1);	break;	        
		        case 2:
		        	System.out.println(13.1);	break;	
		        case 3:
		        	System.out.println(13.7);	break;	
		        case 4:
		        	System.out.println(13.7);	break;	
		        case 5:
		        	System.out.println(13.2);	break;	
		        case 6:
		        	System.out.println(13.5);	break;	
		        case 7:
		        	System.out.println(13.8);	break;	
		        case 8:
		        	System.out.println(14.1);	break;	
		        case 9:
		        	System.out.println(14.5);	break;	
  
			     }
		        
		        System.out.print("\t");
//		        System.out.print("\b");
		        
			    switch(b)
			    {
		        case 0:
		        	System.out.println(37.1);	break;	
		        case 1:
		        	System.out.println(38.1);	break;	
		        case 2:
		        	System.out.println(38.7);	break;	
		        case 3:
		        	System.out.println(38.7);	break;	
		        case 4:
		        	System.out.println(40.5);	break;	
		        case 5:
		        	System.out.println(41.2);	break;	
		        case 6:
		        	System.out.println(41.9);	break;	
		        case 7:
		        	System.out.println(42.3);	break;	
		        case 8:
		        	System.out.println(43.2);	break;	
		        case 9:
		        	System.out.println(44.3);	break;	

		        } 
			}
	}
 }