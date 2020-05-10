package org.tutorials.javatutorials.day06;

enum Fruit{
    APPLE, PEACH, BANANA;
}
enum Company{
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo1 {

	public static void main(String[] args) {
        
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal");
                break;
            case PEACH:
                System.out.println(34+" kcal");
                break;
            case BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }

}
