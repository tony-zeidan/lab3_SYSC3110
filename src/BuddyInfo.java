/**
 * This class models a person that will be placed within an address book.
 *
 * @author Tony Zeidan
 * @version 10/01/2020
 */
public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    /**
     * Default constructor for instances of class BuddyInfo.
     * Creates a new BuddyInfo instance associated with the given name.
     *
     * @param name The name of the person
     */
    public BuddyInfo(String name,String address,String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Retrieves the name of the person.
     *
     * @return The name
     */
    public String getName() {
        return name;
    }

    public static void main(String[] args) {

        BuddyInfo b1 = new BuddyInfo("Tom","Carleton","613");
        System.out.println("Hello " + b1.getName() + "!");
    }
}
