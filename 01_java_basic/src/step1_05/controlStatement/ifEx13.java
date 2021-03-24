package step1_05.controlStatement;

import java.util.Random;
/*
 * 랜덤 라이브러리 (if와 관련x)
 * */
public class ifEx13 {

	public static void main(String[] args) {

		Random ran = new Random();
		
		// 0~9사이의 랜던값 (뒤의 괄호에서 -1)
		int rNum1 = ran.nextInt(10);
		System.out.println(rNum1);
		
		// 100~200 사이의 랜덤값
		int rNum2 = ran.nextInt(101) + 100; // [0~100] + 100;
		System.out.println(rNum2);
		
		// -3 ~ 3 사이의 랜덤값
		int rNum3 = ran.nextInt(7)-3; // [0~6]-3;
		System.out.println(rNum3);
		
	}

}
