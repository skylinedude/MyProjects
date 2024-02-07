package RandomGame;

public class Undercasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Human h=new Human();
h.lol();
h.lamao();
	}

}
class Human{
	void lol() {
		String name="Manoj";
		System.out.println(name);
	}
	void lamao() {
		int num=123;
		System.out.println(num);
	}
}