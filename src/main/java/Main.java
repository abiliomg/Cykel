import Exceptions.UserAlreadyExists;
import Exceptions.UserDoesNotExists;
public class Main {
    public static void main(String[] args) throws UserDoesNotExists, UserAlreadyExists {
      BikeRentalSystem  Sistema=new BikeRentalSystem(3);
      Sistema.registerUser(1,"Ricardo",1);
      Sistema.registerUser(1,"Ricardo",1);

        System.out.println(Sistema.getUsers());
    }
}
