package Main;

public class Exceptionhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//throws the exception
			int a=10;
			int b=0;
			int div=a/b;
			System.out.println("division is:"+div);
		}
		catch(ArithmeticException e) {
			//solving or debugging
			System.out.println("My error:"+e);
		}
		finally {
			//always executing
			System.out.println("my error is solving");
		}

	}

}
