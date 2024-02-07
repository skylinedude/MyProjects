package RandomGame;

public class Bank2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sbi employee=new Sbi();
		System.out.println(employee.name);
		System.out.println(employee.ac);
		
		employee.getAmount(12345);
		employee.setPin(1234);
		


	}

}


class Sbi{
	String name="Manoj";
	int ac=1234567;
	int mobile=1234455665;
	 private int atmPin=1234;
	 private int ammount=100;
	 
	void getAmount(int pin) {
		if( pin==atmPin) {
			System.out.println(ammount);

		}else {
			System.out.println("Incoreect pin");
		}
		
	}
	void setPin(int newPin) {
		if(newPin==atmPin) {
			atmPin=newPin;
			System.out.println("new pin has been set:-- "+atmPin);
		}
		else {
			System.out.println("Incorrect pin again");
		}
	}
}



