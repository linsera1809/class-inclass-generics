package edu.cscc;

public class Main {

    public static void main(String[] args) {
        LinkedListAccumulator linkedListAccumulator = new LinkedListAccumulator(1);
        populateNodes(linkedListAccumulator);

        int sum = linkedListAccumulator.sum();
        //1 + 2 + 3 + 4 + 5, etc through 10
        System.out.println("Total sum of 1-10: " + sum);
    }

    private static void populateNodes(LinkedListAccumulator accumulator) {
        for(int i=2; i<=10; i++) {
            accumulator.addValue(i);
        }
    }
}
