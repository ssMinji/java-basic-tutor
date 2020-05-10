package org.tutorials.javatutorials.exception;

class A{
    private int[] arr = new int[3];
    A(){
        arr[0]=0;
        arr[1]=10;
        arr[2]=20;
    }
    public void z(int first, int second){
        System.out.println(arr[first] / arr[second]);
        
        // step3
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        }
        
       // step4
        // 예외와 상관없이 try내의 구문이 실행되면 finally가 실행되고 있음
        // finally: 예외와는 상관없이 반드시 끝내줘야 하는 작업이 있을 때 사용
        // 예를 들어, 데이터베이스 사용할 때 데이터베이스 서버에 접속해야 하는데
        // 이때 데이터베이스 서버와 애플리케이션은 서로 접속상태를 유지하게 되는데
        // 데이터베이스를 제어하는 과정에서 예외가 발생해서 더이상 후속작업을 수행하는 것이 불가능한 경우 발생가능
        // 예외가 발생했다고 데이터베이스 접속을 끊지 않으면 데이터베이스와 연결상태를 유지하게 되고 급기야
        // 데이터베이스는 더이상 접속을 수용할 수 없는 상태에 빠질 수 있다
        // 접속을 끊는 작업은 예외 발생여부와 상관없기 때문에 finally에서 처리하기에 좋은 작업 
        try {
            System.out.println(arr[first] / arr[second]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(ArithmeticException e){
            System.out.println("ArithmeticException");
        } catch(Exception e){
            System.out.println("Exception");
        } finally {
            System.out.println("finally");
        }
    }
}
 
public class ExceptionDemo1 {
    public static void main(String[] args) {
        A a = new A();
        a.z(10, 1);
        
        // 실행결과
        // java.lang.ArrayIndexOutOfBoundsException
        // 배열은 3개의 값을 담을 수 있는데, 10번째 인덱스를 호출하고 있으니
        // 존재하지 않는 값을 가져오려고 시도하고 있기 때문에 에러 발생 
        
        // step2
        a.z(1, 0);
        // 실행결과
        // java.lang.ArithmeticException
        // 이때는, 10을 0으로 나누는 것이 수학적으로 불가능하기 때문에 발생한 에러.
        
        // 결론
        // 같은 로직이지만 상황에 따라서 다른 예외가 발생할 수 있음. 
        // 그럼 이제 이 예외들을 처리해보자(step3)
        
        // step3
        a.z(10, 0);
        a.z(1, 0);
        a.z(2, 1);
        // 결론
        // 다중 catch 문
        // 조건문의 else if 처럼 여러개의 catch를 하나의 try구문에서 사용 가능 
        
        // 해보기
        // 만약 catch(Exception e) 문이 캐치문 제일 앞에 위치하면?
        // 컴파일 에러 발생
        // Exception이 ArrayIndexOutOfBoundsException, ArithemeticException 보다 
        // 포괄적인 예외를 의미하기 때문에 Exception 이후에 등장하는 catch 문은 실행될 수 없는 구문이기 때문이다. 
        // 즉, 자바 컴파일러가 불필요한 로직을 감지하고 이를 개발자에게 알려주는 것이다.
    }
}
