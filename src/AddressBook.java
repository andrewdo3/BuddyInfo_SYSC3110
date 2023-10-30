/**
 * Author: Andrew Do
 * Date: September 18, 2023
 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class AddressBook
{
    private DefaultListModel<String> buddies;
    private ArrayList<BuddyInfo> arg;
    private List<AddressBookViewFrame> views;

    public AddressBook()
    {
        arg = new ArrayList<BuddyInfo>();
        buddies = new DefaultListModel<String>();
        this.views = new ArrayList<AddressBookViewFrame>();
    }

    public void addBuddy(BuddyInfo bud)
    {
        arg.add(bud);
        buddies.addElement(bud.toString());
    }

    public boolean removeBuddy(BuddyInfo bud)
    {
        buddies.removeElement(bud.toString());
        return arg.remove(bud);
    }

    public void addView(AddressBookViewFrame view)
    {
        views.add(view);
    }

    public void removeView(AddressBookViewFrame view){
        this.views.remove(view);
    }

    public DefaultListModel<String> getBuddies()
    {
        return buddies;
    }

    public ArrayList<AddressBookViewFrame> getViews()
    {
        return (ArrayList<AddressBookViewFrame>)views;
    }

    public static void main(String[] args) {
        BuddyInfo guy = new BuddyInfo("Dude", "Y");
        BuddyInfo girl = new BuddyInfo("Gal", "X");
        AddressBook a1 = new AddressBook();
        a1.addBuddy(guy);
        a1.removeBuddy(guy);
        a1.addBuddy(girl);
        a1.removeBuddy(girl);
        //Testing Editing in GitHub
    }
}
