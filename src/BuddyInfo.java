public class BuddyInfo {
    private String name;
    private String address;

    public BuddyInfo(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return name + " " + address;
    }

    public static void main(String[] args) {
        BuddyInfo homer = new BuddyInfo("Homer", "Yurt");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(homer);
        addressBook.removeBuddy(homer);
    }
}
