//Rat in a Maze 


public class RatMaze{
	
	static int N;
	
	void printSolution(int sol[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                    " " + sol[i][j] + " ");
            System.out.println();
        }
    }
	
	boolean isSafe(int maze[][] , int x , int y){
		return (x > =0 && x <N && y>=0 && y<N  && maze[x][y]==1);
	}
	
	boolean solveMaze(int maze[][]){
		int sol[][] = new int[N][N];
		
		if(solveMazeUtil(maze,0,0,sol)==false){
			system.out.println("path does not exist");
		     return false;
		}
        printSolution(sol);
        return true;		
	}
	
	boolena solveMazeUtil(int [][] maze, int x, int y, int [][] sol){
		if(x==N-1 && y==N-1 && maze[x][y]==1 ){
			sol[x][y]=1;
			return true;
		}
		
		if(isSafe(maze, x, y)==true){
			if(sol[x][y]==1)
				return false;
			
			sol[x][y]=1;
		
		if(solveMazeUtil(maze,x+1,y,sol)){
			return true;
		}
		
		if(solveMazeUtil(maze,x,y+1,sol))
			return true;
		
		sol[x][y]=0;
		return false;
	}
	return false;
}


time complexcity : 2 * (n*n)
space complexcity : n*n 	