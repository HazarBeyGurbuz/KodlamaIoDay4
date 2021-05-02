package kodlamaIo3;

public class CampaignManager implements CampaignManagerService{
	
	public void addCampaign(Campaign campaign) {
		System.out.println( campaign.getName() + "Kampanya eklendi");
		
	}
	public void deleteCampaign(Campaign campaign) {
		System.out.println( campaign.getName() + " Kampanya silindi");
		
	}
	public void updateCampaign(Campaign campaign) {
		System.out.println( campaign.getName() + "Kampanya güncellendi");
		
	}

}
