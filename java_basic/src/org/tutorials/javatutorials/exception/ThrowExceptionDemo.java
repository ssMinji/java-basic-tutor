package org.tutorials.javatutorials.exception;

import java.io.FileReader;
import java.io.IOException;

class B{
    void run(){
    }
}
class C{
    void run(){
        B b = new B();
        b.run();
    }
}
public class ThrowExceptionDemo {
    public static void main(String[] args) {
         C c = new C();
         c.run();
         
         
    }   
}


