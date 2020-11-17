import java.util.Scanner;

class Queue{
	private int[] queue;
	private int frontIndex = 0;
	private int backIndex = -1;
	
	Queue(){
		
	}
	
	Queue(int number){						//  �迭 ũ�� �Ҵ�
		queue = new int[number];
	}
	
	public void push(int x) {				//  push�� ���ؼ� queue�� ���� �Է�
		queue[++backIndex] = x;
	}
	
	public int size() {						//  size�� ���ؼ� ť�� ����� ������ ���� �ľ�
		return backIndex - frontIndex + 1;
	}
	
	public boolean isEmpty() {				//  queue�� ��������� true, ������� ������ false�� ����
		if (size()==0)
			return true;
		else
			return false;
	}
	
	public int  pop() {						//  pop�� ���� queue ���� �տ� �ִ� ���� pop�ϰ� ������� ��� -1 ��ȯ
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex++];
	}
	
	public int front() {					//  front�� ���ؼ��� queue�� ���� �տ� �ִ� ������ ����ϰ� ������ ���� ��� -1 ��ȯ
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex];
	}
	
	public int back() {						//  back�� ���ؼ��� queue�� ���� �ڿ� �ִ� ������ ����ϰ� ������ ���� ��� -1 ��ȯ
		if (isEmpty())
			return -1;
		else
			return queue[backIndex];
	}
	
}
public class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Queue queue = new Queue(number);
		for(int i = 0; i <number; i++) {
			String command = scanner.next();
			switch(command) {
				case "push":
					int x = scanner.nextInt();
					queue.push(x);
					break;
				case "pop":
					System.out.println(queue.pop());
					break;
				case "empty":
					if (queue.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "front":
					System.out.println(queue.front());
					break;
				case "back":
					System.out.println(queue.back());
					break;
				case "size":
					System.out.println(queue.size());
					break;
			}
		}
	}
}