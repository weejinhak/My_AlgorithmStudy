package Queue;

import java.util.*;

public class Class_1260{

    static int N,V;
    static int arr[][],visited[];

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        int M = sc.nextInt();
        V = sc.nextInt();

        arr = new int[N+1][N+1];
        for(int i = 1; i <= M; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr[x][y]=1;
            arr[y][x]=1;
        }

        visited = new int[N+1];
        DFS(V);
        System.out.println();
        visited = new int[N+1];
        BFS(V);
    }

    private static void DFS(int v){
        System.out.println(v + " ");
        visited[v] = 1;
        for(int i = 1; i <= N; i++){
            if(arr[v][i] == 1 && visited[i] == 0){
                DFS(i);
            }
        }
    }
    private static void BFS(int v){
        Queue<Integer> queue = new LinkedList<>();
        visited[v] = 1;
        queue.add(v);
        while(!queue.isEmpty()){
            int temp = queue.peek();
            queue.poll();
            System.out.println(temp + " ");
            for(int i = 1; i <= N; i++){
                if(arr[temp][i] ==1 && visited[i] == 0){
                    visited[i] =1;
                    queue.add(i);
                }
            }
        }
    }
}