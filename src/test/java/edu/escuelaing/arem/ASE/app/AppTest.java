package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertTrue;



import org.junit.Test;


public class AppTest
{
	public void testApp()
    {
        assertTrue( true );
    }
    
	@Test
	public void meanTest() {
		
		principal princ = new principal();
    	princ.list.add(160);
		princ.list.add(591);
		princ.list.add(114);
		princ.list.add(229);
		princ.list.add(230);
		princ.list.add(270);
		princ.list.add(128);
		princ.list.add(1657);
		princ.list.add(624);
		princ.list.add(1503);
		
		//System.out.println(princ.mean() == (float) 550.6);			
		assertTrue(princ.mean() == (float) 550.6);
		
	}
	
	@Test
	public void StandardDesviationTest() {
		
		principal princ = new principal();
    	princ.list.add(160);
		princ.list.add(591);
		princ.list.add(114);
		princ.list.add(229);
		princ.list.add(230);
		princ.list.add(270);
		princ.list.add(128);
		princ.list.add(1657);
		princ.list.add(624);
		princ.list.add(1503);
		princ.mean();
		//System.out.println(princ.StandardDesviation());			
		assertTrue(princ.StandardDesviation() == (float) 572.03);
	}
	
	
    
}
