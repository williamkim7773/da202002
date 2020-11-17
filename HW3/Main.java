import java.util.Scanner;

class Queue{
	private int[] queue;
	private int frontIndex = 0;
	private int backIndex = -1;
	
	Queue(){
		
	}
	
	Queue(int number){						//  배열 크기 할당
		queue = new int[number];
	}
	
	public void push(int x) {				//  push를 통해서 queue에 정수 입력
		queue[++backIndex] = x;
	}
	
	public int size() {						//  size를 통해서 큐에 저장된 정수의 개수 파악
		return backIndex - frontIndex + 1;
	}
	
	public boolean isEmpty() {				//  queue가 비어있으면 true, 비어있지 않으면 false로 저장
		if (size()==0)
			return true;
		else
			return false;
	}
	
	public int  pop() {						//  pop을 통해 queue 가장 앞에 있는 정수 pop하고 비어있을 경우 -1 반환
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex++];
	}
	
	public int front() {					//  front를 통해서는 queue의 가장 앞에 있는 정수를 출력하고 정수가 없는 경우 -1 반환
		if (isEmpty())
			return -1;
		else
			return queue[frontIndex];
	}
	
	public int back() {						//  back을 통해서는 queue의 가장 뒤에 있는 정수를 출력하고 정수가 없는 경우 -1 반환
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