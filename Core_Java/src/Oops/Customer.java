
package Oops;
 
//This is about bundling data (variables) and methods (functions) that operate on the data into a single unit, 
//like a class, and restricting access to certain details.
//Example in a CRM System:
//Class: Customer
//Attributes (Private): name, email, phoneNumber
//Methods: getName(), setName(), getEmail(), setEmail(), etc.
//In the CRM project, the Customer class contains the customer's information, but direct access to the
//private fields is restricted. Only getter and setter methods allow external access, ensuring the
//data is controlled and validated before being exposed or changed.


	public class Customer {
	    private String firstName;
	    private String lastName;
	    private String email;
	    
	    // Getters and Setters
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	    
	 
	}
