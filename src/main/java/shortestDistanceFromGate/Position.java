package shortestDistanceFromGate;

public class Position {
	
	private int rowIndex;
	private int columnIndex;
	
	public int getRowIndex() {
		return rowIndex;
	}
	public void setRowIndex(int rowIndex) {
		this.rowIndex = rowIndex;
	}
	public int getColumnIndex() {
		return columnIndex;
	}
	public void setColumnIndex(int columnIndex) {
		this.columnIndex = columnIndex;
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return rowIndex + columnIndex + rowIndex*columnIndex;
	}
	
	

}
