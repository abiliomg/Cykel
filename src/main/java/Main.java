import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
public class Main {
    public static void main(String[] args) throws UserDoesNotExists, UserAlreadyExists {
        BikeRentalSystem Sistema=new BikeRentalSystem(1);
        Sistema.registerUser(1,"um",1);
        Sistema.registerUser(2,"dois",2);
        Sistema.registerUser(3,"tres",3);
        Sistema.addCredit(1,1);
        Sistema.addCredit(2,2);
        Sistema.addBicycle(1,1,1);
        Sistema.addBicycle(2,1,2);
        int returna=Sistema.getBicycle(3,2,1);
        System.out.println(returna);
    }
}
