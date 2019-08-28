package edu.cscc;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListAccumulatorTest {

    private static final int STARTING_VALUE = 10;
    private LinkedListAccumulator linkedListAccumulator;

    @Before
    public void setUp() {
        linkedListAccumulator = new LinkedListAccumulator(STARTING_VALUE);
    }

    @Test
    public void itCanBeCreatedWithAStartingValue() {
        LinkedListAccumulator linkedListAccumulator = new LinkedListAccumulator(STARTING_VALUE);

        assertEquals(new Integer(STARTING_VALUE), linkedListAccumulator.getHead().getData());
    }

    @Test
    public void itCanAddAValueToTheEndOfTheList() {
        linkedListAccumulator.addValue(20);

        Node<Integer> headNode = linkedListAccumulator.getHead();
        assertEquals(new Integer(STARTING_VALUE), headNode.getData());
        assertEquals(new Integer(20), headNode.getNext().getData());
    }

    @Test
    public void itCanAddMultipleValuesToTheEndOfTheList() {
        linkedListAccumulator.addValue(20);
        linkedListAccumulator.addValue(30);

        Node<Integer> headNode = linkedListAccumulator.getHead();
        assertEquals(new Integer(STARTING_VALUE), headNode.getData());
        Node<Integer> secondNode = headNode.getNext();
        assertEquals(new Integer(20), secondNode.getData());
        assertEquals(new Integer(30), secondNode.getNext().getData());
    }

    @Test
    public void itCanCalculateTheSumWhenTheListIsCreated() {
        assertEquals(STARTING_VALUE, linkedListAccumulator.sum());
    }

    @Test
    public void itCanCalculateTheSumWhenAValueHasBeenAdded() {
        linkedListAccumulator.addValue(20);

        assertEquals(30, linkedListAccumulator.sum());
    }

    @Test
    public void itCanCalculateTheSumWhenMultipleValuesHaveBeenAdded() {
        linkedListAccumulator.addValue(20);
        linkedListAccumulator.addValue(30);

        assertEquals(60, linkedListAccumulator.sum());
    }
}