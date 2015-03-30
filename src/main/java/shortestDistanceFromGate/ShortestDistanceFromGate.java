package shortestDistanceFromGate;

import java.util.Map;

public class ShortestDistanceFromGate {
	
	private static volatile ShortestDistanceFromGate instance;
	private char maze[][];
	private ShortestDistanceFromGate(){}
	
	public static ShortestDistanceFromGate getInstance(){
		if(instance == null){
			synchronized(ShortestDistanceFromGate.class){
				instance = new ShortestDistanceFromGate();
			}
		}
		
		return instance;
		
	}
	
	public void createMaze(int row, int column, Map<Position, Character> pos){
		maze =  new char[row][column];
		for (Position p : pos.keySet()){
			maze[p.getRowIndex()][p.getColumnIndex()] = pos.get(p);
		}
	}
	
	public char[][] solveMaze(){
		if (maze == null){
			return null;
		}
		//scan G points
		//create a queue for all G
		//start from first G point 
		//pop it and add surrounding G points in Q
		//iterate for all G one by one
		//if intersection(if value is present) then check the min
		//if value present and min dont add the node in goal
		
		return null;
	}

	public char[][] getMaze() {
		return maze;
	}

	public void setMaze(char maze[][]) {
		this.maze = maze;
	}
	

}
