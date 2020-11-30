package th.ac.ku;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DepositCashTest {

    Agent agent = new Agent();
    Customer customer = new Customer();

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
    @Test
    void age_Less_Than_15_Result_Should_Be_False(){
        boolean expectedResult = false;
        customer.setAge(12.0);
        TreeMap<Boolean, Integer> actualResult = agent.checkCustomerAge(customer.getAge());
        assertEquals(expectedResult ,actualResult.firstKey());
    }
    @Test
    void age_Equal_To_15_Result_Should_Be_True(){
        boolean expectedResult = true;
        int expectedFare = 0;
        customer.setAge(15.0);
        TreeMap<Boolean, Integer> actualResult = agent.checkCustomerAge(customer.getAge());
        assertEquals(expectedResult ,actualResult.firstKey());
        assertEquals(expectedFare ,actualResult.get(actualResult.firstKey()));
    }
    @Test
    void age_More_Than_15_Result_Should_Be_True(){
        boolean expectedResult = true;
        int expectedFare = 0;
        customer.setAge(17.0);
        TreeMap<Boolean, Integer> actualResult = agent.checkCustomerAge(customer.getAge());
        assertEquals(expectedResult ,actualResult.firstKey());
        assertEquals(expectedFare ,actualResult.get(actualResult.firstKey()));
    }
    @Test
    void age_Equal_To_20_Result_Should_Be_True(){
        boolean expectedResult = true;
        int expectedFare = 0;
        customer.setAge(20.0);
        TreeMap<Boolean, Integer> actualResult = agent.checkCustomerAge(customer.getAge());
        assertEquals(expectedResult ,actualResult.firstKey());
        assertEquals(expectedFare ,actualResult.get(actualResult.firstKey()));
    }
    @Test
    void age_More_Than_20_Result_Should_Be_True(){
        boolean expectedResult = true;
        int expectedFare = 20;
        customer.setAge(22.0);
        TreeMap<Boolean, Integer> actualResult = agent.checkCustomerAge(customer.getAge());
        assertEquals(expectedResult ,actualResult.firstKey());
        assertEquals(expectedFare ,actualResult.get(actualResult.firstKey()));
    }
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
