import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class GradeBookTest {
    private GradeBook g1;
    private GradeBook g2;

    @Before
    public void setUp() throws Exception {
        g1 = new GradeBook(5);
        g2 = new GradeBook(5);
        
        g1.addScore(50);
        g1.addScore(60);
        g1.addScore(70);
        
        g2.addScore(75);
        g2.addScore(80);
        g2.addScore(85);
        
    }
    
    @After
    public void tearDown() throws Exception {
        g1 = null;
        g2 = null;
    }
    
    @Test
    public void testSum() {
        assertEquals(180, g1.sum(), .0001);
        assertEquals(240, g2.sum(), .0001);
    }
    
    @Test
    public void testMinimum(){
        assertEquals(50, g1.minimum(), .001);
        assertEquals(75, g2.minimum(), .001);
        }

	@Test
    public void addScoreTest(){
        assertTrue(g1.toString().equals("50.0 60.0 70.0" ));
        assertTrue(g2.toString().equals("75.0 80.0 85.0" ));
    }
    

		

	@Test
    public void finalScore() {
        assertEquals(130, g1.finalScore(), 0.001);
        assertEquals(165, g1.finalScore(), 0.001);
    }


    }
    
