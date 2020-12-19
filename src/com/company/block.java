package com.company;
import java.lang.reflect.Array;
import java.util.Arrays;


public class block {
    private String[] transaction;
    private int prehascode;
    private int currhascode;



    public String[] getTransaction() {
        return transaction;
    }

    public int getCurrhascode() {
        return currhascode;
    }
    public block(int prehascode ,String[] transaction){
        this.transaction=transaction;
        this.prehascode=prehascode;

        Object[] contens={prehascode,Arrays.hashCode(transaction)};
        currhascode=Arrays.hashCode(contens);



    }
}
