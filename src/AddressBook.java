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
        BuddyInfo guy = new BuddyInfo("Dude");
        BuddyInfo girl = new BuddyInfo("Gal");
        AddressBook a1 = new AddressBook();
        a1.addBuddy(guy);
        a1.removeBuddy(guy);
        a1.addBuddy(girl);
        a1.removeBuddy(girl);
        //Testing Editing in GitHub
    }
}
