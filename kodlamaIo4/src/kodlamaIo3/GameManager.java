package kodlamaIo3;

public class GameManager implements GameManagerService{
	
		public void sell(Gamer gamer, Game game) {
			System.out.println(game.getName() +" oyunu " + gamer.getFirstName() +" ki�isine sat�ld�");
		}
		
		public void sell(Gamer gamer, Game game, Campaign campaign) {
			System.out.println(game.getName() +" oyunu " + gamer.getFirstName() +" ki�isine " + campaign.getName() + " kampanyas�yla sat�ld�");
		}

}
