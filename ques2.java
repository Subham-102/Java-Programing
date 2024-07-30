import java.util.Scanner;
class ques2{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First number :- ");
		int a = sc.nextInt();
		System.out.print("Enter Second number :- ");
		int b = sc.nextInt();
		int sum = a+b;
		if(sum%2==0){
			System.out.println("Sanjeevni");
		}
		else{
			System.out.println("Subham");
		}
	}
}