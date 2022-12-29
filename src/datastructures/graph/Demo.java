package datastructures.graph;

import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Integer root = 0;
        Set<Integer[]> adjSet = new HashSet<>();
        adjSet.add(new Integer[]{root, 1});
        adjSet.add(new Integer[]{root, 2});
        adjSet.add(new Integer[]{1, 3});
        adjSet.add(new Integer[]{2, 1});
        adjSet.add(new Integer[]{2, 4});
        adjSet.add(new Integer[]{3, 5});
        adjSet.add(new Integer[]{4, 3});
        adjSet.add(new Integer[]{4, 5});

        Map<Integer, List<Integer>> adjList = setToList(adjSet);

        DFS dfs = new DFS(adjList);
        System.out.println("Iterative");
        dfs.search(root);
        System.out.println("\nRecursive");
        dfs.searchRec(root);
    }

    private static Map<Integer, List<Integer>> setToList(Set<Integer[]> adjSet) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        for(Integer[] tuple: adjSet) {
            Integer key = tuple[0];
            adjList.computeIfAbsent(key, k -> new ArrayList<>()).add(tuple[1]);
        }
        return adjList;
    }
}
