package kodlamaIo3;

public class GamerManager implements GamerManagerService {
	
		private ConfirmationService confirmationService;
		
	    GamerManager(ConfirmationService confirmationService){
	    	this.confirmationService = confirmationService;
	    	
	    }
		public void register(Gamer gamer) {
			
			
			if(confirmationService.validate(gamer)) {
				System.out.println(gamer.getFirstName() + " kayýt baþarýlý");
			}
			else {
				System.out.println(gamer.getFirstName() + " kayýt baþarýsýz");
			}
				
			
		}
		
		public void updateInformation(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " isim bilgisi güncellendi");
		}
		
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " kaydý silindi");
		}

}
