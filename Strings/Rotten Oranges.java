//Rotten Oranges (BFS) 

public class Solution{
	public int orangesRotting(int [][] grid){
		if(grid==null || grid.length==0){
			return 0;
		}
		int rows=grid.length;
		int cols=grid[0].length;
		Queue<int[]> queue= new LinkedList<>();
		int count_fresh=0;
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				if(grid[i][j]==2){
					queue.add(new int[]{i,j});
				}
				if(grid[i][j]!=0){
					count_fresh++;
				}
			}
		}
		
		if(count_fresh ==0){
			return 0;
		}
		int days=0; 
		int count=0;
		int [] dx={0,0,1,-1};
	    int [] dy={1,-1,0,0};
		while(!queue.isEmpty()){
			int size = queue.size();
			count+=size;
			for(int i=0;i<size ;i++){
				int [] point=queue.poll();
				for(int j=0;j<4;j++){
					int x=point[0]+dx[i];
					int y=point[1]+dy[i];
					
					if(x< 0 || x> rows || y<0 || y > cols || grid[x][y]==2){
						continue;
					}
					grid[x][y]=2;
					queue.add(new int[]{x,y});
				}
				
			}
			if(queue.size()!=0){
				days++;
			}
		}
		return (count==count_fresh ) ? days :-1;
	}
}

time complexcity : o(n * m *4)
space complexcity : o(n*m)