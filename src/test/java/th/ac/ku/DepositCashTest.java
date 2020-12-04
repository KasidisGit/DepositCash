package th.ac.ku;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepositCashTest {

    Customer customer = new Customer();

    Agent agent = new Agent();

    @Test
    void deposit_Less_Than_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkOneTimeDeposit(customer.deposit(20000.0));
        assertEquals(expectedResult ,actualResult);
    }
    @Test
    void deposit_equal_to_30000_Result_Should_Be_True(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkOneTimeDeposit(customer.deposit(30000.0));
        assertEquals(expectedResult ,actualResult);

    }
    @Test
    void deposit_more_than_30000_Result_Should_Be_False(){
        boolean expectedResult = false;
        boolean actualResult = agent.checkOneTimeDeposit(customer.deposit(30000.1));
        assertEquals(expectedResult ,actualResult);
    }

}
