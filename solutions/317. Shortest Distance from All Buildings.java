class Solution {
    int[][] dirs = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    public int shortestDistance(int[][] grid) {
        int rc = grid.length;
        if(rc == 0) {
            return 0;
        }
        int cc = grid[0].length;
        int[][] distToAllBuildings = new int[rc][cc];
        int[][] reachableBuildings = new int[rc][cc];
        int buildingCount = 0;
        
        for(int i = 0; i < rc; i++) {
            for(int j = 0; j < cc; j++) {
                if(grid[i][j] == 1) {
                    calcDistToEmptyCells(grid, distToAllBuildings, reachableBuildings, i, j, rc, cc);
                    buildingCount++;
                }
            }
        }
        
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < rc; i++) {
            for(int j = 0; j < cc; j++) {
                if(grid[i][j] == 0 && buildingCount == reachableBuildings[i][j]) {
                    min = Math.min(min, distToAllBuildings[i][j]);   
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
    
    public void calcDistToEmptyCells(int[][] grid, int[][] distToAllBuildings, int[][] reachableBuildings, int row, int col, int rc, int cc) {
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[rc][cc];
        q.add(new int[]{ row, col });
        visited[row][col] = true;
        int step = 0;
        
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                int[] vertex = q.poll();
                int r = vertex[0];
                int c = vertex[1];
                distToAllBuildings[r][c] += step;
                reachableBuildings[r][c]++;
                for(int[] dir : dirs) {
                    int nextRow = r + dir[0];
                    int nextCol = c + dir[1];
                    if(nextRow >= 0 && nextRow < rc && nextCol >= 0 && nextCol < cc && !visited[nextRow][nextCol] && grid[nextRow][nextCol] == 0) {
                        q.add(new int[]{ nextRow, nextCol });
                        visited[nextRow][nextCol] = true;
                    }
                }
            }
            step++;
        }
    }
}
