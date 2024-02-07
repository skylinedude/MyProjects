package RandomGame;

public class DoubleColon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
abc d=abcd::print;
int result=d.show(10,20);
System.out.println(result);
}

}
interface abc{
	
	 int show(int a,int b);
		
}
class abcd{
	public static int print(int a,int b) {
		return a+b;
	}
}