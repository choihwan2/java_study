package mystack;

public class MyStack {
	private int[] data = null;
	private int stack_pos = 0;

	public MyStack() {
		this.data = new int[10];
	}

	public MyStack(int size) {
		super();
		if (size < 0) {
			this.data = new int[10];
		}else {
			this.data = new int[size];
		}
	}

	public void push(int data) {
		if (isFull()) {
			int[] temp = new int[this.data.length * 2];
			System.arraycopy(this.data, 0, temp, 0, this.data.length);
			this.data = temp;
			temp = null;
			this.data[stack_pos] = data;
			stack_pos++;
			System.out.println("스택이 가득 차 있습니다.");
		} else {
			this.data[stack_pos] = data;
			stack_pos++;
		}
	}

	public int pop() {
		if (isEmpty()) {
			return -1;
		} else {
			stack_pos--;
			int pop = this.data[stack_pos];
			this.data[stack_pos] = 0;
			return pop;
		}

	}

	public int top() {
		if (isEmpty()) {
			System.out.println("스택이 비어있어용");
			return -1;
		} else {
			return this.data[stack_pos - 1];
		}
	}

	public boolean isEmpty() {
		boolean flag = false;
		if (stack_pos == 0) {
			flag = true;
		}
		return flag;
	}

	public boolean isFull() {
		boolean flag = false;
		if (data.length == stack_pos) {
			flag = true;
		}
		return flag;
	}

}
