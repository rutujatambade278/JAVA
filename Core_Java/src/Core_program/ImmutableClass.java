package Core_program;

import java.util.Date;

//create final class imutable
public final class ImmutableClass {

	//create the private final variable
    private final String name;
    private final Date dob;
    private final String mobile;

    //create variable constructor
    public ImmutableClass(String name, Date dob, String mobile) {
        this.name = name;
        this.dob = new Date(dob.getTime()); // Defensive copy
        this.mobile = mobile;
    }
  //create gettermethod don't create the setter method 
    public String getName() {
        return name;
    }

    public Date getDob() {
        return new Date(dob.getTime()); // Return a copy of Date
    }

    public String getMobile() {
        return mobile;
    }

    public static void main(String[] args) {
        Date d = new Date();
        ImmutableClass emp = new ImmutableClass("Rutuja", d, "2343434");

        // Testing immutability
        d.setTime(0); // Trying to modify the date after passing it to ImmutableClass
    //   emp.name("lata");  //they can't modify the data because it is variable is private.
        System.out.println("Name: " + emp.getName());
        System.out.println("DOB: " + emp.getDob());
        System.out.println("Mobile: " + emp.getMobile());
    }
}
