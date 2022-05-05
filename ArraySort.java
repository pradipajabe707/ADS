import java.util. * ;

class ArraySort {

    public void insrtionSort(int[]a) {
        int i;
        int j;
        int temp;
        for (i = 0; i < a.length; i++) {
            temp = a[i];
            for (j = i - 1; j >= 0 && a[j] > temp; j--) {
                a[j + 1] = a[j];
            }
            a[j + 1] = temp;
			display(a);
			 System.out.println();
        }
		
    }
	
	public void insreetSort1(int[] a){
		
		for (i = 0; i < a.length-1; i++) {
            
            for (j = 0; j <a.length-1-i; j--) {
                x++;
				if(a[j]>a[j+1]){
					int temp =a[j];
					a[j]=a[j+1];
				    a[j+1]=temp;
					
				}
				
            }
            
        }
	}
	
	public static void display(int [] a){
		
        for (int i = 0; i < a.length; i++) {
           System.out.print(a[i]+" ");
	}
	}
	
	

    public static void main(String[] args ) {
		
		ArraySort a1 = new ArraySort();

        int n;
        int[]arr;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a size of array");
        n = sc.nextInt();
        System.out.println("Enter a element of array");
        arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
		
		a1.insrtionSort(arr);
		a1.insreetSort1(arr);
		

    }
}