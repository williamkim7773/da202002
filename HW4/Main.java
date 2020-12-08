//  #1725 #6549
//  �ϴ� �������� ������. ���� ���ʿ��� ���� ū ���簢�� ���ϰ� ���������� ���� ū ���簢�� ���ϰ�.
//  Lecture 14 ������׷����� ���� ū ���簢���� ���� ���ϱ�
//  ������׷��� ������ �׷����� �׸� ���Դϴ�.
//  �̶� ������� ������׷� �׷������� ���� ���� ���簢���� ���̸� ���ϴ� ������ �������� �˰����� ��ǥ�� �����Դϴ�.
//  �Է��� ������ �� (N)�� �Է¹ް� �� ������ ������ �Է¹޽��ϴ�.
//  {3, 1, 4, 3} �� ������ ���� ����� �Է����� 4 3 1 4 3 �� �˴ϴ�.
//  ����� ���� ū ���簢�� ���̸� ����ϸ� �˴ϴ�. => 6
import java.util.Scanner;
public class Main {
	static int[] tv;
	//  ���������� ���� histo �Լ�
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
	//  ���� ū ���簢���� ���̸� ��ȯ�մϴ�.
	//  n: ������ ��
	//  v: n���� ���õ��� ����
	//  ��ȯ: ���簢���� ����
	static int histo(int[] v, int n) {
		tv = new int[n];
		return histo(v, 0, n-1);
	}
	public static void main(String[] args) {
		//  ��ĳ�� ������Ʈ ����
		Scanner scan = new Scanner(System.in);
		//  ������ �� �Է�
		System.out.print("������ ������ �Է��ϼ���: ");
		int n = scan.nextInt();
		//  ������ ������ �迭 ����
		int[] v = new int[n];
		//  n���� ������ �Է¹޾� �迭 v�� ����
		for(int i=0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		//  ���� ū ���簢���� ���� ���
		int r = histo(v, 0, n-1);
		//  ���
		System.out.println(r);
	}
		

}


