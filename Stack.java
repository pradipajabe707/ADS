class Stack {

    int count;
    int a1;
    int a2;
	int[] arr;
	
	public Stack (int b){
		arr=new int[b];
		count=b;
		a1=-1;
		a2=count;
	}
	
	public void push1(int m){
		
		if (a1<a2-1){
			a1++;
			arr[a1]=m;
			
		}else{
			System.out.print("Overflow");
			System.exit(0);
		}
	}
	
	public  void push2(int m){
		
			if (a1<a2-1){
			a2--;
			arr[a2]=m;
			
		}else{
			System.out.print("Overflow");
			System.exit(0);
		}
	}
	
	public int pop1(){
		if(a1>=0){
			
			int m =arr[a1];
			a1--;
			return m;
		}else{
			
			System.out.print("underflow");
			System.exit(0);
		}
		
		return 0;
	}
	
	public int pop2(){
		if(a2<=count){
			
			int m =arr[a2];
			a2++;
			return m;
		}else{
			
			System.out.print("underflow");
			System.exit(0);
		}
		
		return 0;
	}
	
	public static void main(String args []){
		Stack s1 = new Stack(5);
		
		s1.push1(5);
		s1.push2(10);
		s1.push2(15);
		s1.push1(11);
		s1.push2(7);
		
		
		System.out.println("popped element fromt stack 1 is  "+s1.pop1());
		s1.push2(40);
		
		System.out.println("popped element fromt stack 2 is  "+s1.pop2());
		
	}
	

}