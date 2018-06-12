package generics;

class Class06<T1, T2> {
	private T1 data1;
	private T2 data2;
	
	public T1 getData1() {
		return data1;
	}
	public void setData1(T1 data1) {
		this.data1 = data1;
	}
	public T2 getData2() {
		return data2;
	}
	public void setData2(T2 data2) {
		this.data2 = data2;
	}
	
	public <K1, K2> K2 change(K1 data) {
		K2 result = (K2)data;
		return result;
	}
	
}

public class GenericsEx_06_MultiGeneric {
	public static void main(String[] args) {
		
		Class06<Integer, String> c06 = new Class06<>();
		
		c06.setData1(111);
		c06.setData2("Apple");
		
		Integer data = 100;
		Double res= c06.change(data); //it occurs logical error. (Class cast exception)
//		Double res = ((Integer)c06.change(data)).doubleValue(); // return type : Double
//		c06.change(data); // return type : Object 
		

	}
}
