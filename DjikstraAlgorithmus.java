public class DijkstraAlgorithmus
{
    private int[][] aAdjazenzmatrix;
    private String[] aKnoten;
    private Graph aGraph;
    public DijkstraAlgorithmus()
    {
        this.aGraph = new Graph();
        this.loadMatrix();
        this.loadVertices();
        this.matrixToGraph();
        
    }
    public void loadMatrix() 
    {
        this.aAdjazenzmatrix = new int[][]
        {       //a, b, c, d, e, f, g, h
            /*a*/{0, 2, 3, 0, 0, 0, 0, 0},
            /*b*/{2, 0, 0, 1, 0, 5, 4, 1},
            /*c*/{3, 0, 0, 0, 3, 0, 0, 0},
            /*d*/{0, 1, 0, 0, 0, 1, 0, 0},
            /*e*/{0, 0, 3, 0, 0, 1, 1, 0},
            /*f*/{0, 0, 3, 0, 0, 1, 1, 0},
            /*g*/{0, 5, 0, 1, 1, 0, 0, 0},
            /*h*/{7, 4, 0, 0, 1, 0, 0, 2}
        };
    }
    
    public void searchForShortestDistanceBetweenPoints(String pStartVertexName, String pEndVertexName) 
    {
        Vertex lStartVertex = this.aGraph.getVertex(pStartVertexName);
        Vertex lEndVertex = this.aGraph.getVertex(pEndVertexName);
        Vertex currentVertex = lStartVertex;
        
        while (lEndVertex != currentVertex)
        {
            List<Edge> edges = this.aGraph.getEdges();
            edges.toFirst();
            while(edges.hasAccess())
            {
                //test
            }
        }
    }
    
    private void matrixToGraph() {
        for(int i = 0 ; i < this.aAdjazenzmatrix.length ; i++)
       {
            int[] lArray = this.aAdjazenzmatrix[i];
            for (int j = 0 ; j < lArray.length ; j++)
            {
                int lDistance = lArray[j];
                if(lDistance > 0)
                {
                    this.aGraph.addEdge(new Edge(this.aGraph.getVertex(this.aKnoten[i]), this.aGraph.getVertex(this.aKnoten[j]), lDistance));
                }
            }
        }
    }
    
  
    
    private void loadVertices()
    {
        this.aKnoten = new String[] 
        {
          "A",
          "B",
          "C",
          "D",
          "E",
          "F",
          "G",
          "H"
        };
        
        this.aGraph.addVertex(new Vertex("A"));
        this.aGraph.addVertex(new Vertex("B"));
        this.aGraph.addVertex(new Vertex("C"));
        this.aGraph.addVertex(new Vertex("D"));
        this.aGraph.addVertex(new Vertex("E"));
        this.aGraph.addVertex(new Vertex("F"));
        this.aGraph.addVertex(new Vertex("G"));
        this.aGraph.addVertex(new Vertex("H"));
    }
}
