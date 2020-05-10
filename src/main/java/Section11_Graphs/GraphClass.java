package Section11_Graphs;

public class GraphClass {
    int v;
    NodeGraph newNode;
    AdjList array[];

    public GraphClass(int v) {
        this.v = v;
        this.array = new AdjList[v];
        for (int i = 0; i < v ; i++) {
            this.array[i] = new AdjList();
        }
    }

    void addEdge(GraphClass g, int src, int dest){
        newNode = new NodeGraph(dest);
        newNode.next = g.array[src].head;
        g.array[src].head = newNode;

        newNode = new NodeGraph(src);
        newNode.next = g.array[dest].head;
        g.array[dest].head = newNode;
    }

    void printGraph(GraphClass g){
        int v;
        for(v=0;v < g.v;++v){
            NodeGraph pCrawl = g.array[v].head;
            System.out.println();
            System.out.println("Adjacency list of vertex "+v);
            System.out.print("head");
            while(pCrawl != null){
                System.out.print(pCrawl.next);
                pCrawl = pCrawl.next;
            }
            System.out.println();
        }
    }
}
