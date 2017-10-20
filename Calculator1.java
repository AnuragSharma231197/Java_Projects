import java.util.*;
public class Calculator1{
	static Scanner scan=new Scanner(System.in);
	static int num1;
	static int num2;
	public static void Add(){
		System.out.println("Enter First number:");
		 num1=scan.nextInt();
		 System.out.println("Enter Second number:");
		 num2=scan.nextInt();
		int sum=num1+num2;
		System.out.print("Sum-");
		System.out.println(sum);
	}
	public static void Sub(){
		int sub;
		System.out.println("Want to find negative number or not?");
		scan.nextLine();
		String Answer=scan.nextLine();
		if(Answer.equals("Yes")){
			System.out.println("Enter First number:");
			num1=scan.nextInt();
			System.out.println("Enter Second number:");
			num2=scan.nextInt();
			sub=num1-num2;
			System.out.print("Sub: ");
			System.out.println(sub);
		}
		else{
			if(num1>num2){
				sub=num1-num2;
				System.out.println(sub);
			}
			else{
				sub=num2-num1;
				System.out.println(sub);
			}
		}
	}
	public static void Mul(){
		System.out.println("Enter First number:");
		num1=scan.nextInt();
		System.out.println("Enter Second number:");
		num2=scan.nextInt();
		int Mul=num1*num2;
		System.out.print("Product:");
		System.out.println(Mul);
	}
	
	public static void Div(){
		System.out.println("Enter First number:");
		num1=scan.nextInt();
		System.out.println("Enter Second number:");
		num2=scan.nextInt();
		int div=num1/num2;
		System.out.print("Quotient:");
		System.out.println(div);
	}
	
	public static void main(String []args){
		Calculator1 c=new Calculator1();
		System.out.println("1.Add 2.Sub 3.Mul 4.Div");
		int number=scan.nextInt();
		if(number==1){
			c.Add();
		}
		else if(number==2){
			c.Sub();
		}
		else if(number==3){
			c.Mul();
		}
		else if(number==4){
			c.Div();
		}
		else{
			System.out.println("Error");
		}
		
	}
}