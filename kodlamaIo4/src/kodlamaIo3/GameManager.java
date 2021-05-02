package kodlamaIo3;

public class GameManager implements GameManagerService{
	
		public void sell(Gamer gamer, Game game) {
			System.out.println(game.getName() +" oyunu " + gamer.getFirstName() +" kiþisine satýldý");
		}
		
		public void sell(Gamer gamer, Game game, Campaign campaign) {
			System.out.println(game.getName() +" oyunu " + gamer.getFirstName() +" kiþisine " + campaign.getName() + " kampanyasýyla satýldý");
		}

}
