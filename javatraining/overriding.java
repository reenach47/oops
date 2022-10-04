package javatraining;
class Game{
	void games() {
		System.out.println("your fav game");
		
	}
}
public class overriding extends Game{

	public static void main(String[] args) {
		overriding obj=new overriding();
		obj.games();
	}
	void games()
	{
		super.games();
		System.out.println("my fav game is chess");
		
		

	}

}
