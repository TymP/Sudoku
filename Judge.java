
public class Judge {

	public boolean repeats(int[] set){
		boolean result = false;
		int count = 0;
		for(int i =0;i<set.length;i++){
			count =0;
			for(int j = 0;j<set.length;j++){
				if(set[i]==set[j]){
					count++;
				}
			}
			if(count>1){
				result = true;
				break;
			}
		}
	return result;
	}
	
	public boolean repeatInRow(int[][] matrix){
		boolean result = false;
		for(int i =0; i<matrix.length;i++){
			if(repeats(matrix[i])){
				result = true;
				break;
			}
		}
		return result;
	}
	
	public int[][] transpose(int[][] matrix){
		int[][] transpose = new int[matrix.length][matrix.length];
		for(int i =0; i<matrix.length;i++){
			for(int j = 0; j< matrix.length; j++){
				transpose[i][j] = matrix[j][i];
			}
		}
		return transpose;
						
	}
		
	public boolean repeatInColumn(int[][] matrix){
		int[][] transpose = transpose(matrix);
		return repeatInRow(transpose);
			
	}
			
}
