package org.tutorials.javatutorials.day06;

/*class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
*/
enum Fruit{
    APPLE, PEACH, BANANA;
    Fruit(){
        System.out.println("Call Constructor "+this);
    }
    
    // step2
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    public String color;
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    
    // step3
    APPLE("red"), PEACH("pink"), BANANA("yellow");
    private String color;
    public String getColor() {
    	return this.color;
    }
    Fruit(String color){
        System.out.println("Call Constructor "+this);
        this.color = color;
    }
    
    
}
 
enum Company{
    GOOGLE, APPLE, ORACLE;
}

public class ConstantDemo2 {

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
        
        // step2
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, color " + Fruit.APPLE.color);
                break;
            case PEACH:
                System.out.println(34+" kcal, color " + Fruit.PEACH.color);
                break;
            case BANANA:
                System.out.println(93+" kcal, color " + Fruit.BANANA.color);
                break;
        }
        
        // step3
        Fruit type = Fruit.APPLE;
        switch(type){
            case APPLE:
                System.out.println(57+" kcal, "+Fruit.APPLE.getColor());
                break;
            case PEACH:
                System.out.println(34+" kcal"+Fruit.PEACH.getColor());
                break;
            case BANANA:
                System.out.println(93+" kcal"+Fruit.BANANA.getColor());
                break;
        }
        
        // step4
        for(Fruit f : Fruit.values()){
            System.out.println(f+", "+f.getColor());
        }
        
        

	}

}
