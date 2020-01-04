
class ValidEmail {
		private String email, userName,passWord;
		
		public void setemail(String email) {
			if (email.contains("gmail.com")){
				this.email=email;
			}else {
				System.out.println("Invalid e mail type");
			}
		}
		public String getEmail() {
			return email;
		}
		
		public void userName(String userName) {
			if (!userName.isEmpty()) {
				if (userName.length()>6) {
					this.userName=userName;
				}else {
					System.out.println("Username should have more than 6 characters");
				}
			}else {
				System.out.println("Username cannot be empty");
			}
		}
		public String getUserName() {
			return userName;
		}
		public void setPassword(String passWord) {
		if (!passWord.isEmpty()) {
			if (passWord.length()>6) {	
				if (!passWord.contains(userName)) {
				this.passWord=passWord;
				}else {
					System.out.println("Password cannot contain username");
						}
			} else {
			System.out.println("Password should have more than 6 characters");
					}
		}else {
			System.out.println("Password cannot be empty");
		}
	}
	
public String getPassword() {
	return passWord; 
	}
	
}
	
class EmailTest2{
	public static void main(String[] args) {
			
	ValidEmail em1=new ValidEmail();
		em1.userName("Aka1234!");
		em1.setPassword("Saat1234");
		System.out.println("UserName ="+em1.getUserName());
		System.out.println("Password ="+em1.getPassword());
	}
	}
	


