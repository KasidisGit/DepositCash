package th.ac.ku;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepositValidAccountTest {
    Agent agent =new Agent();
    @Test
    void valid_Account_Result_Should_Be_True(){
        boolean expectedResult = true;
        boolean actualResult = agent.checkValidAccount(new BankAccount(11111,"Valid"));
        assertEquals(expectedResult , actualResult);
    }
    @Test
    void invalid_Account_Result_Should_Be_True(){
        boolean expectedResult = false;
        boolean actualResult = agent.checkValidAccount(new BankAccount(22222,"Invalid"));
        assertEquals(expectedResult , actualResult);
    }
}
