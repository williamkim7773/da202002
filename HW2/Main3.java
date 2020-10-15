import java.util.Scanner;

public class Main3 {
	//  ���� �Է� ���ڿ��� �ùٸ� ��ȣ���� �������� true�� ��ȯ�ϰ�,
	//  �׷��� ������ false�� ��ȯ�մϴ�.
	public static boolean isValid(String str) {
		//  stack�� ���� �ڷḦ �ۼ��մϴ�.
		char[] stack = new char[1024];
		int top = -1;
		
		//  for ������ ���鼭 str ���ڿ��� ���ڸ� �ϳ��� �о���ϴ�.
		for (int i=0; i<str.length(); i++) {
			//  1. i �ε����� �ش��ϴ� ���ڸ� �н��ϴ�.
			char ch = str.charAt(i);
			//  2. ��ȣ ���� ���ڶ��, ���ÿ� �ش� ���ڸ� Ǫ���մϴ�.
			if(ch == '(' || ch == '[' || ch == '{') {
				stack[++top] = ch;		//  top++; stack[top] = ch;�� �� ��
				//  stack[top++] = ch; --> stack[top] = ch; top++; �� ����.
			}
			else if(ch == ')') {
				//  1. ���� ������ ����ִٸ� (top == -1), �� ���� ���� ��ȣ������ �ݱ� ��ȣ���� �������ٴ� �ǹ��̹Ƿ� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				//  ���ÿ� �ֻ��� ���ڰ� ���� �˻��ϴ� ���ڿ� �ٸ� �������, ���� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				if(top == -1 || stack[top] != '(') return false;
				//  2. ���ÿ��� �ֻ��� �������� �����մϴ�.
				top--;
			}
			else if(ch == ']') {
				//  1. ���� ������ ����ִٸ� (top == -1), �� ���� ���� ��ȣ������ �ݱ� ��ȣ���� �������ٴ� �ǹ��̹Ƿ� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				//  ���ÿ� �ֻ��� ���ڰ� ���� �˻��ϴ� ���ڿ� �ٸ� �������, ���� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				if(top == -1 || stack[top] != '[') return false;
				//  2. ���ÿ��� �ֻ��� �������� �����մϴ�.
				top--;
			}
			else if(ch == '}') {
				//  1. ���� ������ ����ִٸ� (top == -1), �� ���� ���� ��ȣ������ �ݱ� ��ȣ���� �������ٴ� �ǹ��̹Ƿ� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				//  ���ÿ� �ֻ��� ���ڰ� ���� �˻��ϴ� ���ڿ� �ٸ� �������, ���� �ùٸ��� ���� ��ȣ���� �˴ϴ�.
				if(top == -1 || stack[top] != '{') return false;
				//  2. ���ÿ��� �ֻ��� �������� �����մϴ�.
				top--;
			}
		}
		//  3. ������ ����ִٸ� (top == -1) return true ��ȯ, �׷��� ������ false�� ��ȯ�մϴ�.
		//  if(top==-1) return true;
		//  else return false; �� �ٰ� ���� ���
		return top == -1;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//  �ݺ� Ƚ���� �Է¹޽��ϴ�.
		int n = scan.nextInt();
		
		//  for������ �̿��ؼ� n�� �ݺ� �����մϴ�.
		for(int i=0; i<n; i++) {
			String abc = scan.next();
			//  ���ڿ��� �ùٸ��� YES, �ùٸ��� ������ NO�� ����մϴ�.
			
			if(isValid(abc)) System.out.println("YES");
			else System.out.println("NO");
		
		}
	}
}
