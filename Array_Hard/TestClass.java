package Array_Hard;


public class TestClass {
   //  static class Edge {
   //      int src;
   //      int nbr;
   //      int wt;
  
   //      Edge(int src, int nbr, int wt) {
   //         this.src = src;
   //         this.nbr = nbr;
   //         this.wt = wt;
   //      }
   //   }
   //    public static void main(String args[] ) throws Exception {
   //      Scanner sc = new Scanner(System.in);
   //      int vtces = sc.nextInt();
   //      ArrayList<Edge>[] graph = new ArrayList<>()[];
   //      for (int i = 0; i < vtces; i++) {
   //         graph[i] = new ArrayList<>();
   //      }
  
   //      HashMap<Integer,Integer> map = new HashMap<>();
   //        for(int i=0;i<vtces;i++){
   //            map.put(sc.nextInt(),i);
   //        }
  
   //      int edges = sc.nextInt();
   //      for (int i = 0; i < edges; i++) {
   //         int v1 = map.get(sc.nextInt());
   //         int v2 = map.get(sc.nextInt());
   //         int wt = sc.nextInt();
   //         graph[v1].add(new Edge(v1, v2, wt));
   //         graph[v2].add(new Edge(v2, v1, wt));
   //      }
  
   //      int src = map.get(sc.nextInt());
   //      int dest = map.get(sc.nextInt());
  
   //      int min_wt = Integer.MAX_VALUE;
  
   //      PriorityQueue<Pair> queue = new PriorityQueue<>();
   //      queue.add(new Pair(src, src + "", 0));
   //      boolean[] visited = new boolean[vtces];
   //      while(queue.size() > 0){
   //         Pair rem = queue.remove();
  
   //         if(visited[rem.v] == true){
   //            continue;
   //         }
   //         visited[rem.v] = true;
   //         if(rem.v == dest) Math.min(min_wt,rem.wsf);
           
   //         for (Edge e : graph[rem.v]) {
   //            if (visited[e.nbr] == false) {
   //               queue.add(new Pair(e.nbr, rem.psf + e.nbr, rem.wsf + e.wt));
   //            }
   //         }
   //      }
  
   //      System.out.print(min_wt);
  
   //    }
  
   //    static class Pair implements Comparable<Pair> {
   //      int v;
   //      String psf;
   //      int wsf;
  
   //      Pair(int v, String psf, int wsf){
   //         this.v = v;
   //         this.psf = psf;
   //         this.wsf = wsf;
   //      }
  
   //      public int compareTo(Pair o){
   //         return this.wsf - o.wsf;
   //      }
   //   }
}
