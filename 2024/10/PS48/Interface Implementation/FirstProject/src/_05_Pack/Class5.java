package _05_Pack;
interface Player {
    void play();
}

class CricketPlayer implements Player {
    public void play() {
        System.out.println("Playing cricket");
    }
}

class FootballPlayer implements Player {
    public void play() {
        System.out.println("Playing football");
    }
}
public class Class5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Player player1 = new CricketPlayer();
        Player player2 = new FootballPlayer();
        
        player1.play(); // Playing cricket
        player2.play(); // Playing football
	}

}
