
package dataTypes;

public class ExplicitConversionEx {

	public static void main(String[] args) {

		int iNum = 1000;
		// byte bNum = iNum;
		byte bNum = (byte) iNum;
		
		System.out.println(iNum); // iNum의 값이 변하는 건 아님 
		System.out.println(bNum); // -24 
		// 이유: byte = -128 ~ 127까지 표현가능 
		
		double dNum = 3.14;
		iNum = (int)dNum;
		
		System.out.println(iNum); // 3 -> 소숫점 이하 유실됨(truncate)
		
		float fNum = 0.9f;
		
		int num1 = (int)dNum + (int)fNum;
		int num2 = (int)(dNum + fNum);
		
		System.out.println(num1); // 3 = 3 + 0
		System.out.println(num2); // 4 = 3.14 + 0.9 = 4.04
		
	}

}
