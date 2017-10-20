import java.util.*;
public class Calculator{

public static int Add(int a, int b){
 a=10;
 b=20;	
return a+b;
}
public static int Sub(int a, int b){
	 a=20;
	 b=10;
	return a-b;
}
public static int Div(int a, int b){
	 a=20;
	 b=10;
	return a/b;
}
public static int Mul(int a, int b){
	 a=10;
	 b=20;
	return a*b;
}

public static void main(String []args){
	Calculator c=new Calculator();
	System.out.println(c.Add(0,0));
	System.out.println(c.Sub(0,0));
	System.out.println(c.Div(0,0));
	System.out.println(c.Mul(0,0));
		
		}
				
				
				
				}