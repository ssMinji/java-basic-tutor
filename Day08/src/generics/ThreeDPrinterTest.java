package generics;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();
		
		printer.setMaterial(new Powder()); // Powder가 들어감 
		
		Powder powder = (Powder) printer.getMaterial(); // Object 타입으로 리턴되기 때문에 Powder로 다운캐스팅 필요 
		
		// 이러한 작업을 제네릭으로 해보자 
		// ThreeDPrinter 클래스 수정 후 
		
		// 사용할 때는 T라고 공통적으로 설정했던 문자에 내가 사용할 참조형 타입을 쓴다 
		ThreeDPrinter<Powder> printer = new ThreeDPrinter<Powder>();
		
		printer.setMaterial(new Powder()); 
		
		Powder powder = printer.getMaterial(); // 이제 다운캐스팅 과정 불필요 
		// 이것이 제네릭 프로그래밍 방식 
		
		//  ThreeDPrinter에 toString 오버라이딩해보기 
		System.out.println(printer); // 재료는 powder
		
		
		// plastic에 대해서도 해보기 
		ThreeDPrinter<Plastic> printerPlastic = new ThreeDPrinter<Plastic>();
		printerPlastic.setMaterial(new Plastic()); 
		Plastic plastic = printerPlastic.getMaterial(); 
		System.out.println(printerPlastic); // 재료는 Plastic
		
		/*
		 * ThreeDPrinter라는 하나의 클래스를 만들고 여러 자료형에 대해 같이 쓰일 수 있도록 만든 것 
		 * */
		
		// Water 클래스 추가 
		
		ThreeDPrinter<Water> printerWater = new ThreeDPrinter<Water>();
		printerPlastic.setMaterial(new Water()); 
		System.out.println(printerWater); // 재료는 Water
		// 하지만 프린터에는 water가 들어가면 안됨. 그러나 문법적인 오류는 떨궈주지 않음 
		// 이런 경우  제한을 두고 싶을 수도 있거나, 혹은 메서드의 기능을 추가하고 싶을 수도 있음 
		// 상위클래스인 Material 클래스 만들고 Plastic, Powder 클래스에서 extends Material
		
		// 만들고 나면, Water는 쓸 수 없는 것 확인 
		// 또한,
		// material. 하면 Object의 메서드들만 보임 
		// Material 클래스를 추상클래스로 변경 
	}

}
