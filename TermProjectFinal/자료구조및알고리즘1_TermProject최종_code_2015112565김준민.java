import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

public class ProjectFinalRevised {
	
	static int p;
	static int q;
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);	
		
		System.out.print("N�� �Է��ϼ���: ");
		int N = scan.nextInt();		//  N���� �Է¹���
		
		System.out.print("K�� �Է��ϼ���: ");
		int K = scan.nextInt();
		
		long t1 = System.currentTimeMillis();
		
		
		
		
		int[] arr = new int[N+1];		
		
		
		int data = 0;
		
		for(int i=1; i<=N; i++) {
			data = (int)(Math.random()*N)+1;		//  N���� ���� data ����
			arr[i] = data;					//  �迭�� ���� ����
			
			//for(int j=1; j<i; j++) {
				//if (arr[j] == data) {
					//i--;		//  �ߺ��̸� i �ٿ��� �ٽ� �� ����
					//break;
				}  //  end if
			//}  //  end inner for
		//}  //  end outer for
		
		
		
		//for(int k=1; k<=N; k++) {
			//System.out.println(k + "��° ����: " + arr[k]);
		//}  //  end for
		
		
		
		
		
		
		
		for(int i=0; i<K; i++) {
		
			int a = ran.nextInt(N);
			int b = ran.nextInt(N);
		//System.out.println("a��: " + a);
		//int a = scan.nextInt();		
		//System.out.println("b��: " + b);
		//int b = scan.nextInt();
		
		//if (a>N || b>N) System.out.print("N���� ���� ���� �Է��ϼ���.");
		//else {

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
		
		long sum = 0;
		int max = 0;
		int min = 9999999;
		
		for (int r = Math.min(p, q); r <= Math.max(p, q); r++) {
			sum += arr[r];
			if(max<arr[r]) max = arr[r];
			if(min>arr[r]) min = arr[r];
			
		}
		//System.out.println("����: " + sum + "�Դϴ�.");
		//System.out.println("�ִ���: " + max + "�Դϴ�.");
		//System.out.println("�ּڰ���: " + min + "�Դϴ�.");
	}
//}
		t1 = System.currentTimeMillis()-t1;
		System.out.println("���� �ð�: " + t1 + "ms");
}
}


