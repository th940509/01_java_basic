package step1_06.loop;
//2021/03/24 22:10 ~ 22:37
import java.util.Scanner;

/*
 * # ATM[2단계]
 * 
 * 1. 입금
 * . 입금할 금액을 입력받아, myMoney에 입금
 * 2. 출금
 * . 출금할 금액을 입력받아, myMoney에서 출금
 * . 단, 출금할 금액이 myMoney 잔액을 초과할 경우 출금불가
 * 3. 이체
 * . yourAcc 계좌번호를 입력받아, 이체
 * . 이체할 금액이 myMoney 잔액을 초과할 경우 이체 불가
 * . 이체 후 yourMoney 잔액 증가
 * 4. 조회
 * . myMoney와 yourMoney 잔액 모두 출력
 * 
 */

public class LoopEx09_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int myAcc = 1111;
		int myMoney = 50000;
		
		int yourAcc = 2222;
		int yourMoney = 70000;	
		
		boolean isRun = true;
		while(isRun) {
			
			System.out.println("1.입금");
			System.out.println("2.출금");
			System.out.println("3.이체");
			System.out.println("4.조회");
			System.out.println("0.종료");
			
			System.out.print("메뉴 선택 : ");
			int selectMenu = scan.nextInt();
			
			if (selectMenu == 1) {
				System.out.print("입금할 금액을 입력해주세요: ");
				int depositCash = scan.nextInt();
				myMoney += depositCash;
				System.out.println("잔액은" + myMoney + "원 입니다.");
			}
			
			
			else if (selectMenu == 2) {
				System.out.print("출금할 금액을 입력해주세요: ");
				int withDrawal = scan.nextInt();
					if (myMoney < withDrawal) {
						System.out.println("출금불가");
					}
					else {
						System.out.println("잔액은" + (myMoney - withDrawal) + "원 입니다");
						myMoney -= withDrawal;
					}
			}
			
			
			else if (selectMenu == 3) {
				System.out.print("계좌를 입력하세요: ");
				int accountNumber = scan.nextInt();
				 if (accountNumber == yourAcc) {
					 System.out.print("이체할 금액을 입력하세요: ");
					 int transferMoney = scan.nextInt();
					  if(myMoney < transferMoney) {
						  System.out.println("이체불가");
					  }
					  else {
						  System.out.println("잔액은" + (myMoney - transferMoney) + "원 입니다.");
						  yourMoney += transferMoney;
					  }
				 }
				 else {System.out.println("계좌번호를 확인해주세요.");}
			}
			
			
			else if (selectMenu == 4) {
				System.out.println("my Acc 잔액은: " + myMoney + "원 입니다.");
				System.out.println("your Acc 잔액은: " + yourMoney + "원 입니다.");
			}
			else if (selectMenu == 0) {
				isRun = false;
				System.out.println("프로그램 종료");
			}
		}

		scan.close();
		
	}

}
