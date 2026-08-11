// Last updated: 11/08/2026, 14:17:59
class Solution {
    public int islandPerimeter(int[][] grid) {
        //1 is land
        int perimeter =0;
        int n=grid.length;
        int m=grid[0].length;

        int[] dr = {-1,1,0,0};
        int[] dc ={0,0,-1,1};

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    perimeter +=4 ;
                    for(int k=0;k<4;k++){
                        int nr=i+dr[k];
                        int nc=j+dc[k];
                        if(nr>=0&&nr<n&&nc>=0&&nc<m&& grid[nr][nc]==1){
                            perimeter--;
                        }
                    }

                }
            }
        }
        return perimeter ;

        
    }
}
