import java.util.ArrayList;
import java.util.List;

/**
 * This class models an AddressBook containing individual people (BuddyInfo objects).
 * Created as a requirement of SYSC 3110 (Software Design Project)
 *
 * Changes made -> show on testing Branch
 *
 * @author Tony Zeidan
 * @version 10/01/2020
 */
public class AddressBook {

    private ArrayList<BuddyInfo> myBuddies;

    /**
     * Default constructor for instances of the AddressBook class.
     * Creates a new address book with enough room to store the given initial amount
     * of BuddyInfo objects.
     */
    public AddressBook() {
        myBuddies = new ArrayList<>();
    }


    /**
     * Adds the given BuddyInfo object to the address book
     *
     * @param aBuddy The BuddyInfo object to add to the book
     */
    public void addBuddy(BuddyInfo aBuddy) {
        if (aBuddy!=null) {
            myBuddies.add(aBuddy);
        }
    }

    /**
     * Removes the BuddyInfo object from the address book with the given index.
     *
     * @param  index The index to remove the BuddyInfo object from
     */
    public BuddyInfo removeBuddy(int index) {
        if (index >= 0 && index < myBuddies.size()) {
            return myBuddies.remove(index);
        }
        return null;
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(0);
    }
}
