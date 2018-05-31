import java.util.Random;

public class MineSweeper {
	static final int XSIZE = 10;
	static final int YSIZE = 10;
	static final int MINE = 10;
	
	public static void main(String[] args) {
	
		int [][] map = new int[XSIZE][YSIZE];
	
		// ***meaning of each element value*** 
		// 9: mine 
		// 0: there is no mine near the sell
		// 1~8: no mine in the sell but there are some mine near the sell 

		System.out.println("=====Mine Setting=====");
		setMine(map);
		printMap(map);
		System.out.println("=====Find Prove=======");
		setProve(map);
		printMap(map);
		
	}
	
	public static void setMine (int[][] map) {
		int minePosition = 0; 
		for(int i=0;i<MINE;i++) {
			Random rand = new Random();
			minePosition = rand.nextInt(XSIZE*YSIZE);
			
			//minePosition = form 0 to XSIZE*YSIZE
			// mine's xposition = minePosition/XSIZE
			// mine's yposition = minePosition%XSIZE
			
			//duplicated mine position => do random again.
			if(map[minePosition/XSIZE][minePosition%XSIZE] != 0) {
				i--;
				continue;
			} else {
				map[minePosition/XSIZE][minePosition%XSIZE] = 9;				
			}
		}
	}
	
	public static void setProve (int[][] map) {
		for(int i=0;i<XSIZE;i++) {
			for(int j=0;j<YSIZE;j++) {
				if (map[i][j]==9) {
					//boundary check && mine check
					if(i>0 && j>0) {
						if (map[i-1][j-1] != 9) map[i-1][j-1]++;
					}
					if(i>0) {
						if(map[i-1][j] != 9) map[i-1][j]++;
					}
					if(i>0 && j<(YSIZE-1)) {
						if(map[i-1][j+1] != 9) map[i-1][j+1]++;
					}
					if(j>0) {
						if(map[i][j-1] !=9)	map[i][j-1]++;
					}
					if(j<(YSIZE-1)) {
						if(map[i][j+1] != 9) map[i][j+1]++;
					}
					if(i<(XSIZE-1) && j>0 ) {
						if(map[i+1][j-1] != 9) map[i+1][j-1]++;
					}
					if(i<(XSIZE-1)) {
						if(map[i+1][j] != 9) map[i+1][j]++;
					}
					if(i<(XSIZE-1) && j<(YSIZE-1)) { 
						if(map[i+1][j+1] != 9) map[i+1][j+1]++;
					}
				}
			}
		}
	}
	
	public static void printMap(int[][] map) {
		for(int i=0;i<XSIZE;i++) {
			for(int j=0;j<YSIZE;j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}
}
