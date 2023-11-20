import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {

    private AddressBook book;

    public Controller(AddressBook book)
    {
        this.book = book;
    }
    @Override
    public void actionPerformed(ActionEvent e)
    {
        String a = e.getActionCommand();
        if(a.equals("New AddressBook"))
        {
            AddressBookViewFrame f = new AddressBookViewFrame();
        }
        else if(a.equals("Display"))
        {
            for(AddressBookViewFrame view: book.getViews())
                view.display();
        }
        else if(a.equals("Add Buddy"))
        {
            String name = JOptionPane.showInputDialog("Enter Name");
            String address = JOptionPane.showInputDialog("Enter Address");
            String number = JOptionPane.showInputDialog("Enter PhoneNumber");
            book.addBuddy(new BuddyInfo(name, address, number));
        }
        else if (a.equals("Remove Buddy"))
        {
            for(AddressBookViewFrame view: book.getViews())
            {
                String input =view.getBuddyList().getSelectedValue();
                String[] s = input.split(" ");
                book.removeBuddy(new BuddyInfo(s[0], s[1], s[2]));
            }
        }
    }
}
