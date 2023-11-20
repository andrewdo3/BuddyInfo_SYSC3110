import java.util.Scanner;

public class BuddyInfo {
    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public static BuddyInfo importBuddyInfo(String s)
    {
        s = s.strip();
        Scanner input = new Scanner(s).useDelimiter("#");
        return new BuddyInfo(input.next(), input.next(), input.next());
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public String toString() {
        return name + "#" + address + "#" + phoneNumber +"\n";
    }

    public static void main(String[] args) {
    }
}
