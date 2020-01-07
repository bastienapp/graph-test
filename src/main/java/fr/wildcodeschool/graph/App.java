package fr.wildcodeschool.graph;

import tech.tablesaw.api.DoubleColumn;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4};
        DoubleColumn nc = DoubleColumn.create("nc", numbers);
        System.out.println(nc.print());
    }
}
