package org.tutorials.javatutorials.exception;
import java.io.*;

class B{
    void run(){
        BufferedReader bReader = null;
        String input = null;
        try {
            bReader = new BufferedReader(new FileReader("out.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try{
            input = bReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }       
        System.out.println(input); 
    }
    
    // step2
    // B가 예외처리를 하지 않고 다음 사용자 C.run에게 넘길 수 있다. 
    void run() throws IOException, FileNotFoundException{
        BufferedReader bReader = null;
        String input = null;
        bReader = new BufferedReader(new FileReader("out.txt"));
        input = bReader.readLine();
        System.out.println(input); 
    }
    
}
class C{
    void run(){
        B b = new B();
        b.run();
        
        // step2
        b.run(); // 이제 이것에 에러날 것
        // B의 run사용자에게 에러처리를 강제하는 것 
        // 해결
        try {
            b.run();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // step3
    // 사용자인 main에게 책임 넘기기
    void run() throws IOException, FileNotFoundException{
        B b = new B();
        b.run();
    }
    
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();
         
         // step3
         try {
             c.run();
         } catch (FileNotFoundException e) {
             System.out.println("out.txt 파일은 설정 파일 입니다. 이 파일이 프로잭트 루트 디렉토리에 존재해야 합니다.");
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         // 추가: IOException은 FileNotFoundException를 포함하고 있음
         // 즉 IOException은 파일을 읽고쓰는 모든 것에 대한 예외처리
         // 따라서 IOException만쓰고 FileNotFoundException는 생략해도 됨 
         
         // out.txt 파일을 찾을 수 없는 상황은 B.run 입장에서는 어떻게 할 수 있는 일이 아니다. 
         //엔드유저인 애플리케이션의 사용자가 out.txt 파일을 루트 디렉토리에 위치시켜야 하는 문제이기 때문에
         // 애플리케이션의 진입점인 메소드 main으로 책임을 넘기고 있다.
         
         // 추가
         try(FileReader fReader = new FileReader("a")){
        	 fReader.read();
         }catch(IOException e) {
        	 throw new RuntimeException();
         }
         
    }   
}
