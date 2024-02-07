package RandomGame;

import java.util.Timer;
import java.util.TimerTask;

public class Game2 {
	static int pan1=(int) Math.floor(Math.random()*25+1) ;
	static int pan2=(int) Math.floor(Math.random()*25+1) ;
	
	static int pan3=(int) Math.floor(Math.random()*25+1) ;
	static int pan4=(int) Math.floor(Math.random()*25+1) ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Timer data = new Timer();

	        data.schedule(new TimerTask() {
	            @Override
	            public void run() {
	            	System.out.println("Generated numbers: " + pan1 + " and " + pan2);

	        		int sum = pan1 + pan2;

	        		System.out.println("Sum of the two numbers: " + sum);
	        		
	        		//System.out.println("\nGenerated numbers: " + pan3 + " and " + pan4);

	        		//int sum2 = pan3 + pan4;

	        		//System.out.println("Sum of the two numbers: " + sum2);
	            }
		
	            
	        },0,1000l);
	}
}
