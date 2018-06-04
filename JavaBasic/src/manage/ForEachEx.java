package manage;

public class ForEachEx {

	public static void main(String[] args) {
		// for each 
		// 	Iteration for usage elements in Array easily. 
		int[] arr = {1,2,3,4,5};
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		for(int num : arr) {
			num += 100; // It is not element of Array. It is local variable.
			System.out.println(num);
		}
		
		for(int num : arr) {
			System.out.println(num); // CAUTION! The value of element was not changed. 
		}
		
		System.out.println("==============");
		
		Data[] arr2 = new Data[3];
		arr2[0]= new Data();
		arr2[1]= new Data();
		arr2[2]= new Data();
		
		for(Data d: arr2) {
			System.out.println(d.num);
		}
		for(Data d: arr2) {
			d.num = 111; // In this case, value has been changed.
			//Local variable d has the reference for each element of arr2 and this statement is change the value at the referred address. 
		}
		for(Data d: arr2) {
			System.out.println(d.num);
		}
		
		// to sum up with above, 
		// sooner one(for each with int num) : Call by value. 
		// 	in the for each statement, value is copied to local variable and it is not effected on original value. 
		// later one(for each with Data d) : Call by reference. 
		// 	in the for each statement, shallow copy occurred and it can be changed original value in the heap memory. 
		
	}

}

class Data{
	int num; 
}