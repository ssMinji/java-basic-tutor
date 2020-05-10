package org.tutorials.javatutorials.interfaces;

// 이것은 가짜 클래스 
// 계산기 클래스가 필요하고 이것을 사용한 클래스가 필요한데, 
// 사용자입장에서 계산기 클래스가 개발이 안되었다고했을때 
// 계산기클래스에대한 가짜 클래스를 만들어놓고 
// 로직은 구현해놓지 않고 
// 계산하는 메소드 역시 계산된 결과가 아닌 그냥 숫자를 박아놓은 것
// 따라서 구체적인 로직이 잘 만들어져서 나중에 사용할 수 있을 것이라고 가정하고
// 나머지 로직을 구현하는 것 
class CalculatorDummy{
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
// 인터페이스 적용 후 
// 그렇다면 이 더미라는 클래스가 후에 완성되서 대체될 때
// 동작이나 로직이 달라지지 않는다는 것을 보장받을 수 있음 
class CalculatorDummy implements Calculatable {
    public void setOprands(int first, int second, int third){}
    public int sum(){
        return 60;
    }
    public int avg(){
        return 20;
    }
}
public class CalculatorConsumer {
	
	public static void main(String[] args) {
		CalculatorDummy c = new CalculatorDummy();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());
        
        // 만약 calculator라는 클래스가 개발이 완료되었다! 하면
        Calculator c = new Calculator();
        c.setOprands(10,20,30);
        System.out.println(c.sum()+c.avg());

	}

}
