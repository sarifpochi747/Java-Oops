
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example_week6;

/**
 *
 * @author sarif
 */
import java.util.*;
public class Lab4_11 {
    public int n,m;
    int N =105;
    int [][] g = new int[N][N];
    
    public void dfs(int x, int y,int n,int m ) {
        int[] dx = {1, -1, 0, 0, 1, 1, -1, -1};
        int[] dy = {0, 0, 1, -1, 1, -1, 1, -1};
        for (int i = 0; i < 8; i++) {
            int fx = x + dx[i];
            int fy = y + dy[i];
            if (fx >= 0 && fy >= 0 && fx < n && fy < m && g[fx][fy] == '@') {
                g[fx][fy] = '*';
                dfs(fx, fy,n,m);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Lab4_11 obj = new Lab4_11();
        int r = sc.nextInt();
        int c = sc.nextInt();
        // create array
        
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                char n = sc.next().charAt(0);
                obj.g[i][j] =  n;
            }
        }
        
        //create  object
        int ans = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (obj.g[i][j] == '@') {
					obj.dfs(i,j,r,c);
					ans++;
				}
			}
		}
        System.out.print(ans);
    }
}
