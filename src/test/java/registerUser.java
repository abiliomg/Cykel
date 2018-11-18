import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;




public class registerUser {




    private BikeRentalSystem Sistema;

    @BeforeEach
    void init(){
        Sistema = null;
        Sistema=new BikeRentalSystem(3);

    }
/*
    @Test
    void caseID1()  {
        try {
          Sistema.registerUser(1,"Ricardo",1);
        } catch (UserAlreadyExists userAlreadyExists) {
            userAlreadyExists.printStackTrace();
        }
    }
    */

    @Test //Teste Case em que já existe um utilizador com o mesmo ID
    void caseID8() throws UserAlreadyExists {

        Sistema.registerUser(0,"Ricardo",1);

        assertThrows(UserAlreadyExists.class,() -> {
            Sistema.registerUser(0,"Ricardo",1);;
        });

    }

}
