package variables;

public class VariableRefEx {
	// var num = 10; // 불가능. 지역변수에 대해서만 가능 
	

	public static void main(String[] args) {

		var dNum = 3.14;
		
		dNum = 3;
		System.out.println(dNum);
	}

}
