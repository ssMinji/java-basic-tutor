package org.tutorials.javatutorials.poly;


interface tutor{
	public void tutoring();
}
interface youtuber{
	public void fliming();
}
interface programmer{
    public void coding();
}

class Jack implements programmer, tutor{
	public void tutoring() {
		System.out.println("teach kids");
	}
    public void coding(){
        System.out.println("take 2 days");
    }
}
class Jenny implements programmer, youtuber{
	public void fliming() {
		System.out.println("flim video");
	}
    public void coding(){
        System.out.println("take 3 days");
    }
}

public class Workplace {

	public static void main(String[] args) {
		// 현재 직장.이라는 곳에서 각 사람을 만들어내고 있기 때문에
		// 프로그래머 이외의 기능은 필요가 없다. 따라서 인터페이스 중 프로그래머로 데이터 타입을
		// 지정하면 다른 인터페이스에서의 기능이 어떻든 상관이 없다. 
		programmer emp1 = new Jack();
		programmer emp2 = new Jenny();
		
		// coding을 요청했을 때, 즉 동일한 요청을 하지만
		// 다른 결과물을 만들어낸다. 라는 것이 다형성의 핵심 
		emp1.coding(); // take 2 days
		emp2.coding(); // take 3 days
	}

}
