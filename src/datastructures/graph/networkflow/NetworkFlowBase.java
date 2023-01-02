package datastructures.graph.networkflow;

import java.util.*;

public abstract class NetworkFlowBase {
    // To avoid overflow, set infinity to a value less than Long.MAX_VALUE;
    protected static final long INF = Long.MAX_VALUE / 2;

    // Inputs: n = number of nodes, s = source, t = sink
    protected final int n, s, t;

    protected int visitedToken = 1;
    protected int[] visited;

    protected boolean solved;

    protected long maxFlow;

    protected List<Edge>[] graph;

    public NetworkFlowBase(int n, int s, int t) {
        this.n = n;
        this.s = s;
        this.t = t;
        initializeEmptyFlowGraph();
        visited = new int[n];
    }

    private void initializeEmptyFlowGraph() {
        graph = new List[n];
        for(int i=0; i < n; i++) {
            graph[i] = new ArrayList<Edge>();
        }
    }

    public void addEdge(int from, int to, long capacity) {
        if (capacity == 0) throw new IllegalArgumentException("Forward edge capacity <= 0");

        Edge forwardEdge = new Edge(from, to, capacity);
        Edge residualEdge = new Edge(to, from, 0);
        forwardEdge.residual = residualEdge;
        residualEdge.residual = forwardEdge;

        graph[from].add(forwardEdge);
        graph[to].add(residualEdge);
    }

    public List<Edge>[] getGraph() {
        execute();
        return graph;
    }

    public void markAsVisit(int i) {
        visited[i] = visitedToken;
    }

    public boolean visited(int i) {
        return visited[i] == visitedToken;
    }

    public long getMaxFlow() {
        execute();
        return maxFlow;
    }

    private void execute() {
        if (solved) return;

        solved = true;
        solve();
    }

    public abstract void solve();

    public void printGraph() {
        List<Edge>[] g = getGraph();
        for (List<Edge> edges : g) {
            for (Edge e : edges) {
                if (e.to == s || e.from == t) continue;
                if (e.from == s || e.to == t || e.from < e.to) System.out.println(e.toString(s, t));
            }
        }
    }
}
