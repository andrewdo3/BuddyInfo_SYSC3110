/**
 * Author: Andrew Do
 * Date: September 18, 2023
 */

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class AddressBook
{
    private DefaultListModel<String> buddies;
    private ArrayList<BuddyInfo> buddyInfos;
    private List<AddressBookViewFrame> views;

    public AddressBook()
    {
        buddyInfos = new ArrayList<BuddyInfo>();
        buddies = new DefaultListModel<String>();
        this.views = new ArrayList<AddressBookViewFrame>();
    }

    public void addBuddy(BuddyInfo bud)
    {
        buddyInfos.add(bud);
        buddies.addElement(bud.toString());
    }

    public boolean removeBuddy(BuddyInfo bud)
    {
        buddies.removeElement(bud.toString());
        return buddyInfos.remove(bud);
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

    public void save(String fileName) throws IOException {
        FileOutputStream ostream = new  FileOutputStream(fileName);

        ObjectOutputStream p = new ObjectOutputStream(ostream);

        for(BuddyInfo b: buddyInfos)
        {
            p.writeObject(b.toString());
        }
        ostream.close();
    }

    public static void main(String[] args) {
    }
}
