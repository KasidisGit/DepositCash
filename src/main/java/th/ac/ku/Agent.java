package th.ac.ku;

import java.util.Map;
import java.util.TreeMap;

public class Agent {

    protected int allowPerTimeDepositCash = 30000;
    protected int allowPerDayDepositCash = 50000;
    protected int minAge =15;
    protected int maxAge =20;
    protected int fare =0;
    protected int minDeposit=200;
    private int[] bankAccountIds={11111,22222};
    public double amountDepositedCash;

    Map<Boolean,Integer> response = new TreeMap<>();


    public boolean checkOneTimeDeposit(double cash) {
        return cash <= allowPerTimeDepositCash;
    }

    public boolean checkDailyDeposit(double cash){
        amountDepositedCash += cash;
        return allowPerDayDepositCash >= amountDepositedCash;
    }

    public TreeMap<Boolean, Integer> checkCustomerAge(double age) {
        if (maxAge < age){
            fare = 20;
        }
        response.put(minAge<=age,fare);
        return (TreeMap<Boolean, Integer>) response;
    }

    public boolean checkValidAccount(BankAccount bankAccount){
        for (int bankAccountId : bankAccountIds) {
            if (bankAccountId == bankAccount.getId() && bankAccount.getStatus().equals("Valid")) {
                return true;
            }
        }
        return false;
    }

    public boolean checkMinimumDeposit(double cash){
        return cash>=minDeposit;
    }
}
