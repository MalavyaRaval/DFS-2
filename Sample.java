// Time Complexity :O(mn)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    private int m;
    private int n;
    public int numIslands(char[][] grid) {
        m = grid.length;
        if(grid==null||m==0) return 0;
        n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1') {
                    count ++;
                    dfs(grid,i,j);
                }
            }
        }
        return count;
    }
    private void dfs(char[][] grid,int i, int j){
        if(i<0||i>=m||j<0||j>=n||grid[i][j]=='0') return;
        int[][] dirs = new int[][] {{0,1},{1,0},{-1,0},{0,-1}};
        grid[i][j] = '0';
        for(int[] dir : dirs){
            int r = i+dir[0];
            int c = j+dir[1];
            dfs(grid,r,c);
        }
    }
}