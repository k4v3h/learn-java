package datastructures.graph;

import java.util.*;

public class DFS implements Search {
    private final Map<Integer, List<Integer>> adjList;

    DFS(Map<Integer, List<Integer>> adjList) {
        this.adjList = adjList;
    }

    public void search(Integer start) {
        Set<Integer> visited = new HashSet<>();
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(start);

        while(!stack.isEmpty()) {
            Integer vertex = stack.remove(stack.size()-1);

            if(!visited.contains(vertex)) {
                System.out.print(vertex);
            }

            visited.add(vertex);

            for(Integer neigh: adjList.getOrDefault(vertex, new ArrayList<>())) {
                if(!visited.contains(neigh)) {
                    stack.add(neigh);
                }
            }
        }
    }

    public void searchRec(Integer start) {
        Set<Integer> visited = new HashSet<>();
        rec(start, visited);
    }

    public void rec(Integer vertex, Set<Integer> visited) {
        if (visited.contains(vertex)) return;

        visited.add(vertex);
        System.out.print(vertex);

        for(Integer neigh: adjList.getOrDefault(vertex, new ArrayList<>())) {
            if(!visited.contains(neigh)) {
                rec(neigh, visited);
            }
        }
    }
}
