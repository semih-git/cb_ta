package org.cb.ta.FullTest;

public class Lambda {

	static interface IPrintable{
		void printMe(String name, int age);
		
		default void printMe2(){
			
		}
		static void printMe3() {
			
		}
	}
	static class PrintableImpl implements IPrintable{
		
		public void printMe(String name, int age) {System.out.println("accept");}
	}
	static class LambdaTest{
		public void print(IPrintable printable) {printable.printMe("TA",26);}
	}
	static class Employee{
		public void printName() {
			System.out.println("hi,CB");
		}
	}
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.printName();
		PrintableImpl printableImpl = new PrintableImpl();
		printableImpl.printMe("CB", 16);
		LambdaTest lambdaTest = new LambdaTest();
		lambdaTest.print(printableImpl);
		IPrintable printable = (n,i)->{
			System.out.println(n);
		};
		lambdaTest.print(printable);
		
		/**
		 * we do not need to write parameter type.
		 * if there is only one parameter, no need to use parentheses.
		 * if there is only one line in method body, no need to use curly brackets.
		 * 
		 * Functional Interface: Only one abstract method.
		 * Runnable, Comparator, Consumer, Callable.
		 */
		
		/**
		 * METHOD
		 * access modifier - return type - name - ( parameters ) { body }
		 * public void printName(String name, int age) {
				System.out.println("Hi, CB");
		   }
		 * 		 
		 * ANONYMOUS METHOD
		 * (parameters) -> { body }		 
		 * (String name, int age)-> { 
		 * 	System.out.println("Hi, CB"); 
		 * }
		 */
	}

}
