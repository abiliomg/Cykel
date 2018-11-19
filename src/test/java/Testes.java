import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Testes{

/*
    @BeforeEach
    public void executedBeforeEach(){
        BikeRentalSystem Sistema=new BikeRentalSystem(1);
        try {
            Sistema.registerUserTest(1,"um",1);
        } catch (UserAlreadyExists userAlreadyExists) {
            userAlreadyExists.printStackTrace();
        }

        Sistema.addCredit(1,10);
        Sistema.verifyCredit(1);
    }*/

    @Test
    void verifyCredit(){

        BikeRentalSystem Sistema=new BikeRentalSystem(1);
        try {
            Sistema.registerUser(1,"um",1);
        } catch (UserAlreadyExists userAlreadyExists) {
            userAlreadyExists.printStackTrace();
        }

        Sistema.addCredit(1,10);

        assertEquals(true,Sistema.verifyCredit(1));
    }

    @Test
    void myFirstTest() {
        assertEquals(2, 1 + 1);
    }

/*
    @Test
    public void getBicycleTest() throws UserAlreadyExists, UserDoesNotExists {

        BikeRentalSystem Sistema=new BikeRentalSystem(1);
        Sistema.registerUserTest(1,"um",1);
        Sistema.registerUserTest(2,"dois",2);
        Sistema.registerUserTest(3,"tres",3);
        Sistema.addCredit(1,1);
        Sistema.addCredit(2,2);
        Sistema.addBicycle(1,1,1);
        Sistema.addBicycle(2,1,2);
        Sistema.getBicycle(2,2,0);
        System.out.println(Sistema.getBicycle(3,1,0));
    }
    */

}
