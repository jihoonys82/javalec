package condition.loop;

public class ForEx_08 {

	public static void main(String[] args) {
		
		// multiple for loop
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("i : " + i + ", j : " + j);
			} // iterate 3*3, 9 times 
			System.out.println("======");
		} // iterate 3 times
	}

}
