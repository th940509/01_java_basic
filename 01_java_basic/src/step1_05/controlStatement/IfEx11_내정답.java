package step1_05.controlStatement;
// 2021/03/22 23:53 ~ 00:02

import java.util.Scanner;
/*
 * # 영수증 출력[1단계]
 * 
 * 1. 메뉴판을 출력한다.
 * 2. 사용자는 주문하고자 하는 메뉴의 번호를 입력한다.
 * 3. 현금을 입력받는다.
 * 4. 입력받은 현금과 메뉴가격을 확인해, 영수증을 출력한다.
 * 5. 단, 현금이 부족한 경우 "현금이 부족합니다."라는 메세지를 출력한다.
 */

public class IfEx11_내정답 {

	public static void main(String[] args) {

		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("메뉴를 선택해주세요: ");
		int menu = scan.nextInt();
		
		System.out.print("현금을 입력해주세요: ");
		int cash = scan.nextInt();
		
		if(menu == 1) {
			if(cash == price1) {
				System.out.print("불고기 버거" + price1 + "원 입니다.");
			}
			if(cash > price1) {
				System.out.print("불고기 버거" + price1 + "원 입니다." + "잔돈은"+ (cash - price1) + "입니다.");
			}
			if(cash < price1) {
				System.out.print("현금이 부족합니다!");
			}
		}
		
		if(menu == 2) {
			if(cash == price2) {
				System.out.print("새우 버거" + price2 + "원 입니다.");
			}
			if(cash > price2) {
				System.out.print("새우 버거" + price2 + "원 입니다." + "잔돈은"+ (cash - price2) + "입니다.");
			}
			if(cash < price2) {
				System.out.print("현금이 부족합니다!");
			}
		}
		
		if(menu == 3) {
			if(cash == price3) {
				System.out.print("콜라" + price3 + "원 입니다.");
			}
			if(cash > price3) {
				System.out.print("콜라" + price3 + "원 입니다." + "잔돈은"+ (cash - price3) + "입니다.");
			}
			if(cash < price3) {
				System.out.print("현금이 부족합니다!");
			}
		}
		
		
		scan.close();	
		
		

	}
}
