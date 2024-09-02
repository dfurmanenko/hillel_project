package aqa_lection10_maps;

import java.util.TreeSet;

public class MergeTreeSets {

    public static TreeSet<Integer> mergeSets(TreeSet<Integer> setA, TreeSet<Integer> setB) {
        TreeSet<Integer> resultSet = new TreeSet<>(setA);
        resultSet.addAll(setB);
        return resultSet;
    }

    public static void main(String[] args) {
        TreeSet<Integer> setA = new TreeSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);

        TreeSet<Integer> setB = new TreeSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);

        TreeSet<Integer> resultSet = mergeSets(setA, setB);
        System.out.println("Merged TreeSet: " + resultSet);
    }
}
