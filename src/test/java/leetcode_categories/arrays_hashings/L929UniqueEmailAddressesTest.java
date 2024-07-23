package leetcode_categories.arrays_hashings;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L929UniqueEmailAddressesTest {

    L929UniqueEmailAddresses myClass;

    @BeforeEach
    void setUp() {
        myClass = new L929UniqueEmailAddresses();
    }

    @Test
    public void testFirst() {
        //Given
        String[] emails = new String[] {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        //When
        int actual = myClass.numUniqueEmails(emails);
        //Then
        assertEquals(2, actual);
    }

    @Test
    public void testSecond() {
        //Given
        String[] emails = new String[] {"a@leetcode.com","b@leetcode.com","c@leetcode.com"};
        //When
        int actual = myClass.numUniqueEmails(emails);
        //Then
        assertEquals(3, actual);
    }


}