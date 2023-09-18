/**
 * Author: Andrew Do
 * Date: September 18, 2023
 */

import java.util.ArrayList;
public class AddressBook
{
    private ArrayList<BuddyInfo> arg;

    public AddressBook()
    {
        arg = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo bud)
    {
        arg.add(bud);
    }

    public boolean removeBuddy(BuddyInfo bud)
    {
        return arg.remove(bud);
    }

    public static void main(String[] args) {
        System.out.print("Hello World!");
    }
}
