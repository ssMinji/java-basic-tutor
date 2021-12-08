package org.tutorials.javatutorials.day03;

// 코드 개선하기 
// 위의 예제는 오버로딩을 설명하기 위한 예제일 뿐 현실적이지 않다. 
// 더 많은 값을 대상으로 연산을 해야 한다면 어떻게 해야할까?
class Calculator9{
    int[] oprands;
     
    // 매개변수로 배열을 사용하고 있다. 
    // 이렇게 하면 하나의 인자로 여러개의 값을 받을 수 있다. 
    // 방금의 예제와의 차이점: setOprands를 매개변수 개수에따라 여러개 오버로딩하지 않아도됨
    public void setOprands(int[] oprands){
        this.oprands = oprands;
    }
     
    public void sum(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total);
    }
      
    public void avg(){
        int total = 0;
        for(int value : this.oprands){
            total += value;
        }
        System.out.println(total/this.oprands.length);
    }
}
public class OverloadingDemo4 {

	public static void main(String[] args) {
		Calculator9 c1 = new Calculator9();
        c1.setOprands(new int[]{10,20});
        c1.sum();       
        c1.avg();
        c1.setOprands(new int[]{10,20,30});
        c1.sum();       
        c1.avg();   

	}

}
