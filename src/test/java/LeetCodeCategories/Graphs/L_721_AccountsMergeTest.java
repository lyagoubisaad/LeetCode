package LeetCodeCategories.Graphs;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class L_721_AccountsMergeTest {

    L_721_AccountsMerge myClass = new L_721_AccountsMerge();

    @Test
    public void firstTest() {
        List<List<String>> accounts = List.of(
                List.of("John","johnsmith@mail.com","john_newyork@mail.com"),
                List.of("John","johnsmith@mail.com","john00@mail.com"),
                List.of("Mary","mary@mail.com"),
                List.of("John","johnnybravo@mail.com")
        );

        List<List<String>> result = List.of(
                List.of("John","john00@mail.com","john_newyork@mail.com","johnsmith@mail.com"),
                List.of("Mary","mary@mail.com"),
                List.of("John","johnnybravo@mail.com")
        );
        assertEquals(result, myClass.accountsMerge(accounts));
    }

    @Test
    public void secondTest() {
        List<List<String>> accounts = List.of(
                List.of("Gabe","Gabe0@m.co","Gabe3@m.co","Gabe1@m.co"),
                List.of("Kevin","Kevin3@m.co","Kevin5@m.co","Kevin0@m.co"),
                List.of("Ethan","Ethan5@m.co","Ethan4@m.co","Ethan0@m.co"),
                List.of("Hanzo","Hanzo3@m.co","Hanzo1@m.co","Hanzo0@m.co"),
                List.of("Fern","Fern5@m.co","Fern1@m.co","Fern0@m.co")
        );

        List<List<String>> result = List.of(
                List.of("Ethan","Ethan0@m.co","Ethan5@m.co","Ethan4@m.co"),
                List.of("Gabe","Gabe0@m.co","Gabe1@m.co","Gabe3@m.co"),
                List.of("Hanzo","Hanzo0@m.co","Hanzo1@m.co","Hanzo3@m.co"),
                List.of("Kevin","Kevin0@m.co","Kevin3@m.co","Kevin5@m.co"),
                List.of("Fern","Fern0@m.co","Fern1@m.co","Fern5@m.co")
        );
        assertEquals(result, myClass.accountsMerge(accounts));
    }

}