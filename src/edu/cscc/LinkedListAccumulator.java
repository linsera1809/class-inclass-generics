package edu.cscc;

public class LinkedListAccumulator {

    /**
     * This is the first node in the linked list.
     */
    private Node<Integer> head;

    /**
     * TODO Implement this constructor.
     * Constructor which takes the starting value for the first node, called the "head".
     * @param startingValue Value to initialize the linked list with.
     */
    public LinkedListAccumulator(Integer startingValue) {

    }

    /**
     * Convenience method to return the head node.
     * @return The first node of the linked list.
     */
    public Node<Integer> getHead() {
        return head;
    }

    /**
     * TODO Implement this method.
     * Add a value to the end of the linked list.
     * This method should create a new node with the value
     * and traverse the nodes in the linked list using the "next" property of the nodes starting with the head node.
     * Once a null next link is encountered add a new node and link it to the current last node (Node.setNext()).
     * @param value The value to be appended as a node at the end of the linked list.
     */
    public void addValue(Integer value) {

    }

    /**
     * TODO Implement this method.
     * Sum all of the integer values in the linked list and return the result.
     * It may be useful to use recursion here to sum the values.
     * @return The total value of all of the integers in the list.
     */
    public int sum() {
        return -1;
    }

}
