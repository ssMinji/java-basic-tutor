package polymorphism;

class Animal {
	public void move(){
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move(){
		System.out.println("사람이 두발로 걷습니다.");
	}
	
	// 다운캐스팅 시간에 
	// 상속을 한다고해서 상위클래스의 메소드만 쓴다거나 오버라이딩을 하는 것이 아니라 
	// 클래스만의 독자적인 메서등 ㅣㅆ을 수 있음 
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이는 네발로 뜁니다.");
	}
	
	// 다운캐스팅 시간에 
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리는 하늘을 납니다.");
	}
	
	// 다운캐스팅 시간에 
	public void flying() {
		System.out.println("독수라기 하늘을 날아갑니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
		test.moveAnimal(new Eagle());

	}
	
	public void moveAnimal(Animal animal){ // Animal animal = new Human() 과 동일한 동작 
		
		animal.move();
		
		//결론 
		// 코드는 animal.move() 한줄인데 해당 코드의 결과가 다양함 
		// 이것이 다형성 
		
		// 다운캐스팅 시간에 
		//animal. // 예를들어 Tiger의 hunting을 호출하고 싶다고 해도 Animal로 업캐스팅되어 파라미터로 들어왔기 때문에 hunting 메서드는 자동완성에 보이지 않음 
		
		Human human = (Human) animal; // animal을 Human으로 형변환
		human.readBook();
		// 이 방법은 컴파일 에러는 나지 않지만, Human 이외에 Tiger, Eagle 이 파라미터로 들어온 경우 에러남 
		
		// 따라서 그럴때는 
		if(animal instanceof Human) { // animal로 들어온 인스턴스가 무엇인지 체크를 먼저 해줘야햠
			Human humann = (Human) animal; 
			humann.readBook();
		}else if (animal instanceof Tiger){
			Tiger tiger = (Tiger) animal;
			tiger.hunting();
		} else if(animal instanceof Eagle) {
			Eagle eagle = (Eagle) animal;
			eagle.flying();
		} else{ // 조건에 맞지 않는 타입이 들어왔을 떄의 처리 
			System.out.println("지원되지 않는 기능입니다. ");
		}
		
		// instanceof : 인스턴스의 타입 체크 . 다운캐스팅 시 사용되는 키워드 
	}

}
