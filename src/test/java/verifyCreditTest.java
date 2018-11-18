import Exceptions.UserAlreadyExists;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class verifyCreditTest {

    private BikeRentalSystem Sistema;

    @BeforeEach
    public void init() throws UserAlreadyExists {
        Sistema = null;
        Sistema=new BikeRentalSystem(3);
        Sistema.registerUser(0,"Ricardo",1);
        Sistema.registerUser(1,"Abilio",1);
        Sistema.addCredit(0,0);
        Sistema.addCredit(1,1);
    }

    @Test //Utilizador com ID invalido
    public void caseID1(){
        assertEquals(null,Sistema.verifyCredit(-1));

    }

    @Test //Utilizador sem dinheiro na conta
    public void caseID2(){
        assertEquals(false,Sistema.verifyCredit(0));
    }

    @Test //Utilizador com dinheiro na conta
    public void caseID3(){
        assertEquals(true,Sistema.verifyCredit(1));
    }

    @Test //Utilizador não existe
    public void caseID4(){
        assertEquals(false,Sistema.verifyCredit(2));
    }
}
