
public class Demo {
	int value1;
	int value2;

	Demo() {

		value1 = 10;
		value2 = 20;
		System.out.println("Inside Constructor");
	}

	     void Demo(int a) {
	
		System.out.println("bikash is not bad guy");

	}

	Demo(int a, int b) {
		this();
		System.out.println("bikash is good man bro ");
	}
	Demo(int a, int b,int c) {
		this(a, b);
		System.out.println("bikash is ehhhh ");
	}

	public static void main(String[] args) {

		Demo d3 = new Demo(3,6,7);

	}
	
}




