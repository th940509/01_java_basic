package step1_05.controlStatement;
//2021/03/22 17:15 ~ 17:42
//2021/03/23 00:37 ~ 00:47

import java.util.Scanner;

/*
 * # ATM[1단계] : 이체하기
 * 
 * 1. 이체할 계좌번호를 입력받는다.
 * 2. 계좌번호가 일치하면,
 * 3. 이체할 금액을 입력받는다.
 * 4. 이체할 금액 <= myMoney	: 이체가능
 * 			myMoney   - 이체할 금액
 * 			yourMoney + 이체할 금액
 *    이체할 금액  > myMoney 	: 이체불가
 */

public class IfEx19_내정답 {

	public static void main(String[] args) {
		int myAcc = 1234;
		int myMoney = 8700;
		
		int yourAcc = 4321;
		int yourMoney = 12000;
		
		System.out.println("myMoney = " + myMoney + "원");
		System.out.println("yourMoney = " + yourMoney + "원");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("계좌번호를 입력하세요: ");
		int accountNumber = scan.nextInt();
		
		if(accountNumber == yourAcc) {
			System.out.println("이체할 금액을 입력하세요: ");
			int cash = scan.nextInt();
			if(cash <= myMoney) {
				System.out.println(" my Acc 계좌 잔액 : " + (myMoney - cash));
				System.out.println(" your Acc 계좌 잔액: " + (yourMoney + cash));
			} else if(cash > myMoney) {System.out.println("이체불가");
			}
		}
			
		else if (accountNumber != yourAcc) {System.out.println("계좌번호가 틀립니다!");}
		
		scan.close();
		
		
		
		
	}

}
