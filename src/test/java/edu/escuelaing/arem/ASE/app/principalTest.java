package edu.escuelaing.arem.ASE.app;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

import edu.escuelaing.arem.ASE.app.principal;

class principalTest {

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
						
			assertTrue(princ.mean() == 550.6);
			
		}
		
		
	

}
