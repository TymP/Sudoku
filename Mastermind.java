
public class Mastermind {

	public void loop(int size){
		Sudocan sudocan = new Sudocan(size);
		sudocan.randomise2();
		Judge judge = new Judge();
		boolean sudoku = false;
		while(!sudoku){
			sudocan.randomise2();
			sudoku = true;
			//text made redundant by randomise2 method
			//if(judge.repeatInRow(sudocan.points)){
				//sudoku = false;
			//}
			if(judge.repeatInColumn(sudocan.points)){
				sudoku = false;
			}
		}
		sudocan.print();
	}
	
	public void print(int[][] grid){
		for(int[] line : grid){
			System.out.println(" ");
			for(int num : line){
				System.out.print(num + " ");
			}
		
		}

	}

}
