package condition.loop;

public class EtcEx_02 {

	public static void main(String[] args) {
		
		// Labeled break
		//  it is not recommend because of readability.
		
		Apple: // label 
		for(int i=0; i<10; i++) {
			for(int j=0; j<10 ; j++) { //if use break without label it returns to here
				if(j==5) break Apple; //label break - goto outside of label(outer) loop.  
				
				System.out.println(i +":" +j);
			}
		}

		
	}

}
