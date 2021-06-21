
public class board
{

		int x = 8;
		int y = 8;
		int board [] [] = new int [x] [y];
		 
	public int [] [] getBoard()
	{
		return board;
	}
	
	public int updateBoard()
	{
		return 0;
	}
	
	public int [] [] newBoard()
	{
		int board [] [] = {{8,9,10,11,12,10,9,8},
							{7,7,7,7,7,7,7,7},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0},
							{1,1,1,1,1,1,1,1},
							{2,3,4,5,6,4,3,2}};
		return board;
	}
}
