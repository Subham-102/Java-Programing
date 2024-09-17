import java.util.Scanner;
class sanjeevni_ka_code_ka_solution{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements of the array :- ");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter the elements of the array :-  ");
		for(int i=0;i<n;i++){
			int arr[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++){
			if(arr[j] == arr[j+1]){
				System.out.println("Duplicate element found!!!");
			}
			else{
				System.out.println("No duplicate element found!!!");
			}
		}
	}
}