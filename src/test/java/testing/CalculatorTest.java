package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {
//A-Arrange
//A-Act
//A-Assert
	Calculator calculator;//Arrange

	@BeforeEach
	void init() {
		calculator = new Calculator();
		System.out.println("init");
	}
	@Test
	void testAdd() {
		calculator = new Calculator();//Arrange
		int result = calculator.add(1, 3);//act
		assertEquals(4,result,"Test failed");
	}
	
	@Test
	void testAddFloatGreaterThan2() {
		calculator = new Calculator();//Arrange
		float result = calculator.add(5.5f, 3f);//act
		assertEquals(8.5,result,"Test failed");
	}
	
	
	@Test
	void testAddFirstNegative() {
		calculator = new Calculator();//Arrange
		int result = calculator.add(-1, 3);//act
		assertEquals(2,result,"Test failed");
	}
	
	@Test
	void testAddSecondNegative() {
		calculator = new Calculator();//Arrange
		int result = calculator.add(1, -3);//act
		assertEquals(-2,result,"Test failed");
	}
	
	@Test
	void testAddBothNegative() {
		calculator = new Calculator();//Arrange
		int result = calculator.add(-1, -3);//act
		assertEquals(-4,result,"Test failed");
	}
	
	@Test
	void testDivideResultInteger() {
		calculator = new Calculator();//Arrange
		double result = calculator.divide(4, 2);//act
		assertEquals(2,result,"Test failed");
	}
	
	@Test
	void testDivideResultDouble() {
		calculator = new Calculator();//Arrange
		double result = calculator.divide(2, 4);//act
		assertEquals(0.5,result,"Test failed");
	}
	
	@Test
	void testWhenDenominatorIsZero() {
		calculator = new Calculator();//Arrange
		try {
			calculator.divide(1, 0);
		} catch (Exception e) {
			assertNotNull(e);
			assertEquals(ArithmeticException.class, e.getClass());
		}
	}
	
	
	@Test
	void testAddFloat() {
		calculator = new Calculator();
		float result = calculator.add(1.2f, 3.1f);
		assertEquals(4.3, result,000002);
	}

}
