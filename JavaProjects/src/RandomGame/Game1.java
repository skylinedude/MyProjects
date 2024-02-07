package RandomGame;

public class Game1 {

	public static void main(String[] args) {

		
		int ran1=(int) Math.floor(Math.random()*25+1) ;
		int ran2=(int) Math.floor(Math.random()*25+1) ;
		
		int ran3=(int) Math.floor(Math.random()*25+1) ;
		int ran4=(int) Math.floor(Math.random()*25+1) ;

		System.out.println("Generated numbers: " + ran1 + " and " + ran2);

		int sum = ran1 + ran2;

		System.out.println("Sum of the two numbers: " + sum);
		
		System.out.println("\nGenerated numbers: " + ran3 + " and " + ran4);

		int sum2 = ran3 + ran4;
		sum2++;

		System.out.println("Sum of the two numbers: " + sum2);


	}

}
