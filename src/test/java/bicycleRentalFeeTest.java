import Exceptions.UserAlreadyExists;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class bycicleRentalFeeTest {
private  BikeRentalSystem Sistema;



    @BeforeEach
    void init() throws UserAlreadyExists {
        Sistema = null;
        Sistema=new BikeRentalSystem(3);
        Sistema.registerUser(0,"teste1",1);
}

    @Test
    void caseID1(){
        assertEquals(null,Sistema.bicycleRentalFee(1,0,-1,0));
    }

    @Test
    void caseID2(){
        assertEquals(0,Sistema.bicycleRentalFee(1,0,0,0));
    }

    @Test
    void caseID3(){
        assertEquals(3,Sistema.bicycleRentalFee(1,0,1,0));
    }


    @Test
    void caseID4(){
        assertEquals(null,Sistema.bicycleRentalFee(1,-1,0,0));
    }

    @Test
    void caseID5(){
        assertEquals(0,Sistema.bicycleRentalFee(1,0,0,0));
    }

    @Test
    void caseID6(){
        assertEquals(null,Sistema.bicycleRentalFee(1,1,0,0));
    }

    @Test
    void caseID7(){
        assertEquals(null,Sistema.bicycleRentalFee(1,0,0,-1));
    }

    @Test
    void caseID8(){

        assertEquals(0,Sistema.bicycleRentalFee(1,0,0,0));
    }

    @Test
    void caseID9(){
        assertEquals(0,Sistema.bicycleRentalFee(1,0,0,1));
    }

    @Test
    void caseID10(){

        assertEquals(null,Sistema.bicycleRentalFee(0,0,0,0));
    }


    @Test
    void caseID11(){

        assertEquals(0,Sistema.bicycleRentalFee(1,0,0,0));
    }

    @Test
    void caseID12(){

        assertEquals(0,Sistema.bicycleRentalFee(2,0,0,0));
    }

    @Test
    void caseID13(){

        assertEquals(0,Sistema.bicycleRentalFee(2,0,0,1));
    }

    @Test
    void caseID14(){

        assertEquals(31,Sistema.bicycleRentalFee(2,0,11,1));
    }

    @Test
    void caseID15(){
        assertEquals(0,Sistema.bicycleRentalFee(3,0,0,0));
    }



}
