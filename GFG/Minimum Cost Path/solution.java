class Solution
{
    int[] dx = { -1, 0, 1, 0 };
    int[] dy = { 0, 1, 0, -1 };
    int row,col;

	class Cell {
        int x;
        int y;
        int distance;
     
        Cell(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
 
    
    class distanceComparator implements Comparator<Cell> {
        public int compare(Cell a, Cell b) {
            if (a.distance < b.distance) {
                return -1;
            }
            else if (a.distance > b.distance) {
                return 1;
            }
            else {return 0;}
        }
    }
 
    boolean isInsideGrid(int i, int j)
    {
        return (i >= 0 && i < row &&
                j >= 0 && j < col);
    }
    public int minimumCostPath(int[][] grid)
    {
        // Code here
        row=grid.length;
        col=grid[0].length;
        int[][] dist = new int[row][col];
     
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }
     
    
    dist[0][0] = grid[0][0];
     
    PriorityQueue<Cell> pq = new PriorityQueue<Cell>(
                  row * col, new distanceComparator());
                   
    // Insert source cell to priority queue
    pq.add(new Cell(0, 0, dist[0][0]));
    while (!pq.isEmpty())
    {
        Cell curr = pq.poll();
        for(int i = 0; i < 4; i++)
        {
            int rows = curr.x + dx[i];
            int cols = curr.y + dy[i];
             
            if (isInsideGrid(rows, cols))
            {
                if (dist[rows][cols] > 
                    dist[curr.x][curr.y] + 
                    grid[rows][cols])
                {
                     
                 
                    if (dist[rows][cols] != Integer.MAX_VALUE)
                    {
                        Cell adj = new Cell(rows, cols, 
                                       dist[rows][cols]);
                                        
                        pq.remove(adj);
                    }
     
                    dist[rows][cols] = dist[curr.x][curr.y] +
                                       grid[rows][cols];
                                        
                    pq.add(new Cell(rows, cols, 
                               dist[rows][cols]));
                }
            }
        }
    }
    return dist[row - 1][col - 1];
    }
}
