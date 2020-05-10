package org.tutorials.javatutorials.exception;

import java.io.IOException;

class E{
    void throwArithmeticException(){
        throw new ArithmeticException();
    }
    void throwIOException(){
        throw new IOException();
    }
    
    // 에러
    // unreported exception IOException; must be caught or declared to be thrown
    // 즉 IOException은 try...catch하거나 throw 해야 한다는 뜻.
    // rithmeticException, IOException 모두 Exception이다. 
    //그럼에도 불구하고 유독 IOException만 try...catch 혹은 throw 를 해야 한다는 뜻이다. 
    //자바는 이 두개의 예외를 다른 방법으로 대하고 있는 것
    // 핵심은 IOException은 예외처리를 강제하고 있지만 ArithmeticException은 그렇지 않다 점
    
    // ArithmeticException 문서 페이지에서 상속관계 보면서 설명하기 
    // Throwable
    // 클릭하면 getMessage() 등의 메소드 가지고 있음 
    // ppt - 중요 예외 클래스와 그 상속관계는 다음과 같다 
    // 클래스 Throwable은 범 예외 클래스들의 공통된 조상이다. 
    // 모든 예외 클래스들이 가지고 있는 공통된 메소드를 정의하고 있다. 
    // 중요한 역할을 하는 클래스임에는 틀림없지만 이 클래스를 직접 사용하지는 않기 때문에 우리에게는 중요하지 않다.
    // 에러는 애플리케이션의 문제가 아니라 그 애플리케이션이 동작하는 가상머신에 문제가 생겼을 때 발생하는 예외다.
    // 애플리케이션을 구동시키기에는 메모리가 부족한 경우가 이에 속한다. 
    //이런 경우는 애플리케이션 개발자가 할 수 있는 것이 없다. 
    //따라서 예외처리를 하지 말고 그냥 에러로 인해서 애플리케이션이 중단되도록 내버려둔다. 
    // 대신 자신의 애플리케이션이 메모리를 과도하게 사용하고 있다면 로직을 변경하거나 자바 가상머신에서 사용하는 메모리의 제한을 변경하는 등의 대응을 한다.
    
    // 공식문서 홈페이지에서 Exception클래스 검색해서 subclasses들 함께 보기 
    // 이 수많은 클래스 중에 하나가 RuntimeException이다. 
    // ppt - checked예외, unchecked예외
    
}
