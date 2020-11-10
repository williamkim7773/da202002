import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class TermProject {
	
	static int p;
	static int q;
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		System.out.print("N을 입력하세요: ");
		
		Scanner scan = new Scanner(System.in);	
		int N = scan.nextInt();		//  N값을 입력받음
		int[] arr = new int[9999];		//  크기가 9999인 배열 생성
		
		
		int data = 0;
		
		for(int i=1; i<=N; i++) {
			data = (int)(Math.random()*N)+1;		//  N보다 작은 data 저장
			arr[i] = data;					//  배열에 숫자 저장
			
			for(int j=1; j<i; j++) {
				if (arr[j] == data) {
					i--;		//  중복이면 i 줄여서 다시 값 지정
					break;
				}  //  end if
			}  //  end inner for
		}  //  end outer for
		
		for(int k=1; k<=N; k++) {
			System.out.println(k + "번째 숫자: " + arr[k]);
		}  //  end for
		
		
		
		System.out.print("a를 입력하세요: ");
		int a = scan.nextInt();		
		System.out.print("b를 입력하세요: ");
		int b = scan.nextInt();
		
		if (a>N || b>N) System.out.print("N보다 작은 값을 입력하세요.");
		else {

		for(int l = 0; l < arr.length; l++) {
			
			if(a == arr[l]) {
				p = l;
				//System.out.println(p);
				break;
				}  //  end if
		}  //  end for
		
		for(int m = 0; m < arr.length; m++) {
			if(b == arr[m]) {
				q = m;
				//System.out.println(q);
				break;
				}  //  end if
		}  //  end for
		
		int sum = 0;
		int max = 0;
		int min = 9999;
		
		for (int r = Math.min(p, q); r <= Math.max(p, q); r++) {
			sum += arr[r];
			if(max<arr[r]) max = arr[r];
			if(min>arr[r]) min = arr[r];
			
		}
		System.out.println("합은: " + sum + "입니다.");
		System.out.println("최댓값은: " + max + "입니다.");
		System.out.println("최솟값은: " + min + "입니다.");
	}
}
}



