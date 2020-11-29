package th.ac.ku;

public class Customer {

    private double age;
    private double depositCash;

    public Double getAge() {
        return age;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public Double getDepositCash() {
        return depositCash;
    }

    public Double deposit(Double cash) {
        this.depositCash += cash;
        return cash;
    }

}
