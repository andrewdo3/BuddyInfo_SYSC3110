import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBookViewFrame extends JFrame {
    private JMenuBar menuBar;
    private AddressBook book;
    private JList<String> buddyList;

    public AddressBookViewFrame() {
        super("Book of Things");
        book = new AddressBook();
        book.addView(this);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu options = new JMenu("Options");
        menuBar.add(options);
        JMenu addrMenu = new JMenu("AddressBook");
        menuBar.add(addrMenu);
        JMenu budMenu = new JMenu("BuddyInfo");
        menuBar.add(budMenu);

        Controller c = new Controller(book);
        JMenuItem item;
        item = new JMenuItem("New AddressBook");
        item.addActionListener(c);
        addrMenu.add(item);
        item = new JMenuItem("Export");
        item.addActionListener(c);
        options.add(item);

        item = new JMenuItem("Display");
        item.addActionListener(c);
        addrMenu.add(item);

        item = new JMenuItem("Add Buddy");
        item.addActionListener(c);
        budMenu.add(item);
        item = new JMenuItem("Remove Buddy");
        item.addActionListener(c);
        budMenu.add(item);

        buddyList = new JList<>(book.getBuddies());
        add(buddyList);
        buddyList.setVisible(false);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 600);
        this.setVisible(true);
    }

    public void display()
    {
        buddyList.setVisible(true);
    }

    public JList<String> getBuddyList()
    {
        return buddyList;
    }
    public static void main(String[] args) {
        AddressBookViewFrame x = new AddressBookViewFrame();
    }
}
