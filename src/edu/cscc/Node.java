package edu.cscc;

/**
 * This class represents a generic node in a linked list.
 * It contains data of type E, and link to the "next" node, which is also a Node of type E.
 * @param <E> The generic type of data the node will contain.
 */
public class Node<E> {

    private E data;
    private Node<E> next;

    /**
     * Constructor that takes a value of type E that the Node will contain.
     * @param data Value of type E that the Node will contain.
     */
    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    /**
     * Retrieve the "next" node, which is also a Node of type E.
     * @return The next Node of type E, or null if there is no next node.
     */
    public Node<E> getNext() {
        return next;
    }

    /**
     * Set the next Node of type E.
     * @param next A Node of type E.
     */
    public void setNext(Node<E> next) {
        this.next = next;
    }
}
