import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Testes{

    @Test
    public void getBicycleTest() throws UserAlreadyExists, UserDoesNotExists {
        BikeRentalSystem Sistema=new BikeRentalSystem(1);
        Sistema.registerUser(1,"um",1);
        Sistema.registerUser(2,"dois",2);
        Sistema.registerUser(3,"tres",3);
        Sistema.addCredit(1,1);
        Sistema.addCredit(2,2);
        Sistema.addBicycle(1,1,1);
        Sistema.addBicycle(2,1,2);
        Sistema.getBicycle(2,2,0);
        Sistema.getBicycle(1,1,-1);

    }
}
