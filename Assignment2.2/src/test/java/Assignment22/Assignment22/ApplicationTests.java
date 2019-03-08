package Assignment22.Assignment22;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

// @RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests extends TestCase {

	@Test
	public void contextLoads() {
	}

	public ApplicationTests(String student) {super (student);}

	public static junit.framework.Test suite()
	{
		return new TestSuite( ApplicationTests.class );
	}

	public void testApp(){assertTrue(true);}
}

