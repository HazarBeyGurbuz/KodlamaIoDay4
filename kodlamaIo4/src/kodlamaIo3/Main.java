package kodlamaIo3;

public class Main {

	public static void main(String[] args) {
		
			Gamer hazar = new Gamer(1, "hazar", "gürbüz", "12345", "1999");
			Gamer engin = new Gamer(1, "engin", "demiroð", "6789", "1990");
			Campaign blackFriday = new Campaign(1, "Black Friday");
			Game counter = new Game(1, "Counter Strike", 25.5);
			GamerManager gamerManager = new GamerManager(new Confirmation());
			gamerManager.register(hazar);
			gamerManager.updateInformation(hazar);
			gamerManager.delete(hazar);
			gamerManager.register(engin);
			
			GameManager gameManager = new GameManager();
			gameManager.sell(hazar, counter);
			gameManager.sell(hazar, counter, blackFriday);
			
			CampaignManager campaignManager = new CampaignManager();
			campaignManager.addCampaign(blackFriday);
			campaignManager.deleteCampaign(blackFriday);
			campaignManager.updateCampaign(blackFriday);
			
			
			

	}

}
