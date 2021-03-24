package step1_06.loop;
//2021/03/23 15:40 ~ 16:23

//# 반복문 기본문제[2단계]

public class LoopEx03_내정답 {

	public static void main(String[] args) {
		
		// 문제1) 1~5까지의 합 출력
		// 정답 1) 15
		
		int i = 1;
		int tot = 0;
		while (i <= 5) {
			tot = tot + i;
			i++;
		}
		System.out.println("합은 = " + tot);
		
		// 문제2) 1~10까지 반복해 3미만 7이상만 출력
		// 정답2) 1, 2, 7, 8, 9, 10
		
		i = 1;
		while (i <= 10) {
			if(i < 3 || i >= 7) {
				System.out.println(i);
			}
			i++;
				
		}
		
		// 문제3) 문제2의 조건에 맞는 수들의 합 출력
		// 정답3) 37
		
		i = 1;
		tot = 0;
		while (i <= 10) {
			if(i < 3 || i >= 7) {
				tot = tot + i;
			}
		i++;
		}
		System.out.println("합은= " + tot);
		
		// 문제4) 문제2의 조건에 맞는 수들의 개수 출력
		// 정답4) 6
		
		i = 1;
		int num = 0;
		while(i <= 10) {
			if(i < 3 || i >=7) {
				num ++;
			}
		i++;
		}
		
		System.out.println("개수= " + num);

	}

}
