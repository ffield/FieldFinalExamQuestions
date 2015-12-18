package QuestionE;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Student_Test() {
		
		Date dBirthDate = null;
		try {
			dBirthDate = new SimpleDateFormat("yyyy-MM-dd").parse("1972-07-31");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Student stu1 = new Student("Bert", "Randall", "Gibbons", dBirthDate, "214 Labrador Lane", "302-893-6889", "bgibbons@udel.edu","MIS");
		Student stu2 = new Student("Francis", "Laurence", "Field", dBirthDate, "2413 W 17th St", "302-893-6889", "ffield@udel.edu","MIS");
		Student stu3 = new Student("Justin", "Taylor", "Field", dBirthDate, "2413 W 17th St", "302-893-6889", "jfield@udel.edu","MIS");
		Student stu4 = new Student("Charlie", "Paul", "Field", dBirthDate, "2413 W 17th St", "302-893-6889", "cfield@udel.edu","MIS");
		Student stu5 = new Student("Nathan", "Robert", "Field", dBirthDate, "2413 W 17th St", "302-893-6889", "nfield@udel.edu","MIS");
		
		HashMap testMap = new HashMap();
		testMap.put(stu1.getPersonID(),stu1);
		testMap.put(stu2.getPersonID(),stu2);
		testMap.put(stu3.getPersonID(),stu3);
		testMap.put(stu4.getPersonID(),stu4);
		testMap.put(stu5.getPersonID(),stu5);
		
		
		

		assertTrue(testMap.size()==5);
	}

}
