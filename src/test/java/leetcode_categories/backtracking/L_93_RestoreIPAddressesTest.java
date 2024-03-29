package leetcode_categories.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static leetcode_categories.backtracking.L_93_RestoreIPAddresses.restoreIpAddresses;
import static org.junit.Assert.assertEquals;

public class L_93_RestoreIPAddressesTest {

    @Test
    public void firstTest() {
        String s = "25525511135";
        String[] ipAddressArray = {"255.255.11.135","255.255.111.35"};
        List<String> ipAddressList = Arrays.asList(ipAddressArray);
        assertEquals(ipAddressList, restoreIpAddresses(s));
    }

    @Test
    public void secondTest() {
        String s = "101023";
        String[] ipAddressArray = {"1.0.10.23", "1.0.102.3", "10.1.0.23", "10.10.2.3", "101.0.2.3"};
        List<String> ipAddressList = Arrays.asList(ipAddressArray);
        assertEquals(ipAddressList, restoreIpAddresses(s));
    }

    @Test
    public void thirdtest() {
        String s = "0000";
        String[] ipAddressArray = {"0.0.0.0"};
        List<String> ipAddressList = Arrays.asList(ipAddressArray);
        assertEquals(ipAddressList, restoreIpAddresses(s));
    }
}