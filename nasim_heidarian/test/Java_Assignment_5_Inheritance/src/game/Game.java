package game;

public class Game {
	public static void main(String [] args) {
		
		GameObject Player = new Player();
		GameObject Enemy = new Enemy();
		Player.Update();
		Enemy.Update();

	}


}
