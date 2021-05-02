package kodlamaIo3;

public class Gamer {

		private int id;
		private String firstName;
		private String lastName;
		private String identityNumber;
		private String birthDay;
		
		public Gamer(int id, String firstName, String lastName, String identityNumber, String birthDay) {
			super();
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.identityNumber = identityNumber;
			this.birthDay = birthDay;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public String getIdentityNumber() {
			return identityNumber;
		}

		public void setIdentityNumber(String identityNumber) {
			this.identityNumber = identityNumber;
		}

		public String getBirthDay() {
			return birthDay;
		}

		public void setBirthDay(String birthDay) {
			this.birthDay = birthDay;
		}
		
	
}
