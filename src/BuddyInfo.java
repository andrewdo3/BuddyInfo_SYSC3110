public class BuddyInfo {
    private String name;

    public BuddyInfo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(homer);
        addressBook.removeBuddy(homer);
    }
}
