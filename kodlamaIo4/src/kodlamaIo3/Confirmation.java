package kodlamaIo3;

public class Confirmation implements ConfirmationService {

	@Override
	public boolean validate(Gamer gamer) {
		if (gamer.getFirstName() == "hazar" && gamer.getLastName() == "gürbüz" && gamer.getBirthDay() == "1999" && gamer.getIdentityNumber() == "12345") {
			return true;
			
		}
		
		else
		
		return false;
	}
	
		

}
