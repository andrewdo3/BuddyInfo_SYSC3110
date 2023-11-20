/**
 * Author: Andrew Do
 * Date: September 18, 2023
 */

import javax.swing.*;
import java.io.*;
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
        FileWriter p = new FileWriter(fileName);

        for(BuddyInfo b: buddyInfos)
        {
            p.write(b.toString());
        }
        p.close();
    }

    public void importAddressBook(String fileName) throws IOException {
        FileReader iStream = new FileReader(fileName);

        BufferedReader dStream = new BufferedReader(iStream);

        String line = dStream.readLine();
        while(line != null)
        {
            addBuddy(BuddyInfo.importBuddyInfo(line));
            line = dStream.readLine();
        }
        dStream.close();
    }

    public static void main(String[] args) {
    }
}
