
public class king {

	public int [] [] getMovementOptions()
	{
		int position[] = {4,4};

		int spaces[][] = new int [8] [8];

		int all_spaces[][] = getAllPossibleSpaces(int position[]);

		return spaces;
	}

	private int [] [] getAllPossibleSpaces(int position[])
	{
		int x = position[0];
		int y = position[1];

		int all_spaces[8][2] = {{x-1, y-1},
		                        {x, y-1},
		                        {x+1, y-1},
		                        {x-1, y},
		                        {x+1, y},
		                        {x-1, y+1},
		                        {x, y+1},
		                        {x-1, y+1}};
		return all_spaces;
	}

}
