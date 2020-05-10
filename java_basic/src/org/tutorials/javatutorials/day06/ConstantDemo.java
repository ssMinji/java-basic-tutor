package org.tutorials.javatutorials.day06;


//step4
interface FRUIT{
    int APPLE=1, PEACH=2, BANANA=3;
}
interface COMPANY{
    int GOOGLE=1, APPLE=2, ORACLE=3;
}

// step6
class Fruit{
    public static final Fruit APPLE  = new Fruit();
    public static final Fruit PEACH  = new Fruit();
    public static final Fruit BANANA = new Fruit();
}
class Company{
    public static final Company GOOGLE = new Company();
    public static final Company APPLE = new Company();
    public static final Company ORACLE = new Company();
}

public class ConstantDemo {

	public static void main(String[] args) {
		/*
		 * 1. 사과
		 * 2. 복숭아
		 * 3. 바나나
		 */
		int type = 1;
		switch(type){
		case 1:
			System.out.println(57);
			break;
		case 2:
			System.out.println(34);
			break;
		case 3:
			System.out.println(93);
			break;
		}
	}

	// step2
	private final static int APPLE = 1;
	private final static int PEACH = 2;
	private final static int BANANA = 3;
	public static void main(String[] args) {
		int type = APPLE;
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

	// step3
	// fruit
	private final static int FRUIT_APPLE = 1;
	private final static int FRUIT_PEACH = 2;
	private final static int FRUIT_BANANA = 3;

	// company
	private final static int COMPANY_GOOGLE = 1;
	private final static int COMPANY_APPLE = 2;
	private final static int COMPANY_ORACLE = 3;

	public static void main(String[] args) {
		int type = FRUIT_APPLE;
		switch(type){
		case FRUIT_APPLE:
			System.out.println(57+" kcal");
			break;
		case FRUIT_PEACH:
			System.out.println(34+" kcal");
			break;
		case FRUIT_BANANA:
			System.out.println(93+" kcal");
			break;
		}
	}
	
	// step4
	public static void main(String[] args) {
        int type = FRUIT.APPLE;
        switch(type){
            case FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34+" kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
	
	//step5
	public static void main(String[] args) {
        if(FRUIT.APPLE == COMPANY.APPLE) {
        	System.out.println("같다");
        }
    }
	
	// step6
	public static void main(String[] args) {
        Fruit type = FRUIT.APPLE;
        switch(type){
            case FRUIT.APPLE:
                System.out.println(57+" kcal");
                break;
            case FRUIT.PEACH:
                System.out.println(34+" kcal");
                break;
            case FRUIT.BANANA:
                System.out.println(93+" kcal");
                break;
        }
    }
	

}
