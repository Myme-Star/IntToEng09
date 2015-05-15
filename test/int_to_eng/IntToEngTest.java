package int_to_eng;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class IntToEngTest {

	@Test
	public void test1() {
		String expected = "one";
		String actual = IntToEng.translateEng(1);
		assertThat(actual, equalTo(expected));
		
		
	}
	@Test
	public void test21() {
		String expected = "twenty one";
		String actual = IntToEng.translateEng(21);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void testOnes() {
		String expected = "eight";
		String actual = IntToEng.ones(8);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void testTens() {
		String expected = "eighty";
		String actual = IntToEng.tens(8);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void testTeens() {
		String expected = "nineteen";
		String actual = IntToEng.teens(19);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void test40() {
		String expected = "forty";
		String actual = IntToEng.translateEng(40);
		assertThat(actual, equalTo(expected));
		
	}
	@Test
	public void test322() {
		String expected = "three hundred twenty two";
		String actual = IntToEng.translateEng(322);
		assertThat(actual, equalTo(expected));
	}
	@Test
	public void test110() {
		String expected = "one hundred ten";
		String actual = IntToEng.translateEng(110);
		assertThat(actual, equalTo(expected));
	}	
	@Test
	public void test8122() {
		String expected = "eight thousand one hundred twenty two";
		String actual = IntToEng.translateEng(8122);
		assertThat(actual, equalTo(expected));
	}
	@Test
	public void test1018() {
		String expected = "one thousand eighteen";
		String actual = IntToEng.translateEng(1018);
		assertThat(actual, equalTo(expected));
	}
	@Test
	public void test21118() {
		String expected = "twenty one thousand one hundred eighteen";
		String actual = IntToEng.translateEng(21118);
		assertThat(actual, equalTo(expected));
	}
}