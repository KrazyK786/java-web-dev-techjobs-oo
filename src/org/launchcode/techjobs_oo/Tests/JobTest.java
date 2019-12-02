package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job job1;
    Job job2;
    Job emptyJob;
    Job noPropertyJob;
    String[] actualArr;

    @Before
    public void setup(){
        job1 = new Job("Product Tester", new Employer("Acme"),new Location("Desert"),new PositionType("Quality Control"),new CoreCompetency("Persistence"));
        job2 = new Job("Product Tester", new Employer("Acme"),new Location("Desert"),new PositionType("Quality Control"),new CoreCompetency("Persistence"));

        noPropertyJob = new Job("", new Employer(""),new Location(""),new PositionType(""),new CoreCompetency(""));

        emptyJob = new Job();


        actualArr = job1.toString().split("\n");
    }

    @Test
    public void testSettingJobId(){
        assertTrue(job2.getId() == job1.getId() + 1);
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        assertEquals("Product Tester",job1.getName());
        assertEquals("Acme",job1.getEmployer().getValue());
        assertEquals("Desert",job1.getLocation().getValue());
        assertEquals("Quality Control",job1.getPositionType().getValue());
        assertEquals("Persistence",job1.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality(){
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringContainsBlankLineBeforeAndAfterJobInfo(){
        String[] outputArr = job1.toString().split("");
        String actualBegin = outputArr[0];
        String actualEnd = outputArr[outputArr.length - 1];
        assertEquals("\n",actualBegin);
        assertEquals("\n",actualEnd);
    }

    @Test
    public void testToStringContainsLabelAndValueOnSeparateLines(){
        assertEquals("ID: " + job1.getId(),actualArr[1]);
        assertEquals("Name: " + job1.getName(),actualArr[2]);
        assertEquals("Employer: " + job1.getEmployer(),actualArr[3]);
        assertEquals("Location: " + job1.getLocation(),actualArr[4]);
        assertEquals("Position Type: " + job1.getPositionType(),actualArr[5]);
        assertEquals("Core Competency: " + job1.getCoreCompetency(),actualArr[6]);
    }

    @Test
    public void testEmptyFieldDisplaysDataNotAvailable(){
        String[] noPropArr = noPropertyJob.toString().split("\n");
        assertTrue(noPropArr[2].contains("Data not available"));
        assertTrue(noPropArr[3].contains("Data not available"));
        assertTrue(noPropArr[4].contains("Data not available"));
        assertTrue(noPropArr[5].contains("Data not available"));
        assertTrue(noPropArr[6].contains("Data not available"));
    }

    @Test
    public void testIdOnlyJobsDisplayJobDoesntExist(){
        assertEquals("OOPS! This job does not seem to exist.",emptyJob.toString());
    }
}
