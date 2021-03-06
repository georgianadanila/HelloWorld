/**
 * 
 * @author Georgiana Danila
 *
 */
public class FinallyExample {
	
	static int method1() {
		try {
			return 2;
		} finally {
			System.out.println("Executing finally block in method1()");
		}
	}
	
	static void method2() {
		try {
			throw new RuntimeException("Unchecked error");
		} finally {
			System.out.println("Executing finally block in method2()");
		}
	}
	
	static int method() {
		try {
			return 1;
		} finally {
			return 2;
		}
	}
}
