import sun.misc.Queue;

import java.util.*;
public class Gbi {

    public static void main(String... s) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int[][] gp = new int[v][v];
     int[] det = new int[v];
        for (int i = 0; i < v; i++)
            for (int j = 0; j < v; j++)
                gp[i][j] = sc.nextInt();

        Bfs(gp,det,2);

    }

    static void Bfs(int[][] gp,int[] visited,int i) {
        Queue<Integer> q = new Queue<>();
        int d=0;
        int k=0;
        int[] exp = new int[visited.length];
        for(  i=0;i<visited.length;i++) {
            visited[i] = 0;
        }
            q.enqueue(i);
            while(q.isEmpty())
            {
                try {
                    exp[k] = q.dequeue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                visited[i]  = 1;

                for(int j=0;j<visited.length;j++) {
                    if (gp[i][j] == 1 && visited[j] == 0) {
                        d++;
                        q.enqueue(gp[i][j]);
                    }
                    visited[j] =1;


                }

       System.out.println(visited );
            }

       }
}






