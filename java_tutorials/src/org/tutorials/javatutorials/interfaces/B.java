package org.tutorials.javatutorials.interfaces;

interface I1{
    public void x();
}
 
interface I2{
    public void z();
}
 
class B implements I1, I2{
    public void x(){}
    public void z(){}   
}

// 하나의 클래스는 여러개의 인터페이스를 구현할 수 있다는 것
// I1의 x메소드와 I2의 z메소드를 반드시 구현해야 함 
// 클래스 상속에서는 상속받는 클래스는 하나의 부모클래스만을 상속받을 수 있다는 점에서 차이점