package org.tutorials.javatutorials.exception;

// throw 알아보기 
public class ExceptionDemo2 {

	public static void main(String[] args) {
		BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        String input = bReader.readLine();
        System.out.println(input); 
        
        // 실행결과
        // Unhandled exception type FileNotFoundException
        // new FileReader("out.txt") 에 대한 예외처리가 필요하다는 뜻 
        // FileReader라는 클래스를 API문서에서 찾아보자. 
        // oracle홈페이지 가서 찾아보면 Throws 부분이 있음
        
        // Throws는 한국어로는 '던지다'로 번역된다. 
        // 위의 내용은 생성자 FileReader의 인자 fileName의 값에 해당하는 파일이 디렉토리이거나 
        // 어떤 이유로 사용할 수 없다면 FileNotFoundException을 발생시킨다는 의미다.
        // 이것은 FileReader의 생성자가 동작할 때 파일을 열 수 없는 경우가 생길 수 있고, 
        //이런 경우 생성자 FileReader에서는 이 문제를 처리할 수 없기 때문에 이에 대한 처리를 생성자의 사용자에게 위임하겠다는 의미다. 
        //그것을 던진다(throw)고 표현하고 있다.
        //따라서 API의 사용자 쪽에서는 예외에 대한 처리를 반드시 해야 한다는 의미다. 
        //따라서 아래와 같이 해야 FileReader 클래스를 사용할 수 있다.
        // 아래와 같이 한 번 해결해보자. 
        try {
            BufferedReader bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        
        // step2
        // 아래 코드 추가해보자.
        try{
            String input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }  
        // 하지만 위의 코드는 컴파일되지 않음
        // bReader는 try의 중괄호 안에서 선언되어 있기 때문에 처음의 bReader와 지금의 bReader는 서로 다른 중괄효
        // 따라서 여기서는 위에 선언된 bReader에 접근불가. --> 스코프의 문제 

	}

}
