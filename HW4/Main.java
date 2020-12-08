//  #1725 #6549
//  일단 절반으로 나눈다. 절반 왼쪽에서 가장 큰 직사각형 구하고 나머지에서 가장 큰 직사각형 구하고.
//  Lecture 14 히스토그램에서 가장 큰 직사각형의 넓이 구하기
//  히스토그램은 도수를 그래프로 그린 것입니다.
//  이때 만들어진 히스토그램 그래프에서 가장 넓은 직사각형의 넓이를 구하는 문제로 분할정복 알고리즘의 대표적 문제입니다.
//  입력은 샘플의 수 (N)을 입력받고 각 샘플의 도수를 입력받습니다.
//  {3, 1, 4, 3} 의 도수를 가진 경우라면 입력으로 4 3 1 4 3 이 됩니다.
//  결과는 가장 큰 직사각형 넓이를 출력하면 됩니다. => 6
import java.util.Scanner;
public class Main {
	static int[] tv;
	//  분할정복을 위한 histo 함수
	static int histo(int[] v, int a, int b) {
		if(a==b) return v[a];
		int mid = (a+b)/2;
		int r=2;
		int min = (v[mid]<v[mid+1])?v[mid]:v[mid+1];
		int max = min*r;
		int i = mid-1, j=mid+2;
		while(i>=a && j<=b) {
			if(v[i]>v[j]) { if(v[i]<min) min=v[i]; i--; }
			else {if(v[j]<min) min=v[j]; j++; }
			if(max < min*(++r)) max=min*r;
		}
		
		while(i>=a) {
			if(v[i]<min) 
				min=v[i];
				i--; 
				if(max<min*(++r)) max = min*r;
			}
		while(j<=b) {
			if(v[j]<min) 
				min=v[j];
				j++; 
				if(max<min*(++r)) max = min*r;
			}
		//}
		

		//}
		int left = histo(v, a, mid);
		int right = histo(v, mid+1, b);
		if(max < left) max = left;
		if(max < right) max = right;
		return max;
	}
		//merge(v, a, b, mid);
	//}
	//  가장 큰 직사각형의 넓이를 반환합니다.
	//  n: 샘플의 수
	//  v: n개의 샘플들의 도수
	//  반환: 직사각형의 넓이
	static int histo(int[] v, int n) {
		tv = new int[n];
		return histo(v, 0, n-1);
	}
	public static void main(String[] args) {
		//  스캐너 오브젝트 생성
		Scanner scan = new Scanner(System.in);
		//  샘플의 수 입력
		System.out.print("샘플의 개수를 입력하세요: ");
		int n = scan.nextInt();
		//  도수를 저장할 배열 생성
		int[] v = new int[n];
		//  n개의 도수를 입력받아 배열 v에 저장
		for(int i=0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		//  가장 큰 직사각형의 넓이 계산
		int r = histo(v, 0, n-1);
		//  출력
		System.out.println(r);
	}
		

}


