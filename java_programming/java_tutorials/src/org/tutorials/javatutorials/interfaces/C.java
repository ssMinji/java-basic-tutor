package org.tutorials.javatutorials.interfaces;

interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class C implements I4{
    public void x(){}
    public void z(){}   
}


// 두번째는, 인터페이스도 상속이 된다. 
// 만약 I4인터페이스가 I3를 상속받고, 
// I4라는 메소드를 구현한 C라는 클래스를 만든다면
// C는 반드시 x와 z를 구현해야 한다 