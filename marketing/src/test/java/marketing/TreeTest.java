package marketing;

import org.testng.annotations.Test;

public class TreeTest {
	@Test
	public void root() {
		System.out.println("1st method in second class executed");
	}
	@Test
	public void stem() {
		System.out.println("2nd method in second class executed ");
	}
	@Test
	public void branches() {
		System.out.println("3rd method in second class executed");
	}

}
