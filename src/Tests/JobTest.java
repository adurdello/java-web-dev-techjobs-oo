package Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    Job test_job;
    Job test_job2;

    @Before
    public void createJobObject() {
        test_job = new Job("Developer", new Employer("DST"), new Location("Miami"), new PositionType("Web Development"), new CoreCompetency("Java"));
        test_job2 = new Job("Zoologist", new Employer("St. Louis Zoo"), new Location("St. Louis"), new PositionType("Animal Welfare"), new CoreCompetency("Compassion"));
    }

    @Test
    public void testSettingJobId() {
        assertEquals(1,test_job.getId(),.001);
        assertEquals(2, test_job2.getId(), .001);
        assertTrue(test_job.getId() == 1);
        assertFalse(test_job.getId() == 2);
        assertTrue(test_job2.getId() == 2);
        assertFalse(test_job2.getId() == 5);
    }

    @Test
    public void testJobConstructorSetsAllFields() {

        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        System.out.println(test_job3.getCoreCompetency());
        System.out.println(test_job3.getEmployer().toString());
        assertTrue(test_job3 instanceof Job);
        assertTrue(test_job3.getName().equals("Product tester"));
        assertTrue(test_job3.getEmployer().toString().equals("ACME"));
        assertEquals("Product tester", test_job3.getName());
        assertEquals("Desert", test_job3.getLocation().toString());
        assertEquals("Quality control", test_job3.getPositionType().toString());
        assertEquals("Persistence", test_job3.getCoreCompetency().toString());
    }

    @Test
    public void testJobsForEquality() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(test_job4.equals(test_job5));
    }
    @Test
    public void blankLines() {
        Job test_job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//      System.out.println("\n" + "text" + "\n");
        System.out.println(test_job6);
        assertEquals("\n" + "text" + "\n", test_job6.toString());
    }
    @Test
    public void blankLinesAndJobData() {
        Job test_job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println("test");
      assertEquals("\n" + "text" + "\n", test_job7.toString());
    }
}
