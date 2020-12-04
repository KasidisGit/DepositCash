package th.ac.ku;

import org.junit.jupiter.api.Test;

import java.util.TreeMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerAllowAgeTest {
    Agent agent = new Agent();
    Customer customer = new Customer();
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
}
