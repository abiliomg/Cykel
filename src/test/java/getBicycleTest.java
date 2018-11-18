import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class getBicycleTest {
    public BikeRentalSystem sistemaa;
    @BeforeEach
    public void preCondicoes() throws UserAlreadyExists, UserDoesNotExists {
        sistemaa=null;
        sistemaa=new BikeRentalSystem(1);
        sistemaa.registerUser(1,"um",1);
        sistemaa.registerUser(2,"dois",2);
        sistemaa.registerUser(3,"tres",3);
        sistemaa.addCredit(1,1);
        sistemaa.addCredit(2,2);
        sistemaa.addBicycle(1,1,1);
        sistemaa.addBicycle(2,1,2);
        sistemaa.getBicycle(2,2,0);
    }

    @Test
    public void testCase1()   throws  UserDoesNotExists {

            assertEquals(null,sistemaa.getBicycle(1,1,-1));

    }
    @Test
    public void testCase2() throws  UserDoesNotExists {

            assertEquals(1,sistemaa.getBicycle(1,1,0));

    }
    @Test
    public void testCase3() throws  UserDoesNotExists {

            assertEquals(1,sistemaa.getBicycle(1,1,1));

    }
    @Test
    public void testCase4() throws  UserDoesNotExists {

            assertEquals(null,sistemaa.getBicycle(1,-1,0));

    }@Test
    public void testCase5() throws  UserDoesNotExists {

            assertEquals(null,sistemaa.getBicycle(1,0,0));

    }@Test
    public void testCase6() throws  UserDoesNotExists {

            assertEquals(1,sistemaa.getBicycle(1,1,0));

    }@Test
    public void testCase7() throws  UserDoesNotExists {

            assertEquals(-1,sistemaa.getBicycle(1,2,0));

    }@Test
    public void testCase8() throws  UserDoesNotExists {

            assertEquals(-1,sistemaa.getBicycle(1,3,0));

    }@Test
    public void testCase9() throws  UserDoesNotExists {
        assertThrows(UserDoesNotExists.class,()->{
            sistemaa.getBicycle(1,4,0);
        });
    }@Test
    public void testCase10()   throws  UserDoesNotExists {

        assertEquals(null,sistemaa.getBicycle(-1,1,0));

    }@Test
    public void testCase11()   throws  UserDoesNotExists {

        assertEquals(null,sistemaa.getBicycle(0,1,0));

    }@Test
    public void testCase12() throws  UserDoesNotExists {

        assertEquals(1,sistemaa.getBicycle(1,1,0));

    }@Test
    public void testCase13() throws  UserDoesNotExists {

        assertEquals(-1,sistemaa.getBicycle(2,1,0));

    }@Test
    public void testCase14() throws  UserDoesNotExists {

        assertEquals(-1,sistemaa.getBicycle(3,1,0));

    }
}
