package RandomGame;

public class Months {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ran=(int) Math.floor(Math.random()*12+1) ;
        System.out.println("The Number:"+ran);
        switch(ran) {
        case 1: System.out.println("Month: January");
        break;
        case 2: System.out.println("Month: Ferbruary");
        break;
        case 3: System.out.println(" Month:March");
        break;
        case 4: System.out.println("Month: April");
        break;
        case 5: System.out.println("Month: May");
        break;
        case 6: System.out.println("Month: June");
        break;
        case 7: System.out.println("Month: July");
        break;
        case 8: System.out.println("Month: August");
        break;
        case 9: System.out.println("Month: September");
        break;
        case 10: System.out.println("Month: October");
        break;
        case 11: System.out.println("Month: November");
        break;
        case 12: System.out.println("Month: December");
        }
	}

}
