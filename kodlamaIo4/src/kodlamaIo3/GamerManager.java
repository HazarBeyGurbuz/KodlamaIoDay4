package kodlamaIo3;

public class GamerManager implements GamerManagerService {
	
		private ConfirmationService confirmationService;
		
	    GamerManager(ConfirmationService confirmationService){
	    	this.confirmationService = confirmationService;
	    	
	    }
		public void register(Gamer gamer) {
			
			
			if(confirmationService.validate(gamer)) {
				System.out.println(gamer.getFirstName() + " kay�t ba�ar�l�");
			}
			else {
				System.out.println(gamer.getFirstName() + " kay�t ba�ar�s�z");
			}
				
			
		}
		
		public void updateInformation(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " isim bilgisi g�ncellendi");
		}
		
		public void delete(Gamer gamer) {
			System.out.println(gamer.getFirstName() + " kayd� silindi");
		}

}
