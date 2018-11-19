import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
public class Main {
    public static void main(String[] args) throws UserDoesNotExists, UserAlreadyExists {

        /*int x,y;

        x = 1;
        y = 2;*/


        BikeRentalSystem  Sistema=new BikeRentalSystem(3);
        Sistema.registerUser(0,"Ricardo",1);
        Sistema.addCredit(1,10);
    }
}
