import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
public class returnBikycleTest {
    public BikeRentalSystem sistema;
    @BeforeEach
    public void preCondicoes() throws UserAlreadyExists, UserDoesNotExists {
        sistema=null;
        sistema=new BikeRentalSystem(1);
        sistema.registerUser(0,"um",1);
        sistema.registerUser(1,"dois",2);
        sistema.addCredit(0,1);
        sistema.addCredit(1,2);
        sistema.addBicycle(1,1,1);
        sistema.addBicycle(2,1,2);
        sistema.getBicycle(1,0,0);
    }
    @Test
    public void testCase1() {

        assertEquals(null,sistema.returnBicycle(1,0,-1));

    }
    @Test
    public void testCase2() {

        assertEquals(1,sistema.returnBicycle(1,0,0));

    }
    @Test
    public void testCase3()  {

        assertEquals(1,sistema.returnBicycle(1,0,1));

    }
    @Test
    public void testCase4() {

        assertEquals(null,sistema.returnBicycle(1,-1,0));

    }
    @Test
    public void testCase5() {

        assertEquals(1,sistema.returnBicycle(1,0,0));

    }
    @Test
    public void testCase6() {

        assertEquals(-1,sistema.returnBicycle(1,1,0));

    }
    @Test
    public void testCase7() {

        assertEquals(-1,sistema.returnBicycle(1,2,0));

    }
    @Test
    public void testCase8() {

        assertEquals(null,sistema.returnBicycle(0,0,0));

    }
    @Test
    public void testCase9() {

        assertEquals(1,sistema.returnBicycle(1,0,0));

    }
    @Test
    public void testCase10() {

        assertEquals(-1,sistema.returnBicycle(2,0,0));

    }
    @Test
    public void testCase11() {

        assertEquals(-1,sistema.returnBicycle(3,0,0));

    }
}
