package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepositCashTest {
    Agent agent =new Agent();
    Customer customer =new Customer();
    @Test
    void minimum_Deposit_Less_Than_200_Result_Should_Be_True(){
        boolean expectedResult = false;
        boolean actualResult = agent.checkMinimumDeposit(customer.deposit(100.0));
        assertEquals(expectedResult ,actualResult);
    }
    @Test
    void minimum_Deposit_Equal_To_200_Result_Should_Be_True(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkMinimumDeposit(customer.deposit(200.0));
        assertEquals(expectedResult ,actualResult);

    }
    @Test
    void minimum_Deposit_More_Than_200_Result_Should_Be_False(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkMinimumDeposit(customer.deposit(200.1));
        assertEquals(expectedResult ,actualResult);
    }
}
