package testing;

public class Calculator {
	public int add(int a, int b) {
		return a+b;
	}
	public float add(float a, float b) {
		if (a>2) {
			System.out.println("Some message");
		}
		return a+b;
	}
	public double divide(int a, int b) {
		return (double)a/b;
	}

}
