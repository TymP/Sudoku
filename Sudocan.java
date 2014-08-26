import java.util.Random;

public class Sudocan {
	public int[][] points;
	public int size;
	private Random rn;
	
	public Sudocan(int size){
		//initialise instance variables
		this.size=size;
		this.points = new int[size][size];
				
		//populate points with zeros
		for(int i =0; i<size; i ++){
			for (int j = 0;j<size;j++){
				points[i][j] = 0;
			}
		}
	}
	/*
	 * Assigns every term in points to random integer between 0 and the size of the array.
	 */
	public void randomize(){
		Random rn = new Random();
		for(int i =0; i<size; i ++){
			for (int j = 0;j<size;j++){
				points[i][j] = (rn.nextInt(size)+1);
			}
		}
	}
	
	public int[] shuffle(int[] set){
		//create replacement blank card
			//take random card 1
		Random rnd = new Random();
		//Initialise placeholders
		int strokes = 0;
		int choiceOne;
		int choiceTwo;
		while(strokes<15){
			strokes++;
			choiceOne = rnd.nextInt(set.length);
			choiceTwo = rnd.nextInt(set.length);
							
			int replacement = set[choiceOne];
			set[choiceOne] = set[choiceTwo];
			set[choiceTwo] = replacement;
		}
		return set;
		
	}
	
	public void print(){
		for(int[] line: points){
			System.out.println(" ");
			for(int point : line){
				System.out.print(point);
			}
		}
	}
	

}
