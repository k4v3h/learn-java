package datastructures.graph.networkflow;

import java.util.List;
import static java.lang.Math.min;

public class FordFulkersonDfs extends NetworkFlowBase{

    public FordFulkersonDfs(int n, int s, int t) {
        super(n, s, t);
    }
    @Override
    public void solve() {
        for(long f = dfs(s, INF); f != 0; f = dfs(s, INF)) {
           visitedToken++;
           maxFlow += f;
        }
    }

    private long dfs(int node, long flow) {
        if (node == t) return flow;

        markAsVisit(node);

        List<Edge> edges = graph[node];
        for(Edge edge: edges) {
            if(edge.remainingCapacity() > 0 && !visited(edge.to)) {
                long bottleNeck = dfs(edge.to, min(flow, edge.remainingCapacity()));

                if(bottleNeck > 0) {
                    edge.augment(bottleNeck);
                    return bottleNeck;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int n = 12;
        int s = n - 2;
        int t = n - 1;

        FordFulkersonDfs solver = new FordFulkersonDfs(n, s, t);

        solver.addEdge(s, 1, 2);
        solver.addEdge(s, 2, 1);
        solver.addEdge(s, 0, 7);

        solver.addEdge(0, 3, 2);
        solver.addEdge(0, 4, 4);

        solver.addEdge(1, 4, 5);
        solver.addEdge(1, 5, 6);

        solver.addEdge(2, 3, 4);
        solver.addEdge(2, 7, 8);

        solver.addEdge(3, 6, 7);
        solver.addEdge(3, 7, 1);

        solver.addEdge(4, 5, 8);
        solver.addEdge(4, 8, 3);

        solver.addEdge(5, 8, 3);

        solver.addEdge(6, t, 1);
        solver.addEdge(7, t, 3);
        solver.addEdge(8, t, 4);

        System.out.println(solver.getMaxFlow());

        solver.printGraph();
    }

}

