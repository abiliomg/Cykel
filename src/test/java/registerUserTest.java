import Exceptions.UserAlreadyExists;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class registerUserTest {

    private BikeRentalSystem Sistema;

    @BeforeEach
    void init(){
        Sistema = null;
        Sistema=new BikeRentalSystem(3);

    }


    @Test //Teste case com rentalProgram inválido
    void caseID1()throws UserAlreadyExists {
        Sistema.registerUser(1,"teste1",0);
        assertNotEquals(1,Sistema.getUsers().get(0).getIDUser());
    }

    @Test //Teste case com todos os campos válidos
    void caseID2()throws UserAlreadyExists {
        Sistema.registerUser(1,"teste1",1);
        assertEquals(1,Sistema.getUsers().get(0).getIDUser());
    }

    @Test //Teste case com todos os campos válidos
    void caseID3()throws UserAlreadyExists {
        Sistema.registerUser(1,"teste1",2);
        assertEquals(1,Sistema.getUsers().get(0).getIDUser());
    }

    @Test //Teste case com rentralProgram inválido
    void caseID4()throws UserAlreadyExists{
        Sistema.registerUser(1,"teste1",3);
        assertNotEquals(1,Sistema.getUsers().get(0).getIDUser());

    }

    @Test //Teste case com name inválido
    void caseID5()throws UserAlreadyExists{
        Sistema.registerUser(1,null,1);
        assertNotEquals(1,Sistema.getUsers().get(0).getIDUser());
    }

    @Test //Teste case com todos os campos válidos
    void caseID6() throws UserAlreadyExists {
        Sistema.registerUser(1,"teste1",1);
        assertEquals(1,Sistema.getUsers().get(0).getIDUser());
    }

    @Test // Teste case em que é adicionado um utilizador com id invalido
    void caseID7() throws UserAlreadyExists {
        Sistema.registerUser(-1,"teste1",1);
        assertNotEquals(-1,Sistema.getUsers().get(0).getIDUser());

   }

    @Test //Teste Case em que já existe um utilizador com o mesmo ID
    void caseID8() throws UserAlreadyExists {

        Sistema.registerUser(0,"teste1",1);

        assertThrows(UserAlreadyExists.class,() -> {
            Sistema.registerUser(0,"teste1",1);
        });

    }

}
