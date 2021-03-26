package step1_06.loop;
//2021/03/26 15:50 ~ 15:57

public class LoopEx18_내정답 {

	public static void main(String[] args) {
		

		// 문제 1) 1부터 5까지 출력
		// 정답 1) 1, 2, 3, 4, 5
		
		for (int x = 1; x <= 5; x++) {
			System.out.print(x + " ");
		}
		
		System.out.println();
		
		// 문제 2) 1부터 10까지 반복해 5~9까지 출력
		// 정답 2) 5, 6, 7, 8, 9
		
		for (int y = 1; y <= 10; y++) {
			if (y >= 5 && y <= 9) {
			System.out.print(y + " ");
			}
		}
		
		System.out.println();
		
		// 문제 3) 10부터 1까지 반복해 6~3까지 출력
		// 정답 3) 6, 5, 4, 3
		for (int j = 10; j <= 10; j --) {
			if (j <= 6 && j >= 3) {
				System.out.print(j + " ");
			}
		}
		
		System.out.println();
		
		// 문제 4) 1부터 10까지 반복해 3미만 7이상 출력
		// 정답 4) 1, 2, 7, 8, 9, 10
		for (int k = 1; k <= 10; k++) {
			if (k < 3 || k >= 7) {
				System.out.print(k + " ");
			}
		}
		
	}

}
