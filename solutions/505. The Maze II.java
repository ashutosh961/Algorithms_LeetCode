​
class Solution {
     public int shortestDistance(int[][] maze, int[] start, int[] destination)
     {
        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        PriorityQueue<int[]> q = new PriorityQueue<>((a,b) -> a[2] - b[2]);
        q.add(new int[]{start[0], start[1], 0});
        boolean[][] visited = new boolean[maze.length][maze[0].length];
         
         
        while(!q.isEmpty()){
            int[] cur = q.remove();
            int curX = cur[0];
            int curY = cur[1];
            int cost = cur[2];
            visited[curX][curY] = true;
            if(curX == destination[0] && curY == destination[1])
                return cost;
            for(int[] direction : directions){
                int count = 1;
                int nextX = curX + direction[0];
                int nextY = curY + direction[1];
                while(nextX >=0 && nextX < maze.length && nextY >=0 && nextY < maze[0].length 
                     && maze[nextX][nextY] == 0){
                    nextX += direction[0];
                    nextY += direction[1];
                    count++;
                }
                count--;
                nextX -= direction[0];
                nextY -= direction[1];
                if(visited[nextX][nextY] == false){
                    q.add(new int[] {nextX, nextY, cost + count});
                }
​
            }
        }
         
        return -1;
    }
}
​
