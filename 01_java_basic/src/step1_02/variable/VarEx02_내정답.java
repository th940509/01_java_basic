package step1_02.variable;

// 산술 연산자 하고 와서 진행
//2021/03/17 16:50 ~ 17:10 (문제1-4)
//2021/04/21 14:07 ~ 14:12 

public class VarEx02_내정답 {

	public static void main(String[] args) {
		
		//예) 현금이 1000원있다. 200원짜리 과자 구입 후, 잔돈 출력 
		
		int cash = 1000;
		int snack = 200;
		int change = cash - snack;
		System.out.println("잔돈 = " + change + "원");
		
		//문제1) 월급이 100원이다. 연봉은? (조건 : 세금 10% 제외)
		int monthlyPaycheck = 100;
		double tax = 0.1;
		double annualIncome = (monthlyPaycheck - (monthlyPaycheck * tax)) * 12;
		System.out.println("연봉 = " + annualIncome + "원");
	
		//문제2) 시험점수를 30, 50, 4점 을 받았다. 평균은?
		int test01 = 30;
		int test02 = 50;
		int test03 = 4;
		int average = (test01 + test02 + test03) / 3;
		System.out.println("평균 = " + average + "점");
		
		//문제3) 가로가 3이고 세로가 6인 삼각형 넓이 출력
		int transverse = 3;
		int length = 6;
		int area = (transverse + length) / 2;
		System.out.println("삼각형 넓이 = " + area);
		
		//문제4) 100초를 1분 40초로 출력
		int defaultValue = 100;
		int oneMinute = 60;
		int minute = defaultValue / oneMinute;
		
		//문제5) 800원에서 500원짜리 개수 , 100원짜리 개수
		int fivehundred = 500;
		int onehundred = 100;
		int cash2 = 800;
		System.out.println("500원 개수 = " + cash2 / fivehundred);
		System.out.println("100원 개수 = " + (cash2 % fivehundred) / onehundred);
		//정답5) 500원(1개), 100원(3개) 


	}

}