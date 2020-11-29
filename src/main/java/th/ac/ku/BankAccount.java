package th.ac.ku;

import java.util.Map;
import java.util.TreeMap;

public class BankAccount {

    private int id;
    private String status;

    public BankAccount(int id, String status){
        this.id = id;
        this.status = status;

    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }


}
