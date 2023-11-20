import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AddressBookTest extends junit.framework.TestCase{

    @BeforeEach
    protected void setUp(){

    }

    @Test
    public void testImportExport() throws IOException {
        AddressBook a = new AddressBook();
        AddressBook b = new AddressBook();
        BuddyInfo g = new BuddyInfo("Guy", "111 Fake Street", "613-111-1111");
        BuddyInfo ga = new BuddyInfo("Gal", "111 Fake Street", "613-111-1111");

        a.addBuddy(g);
        a.addBuddy(ga);

        a.save("test.txt");

        b.importAddressBook("test.txt");

        assertEquals(a.getBuddies().size(), b.getBuddies().size());
        assertEquals(a.getBuddies().elementAt(0), b.getBuddies().elementAt(0));
        assertEquals(a.getBuddies().elementAt(1), b.getBuddies().elementAt(1));
    }
}