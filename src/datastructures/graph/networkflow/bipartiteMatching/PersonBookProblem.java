package datastructures.graph.networkflow.bipartiteMatching;

import datastructures.graph.networkflow.Edge;
import datastructures.graph.networkflow.FordFulkersonDfs;
import datastructures.graph.networkflow.NetworkFlowBase;

import java.util.List;

public class PersonBookProblem {
    public static void main(String[] args) {
        final int PEOPLE = 5;
        final int BOOKS = 5;

        final int N = PEOPLE + BOOKS + 2;
        final int S = 0;
        final int T = N - 1;

        NetworkFlowBase maxFlowSolver = new FordFulkersonDfs(N, S, T);

        for (int i=1; i <= PEOPLE; i++) {
            maxFlowSolver.addEdge(S, i, 1);
        }

        for(int i=1; i <= PEOPLE; i++) {
            for(int j=PEOPLE+1; j <= PEOPLE+BOOKS; j++) {
                maxFlowSolver.addEdge(i, j, 1);
            }
        }

        for(int i=PEOPLE+1; i <= PEOPLE+BOOKS; i++) {
            maxFlowSolver.addEdge(i, T, 1);
        }

        System.out.println("Number of safe mice: " + maxFlowSolver.getMaxFlow());
        maxFlowSolver.printGraph();
    }
}
