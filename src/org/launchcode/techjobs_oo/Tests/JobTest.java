package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JobTest {
    Job job1;
    Job job2;
    @Before
    public void setup(){
        job1 = new Job("Product Tester", new Employer("Acme"),new Location("Desert"),new PositionType("Quality Control"),new CoreCompetency("Persistence"));
        job2 = new Job();
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
}
