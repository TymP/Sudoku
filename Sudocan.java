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
		//Brute Force Method
		Random rn = new Random();
		for(int i =0; i<size; i ++){
			for (int j = 0;j<size;j++){
				points[i][j] = (rn.nextInt(size)+1);
			}
		}
	}
	/*
	 * Takes in an array of integers and returns them in a random order
	 */
	public int[] shuffle(int[] set){
		
		Random rnd = new Random();
		//Initialise placeholders
		int strokes = 0;
		int choiceOne;
		int choiceTwo;
		while(strokes<30){
			strokes++;
			choiceOne = rnd.nextInt(set.length);
			choiceTwo = rnd.nextInt(set.length);
							
			int replacement = set[choiceOne];
			set[choiceOne] = set[choiceTwo];
			set[choiceTwo] = replacement;
		}
		return set;
		
	}
	public void randomise2(){
		//Initialise and shuffle method: sets each row of the matrix equal 
		//to an array of unique integers in the range of the matrix's size,
		//then shuffles each row. 
		for(int i =0; i<size;i++){
			for(int j = 0;j<size;j++){
				points[i][j] = j+1;
			}
		}
		//shuffle each line
		for(int i =0;i<size;i++){
			points[i] = shuffle(points[i]);
		}
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
