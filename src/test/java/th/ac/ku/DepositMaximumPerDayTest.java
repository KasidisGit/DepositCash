package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositMaximumPerDayTest {
    Agent agent = new Agent();
    Customer customer = new Customer();
    @Test
    void daily_Deposit_Less_Than_50000_Result_Should_Be_True(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkDailyDeposit(customer.deposit(20000.0));
        assertEquals(expectedResult ,actualResult);
    }
    @Test
    void daily_Deposit_Equal_to_50000_Result_Should_Be_True(){
        boolean expectedResult = true;
        customer.deposit(20000.0);
        customer.deposit(30000.0);
        boolean actualResult = agent.checkDailyDeposit(customer.getDepositCash());
        assertEquals(expectedResult ,actualResult);
    }
    @Test
    void daily_Deposit_More_Than_50000_Result_Should_Be_False(){
        boolean expectedResult = false;
        customer.deposit(30000.0);
        customer.deposit(30000.0);
        boolean actualResult = agent.checkDailyDeposit(customer.getDepositCash());
        assertEquals(expectedResult ,actualResult);
    }

}
