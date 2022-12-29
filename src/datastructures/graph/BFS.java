package datastructures.graph;

import java.util.*;

public class BFS implements Search {
    private Map<Integer, List<Integer>> adjList;

    BFS(Map<Integer, List<Integer>> adjList) {
        this.adjList = adjList;
    }

    public void search(Integer start) {
        Set<Integer> visited = new HashSet<>();
        LinkedList<Integer> q = new LinkedList<>();
        q.addFirst(start);
        visited.add(start);

        while(q.size() != 0) {
            Integer vertex = q.pollFirst();
            System.out.print(vertex);

            for(Integer neigh: adjList.getOrDefault(vertex, new ArrayList<>())) {
                if(!visited.contains(neigh)) {
                    q.addLast(neigh);
                    visited.add(neigh);
                }
            }
        }
    }
}
