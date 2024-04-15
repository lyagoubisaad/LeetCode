package leetcode_categories.graphs_advanced;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utils.Convertor;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L_332_ReconstructItineraryTest {

    L_332_ReconstructItinerary myClass;
    Convertor convertor;

    @BeforeEach
    void setUp() {
        myClass = new L_332_ReconstructItinerary();
        convertor = new Convertor();
    }

    @Test
    @Disabled
    void convertor() {
        convertor.toBracesAndSingleQuotes("[[\"MUC\",\"LHR\"],[\"JFK\",\"MUC\"],[\"SFO\",\"SJC\"],[\"LHR\",\"SFO\"]]");
        convertor.toBracesAndSingleQuotes("[[\"JFK\",\"SFO\"],[\"JFK\",\"ATL\"],[\"SFO\",\"ATL\"],[\"ATL\",\"JFK\"],[\"ATL\",\"SFO\"]]");
    }

    @Test
    void testFirst() {
        //Given
        List<List<String>> tickets = List.of(
                List.of("MUC","LHR"), List.of("JFK","MUC"), List.of("SFO","SJC"), List.of("LHR","SFO")
        );
        List<String> expected = List.of("JFK","MUC","LHR","SFO","SJC");
        //When
        List<String> actual = myClass.findItinerary(tickets);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSecond() {
        //Given
        List<List<String>> tickets = List.of(
                List.of("JFK","SFO"), List.of("JFK","ATL"), List.of("SFO","ATL"), List.of("ATL","JFK"), List.of("ATL","SFO")
        );
        List<String> expected = List.of("JFK","ATL","JFK","SFO","ATL","SFO");
        //When
        List<String> actual = myClass.findItinerary(tickets);
        //Then
        assertEquals(expected, actual);
    }

    @Test
    public void testThird() {
        //Given
        List<List<String>> tickets = List.of(
                List.of("JFK","KUL"), List.of("JFK","NRT"), List.of("NRT","JFK")
        );
        List<String> expected = List.of("JFK", "NRT", "JFK", "KUL");
        //When
        List<String> actual = myClass.findItinerary(tickets);
        //Then
        assertEquals(expected, actual);
    }
}