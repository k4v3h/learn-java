package datastructures.graph.networkflow;

public class Edge {
    public int from, to;
    public Edge residual;
    public long flow;
    public final long capacity;

    public Edge(int from, int to, long capacity) {
        this.from = from;
        this.to = to;
        this.capacity = capacity;
    }

    public boolean isResidual() {
        return capacity == 0;
    }

    public long remainingCapacity() {
        return capacity - flow;
    }

    public void augment(long bottleneck) {
        flow += bottleneck;
        residual.flow -= bottleneck;
    }

    public String toString(int s, int t) {
        String u = from == s ? "s": from == t ? "t" : String.valueOf(from);
        String v = to == s ? "s" : t == to ? "s" : String.valueOf(to);
        return String.format(
                "Edge %s -> %s | flow = %d | capacity = %d | is residual: %s",
                u, v, flow, capacity, isResidual()
        );
    }
}
