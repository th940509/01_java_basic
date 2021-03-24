package step1_06.loop;
//2021/03/23 16:29 ~ 16:55
/*
 * # 영수증 출력[2단계]
 * 1. 5번 주문을 받는다.
 * 2. 주문이 끝난 후, 돈을 입력받는다.
 * 3. 각 메뉴별 주문수량과 총금액을 출력한다.
 * 
 * 예)
 * 메뉴 선택 : 1
 * 메뉴 선택 : 1
 * 메뉴 선택 : 2
 * 메뉴 선택 : 2
 * 메뉴 선택 : 3
 * 총 금액 = 31300원
 * 현금 입력 : 32000
 * === 롯데리아 영수증 ===
 * 1. 불고기 버거 : 2개
 * 2. 새우    버거 : 2개
 * 3. 콜         라 : 1개
 * 4. 총   금   액 : 31300원
 * 5. 잔         돈 : 700원
 */

import java.util.Scanner;

public class LoopEx05_내정답 {

	public static void main(String[] args) {
		
		int price1 = 8700;
		int price2 = 6200;
		int price3 = 1500;
		
		System.out.println("=== 롯데리아 ===");
		System.out.println("1.불고기 버거 : " + price1 + "원");
		System.out.println("2.새우    버거 : " + price2 + "원");
		System.out.println("3.콜         라 : " + price3 + "원");

		Scanner scan = new Scanner(System.in);
		
		int total = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		
		int i = 1;
		while(i < 6) {
			System.out.print("메뉴 선택:  ");
			int menu = scan.nextInt();
				if (menu ==1) {
					total += price1;
					count1 ++;
				}			
				if (menu ==2) {
					total += price2;
					count2 ++;
				}			
				if (menu ==3) {
					total += price3;
					count3 ++;
				}			
			i++;
		}
		
		System.out.println("총금액 = " + total);
		System.out.print("현금 입력 =  ");
		int money = scan.nextInt();
		
		System.out.println("====롯데리아 영수증===");
		System.out.println("불고기 버거: " + count1 + "개");
		System.out.println("새우 버거: " + count2 + "개");
		System.out.println("콜라: " + count3 + "개");
		System.out.println("총금액 = " + total);
		System.out.println("잔돈 = " + (money - total) );
		
		
		scan.close();
		}
	}

