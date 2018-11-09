
public class TTT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] board = new char[3];//single dimension array
		board[0] = '-';
		board[1] = '-';
		board[2] = '-';
		
		for(char token:board) {//enhanced for loop
			System.out.println(token);
		}
		
		char[][] gameboard = new char[3][3];//2D array [rows][columns]
		
		//fill the array
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				gameboard[row][col] = '-';
			}
		}
		
		//print array
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				System.out.print(gameboard[row][col]);
			}
			System.out.println();
		}
		
		gameboard[1][1] = 'X';
		
		for(int row = 0; row < gameboard.length; row++) {
			for(int col = 0; col < gameboard[row].length; col++) {
				System.out.print(gameboard[row][col]);
			}
			System.out.println();
		}
		
		int player = 1;//tracks who's turn it is
		//ask for input
		//place the token
		//switch player to 2
		player = 2;
		//ask for input
		
	}
}
