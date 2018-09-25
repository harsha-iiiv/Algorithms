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

        boolean resu=isBfs(gp,det,2);
        if(resu)
            System.out.println("yes");
        else
            System.out.println("No");

    }

    static boolean isBfs(int[][] gp,int[] visited,int i) {
        Queue<Integer> q = new Queue<>();
        int d=0;
        int k=0;
        int[] exp = new int[visited.length];
        for(  i=0;i<visited.length;i++) {
            visited[i] = -1;
        }
            q.enqueue(i);
            while(q.isEmpty())
            {
                try {
                    i = q.dequeue();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                visited[i]  = 1;

                for(int j=0;j<visited.length;j++) {
                    if (gp[i][j] == 1 && visited[j] == 0) {
                        visited[j] = 1-visited[i];
                         q.enqueue(j);
                    }
                    else if (gp[i][j]==1 && visited[j]==visited[i])
                        return false;


                }

             }
             return true;

       }
}






