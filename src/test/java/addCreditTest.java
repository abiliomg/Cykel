import Exceptions.UserAlreadyExists;
import static org.junit.jupiter.api.Assertions.*;

import Exceptions.UserDoesNotExists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class addCreditTest {
    BikeRentalSystem sistema;
    @BeforeEach
    void init() throws UserAlreadyExists {
        sistema = null;
        sistema=new BikeRentalSystem(3);
        sistema.registerUser(0,"teste",1);
    }
    @Test
    public void testCase1(){
        sistema.addCredit(0,0);
        assertEquals(0,sistema.getUsers().get(0).getCredit());
    }
    @Test
    public void testCase2(){
        sistema.addCredit(0,1);
        assertEquals(1,sistema.getUsers().get(0).getCredit());
    }

    @Test
    public void testCase3(){
        sistema.addCredit(0,2);
        assertEquals(2,sistema.getUsers().get(0).getCredit());
    }
    @Test
    public void testCase4(){
        sistema.addCredit(-1,1);
    }
    @Test
    public void testCase5(){
        sistema.addCredit(0,1);
        assertEquals(1,sistema.getUsers().get(0).getCredit());
    }
    @Test
    public void testCase6(){
        sistema.addCredit(1,1);
        assertThrows(IndexOutOfBoundsException.class,() -> {
            sistema.getUsers().get(1).getCredit();
        });

    }
}
