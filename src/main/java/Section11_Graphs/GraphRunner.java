package Section11_Graphs;

public class GraphRunner {
    public static void main(String[] args) {
        int V = 5;
        GraphClass g = new GraphClass(V);
        g.addEdge(g,0,1);
        g.addEdge(g,0,4);
        g.addEdge(g,1,2);
        g.addEdge(g,1,3);
        g.addEdge(g,1,4);
        g.addEdge(g,2,3);
        g.addEdge(g,3,4);

        g.printGraph(g);
    }
}
