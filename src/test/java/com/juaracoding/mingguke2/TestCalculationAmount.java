package com.juaracoding.mingguke2;

import com.juaracoding.minggukedua.Account;
import com.juaracoding.minggukedua.CalculationAmount;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCalculationAmount {
    Account account;

   CalculationAmount calculationAmount;

    @BeforeMethod
    public void setUp(){
        account = new Account();
        account.name = "Jessy Dimpudus";
        account.acc_no = 18111999;
        account.amount = 500000;
        account.withdraw(5000);

    }

    @Test
    public void testCalculatewithdraw() {
        account.acc_no = 18111999;
        account.name = "Jessy Dimpudus";
        account.amount = 500000;
        account.withdraw(5000);
    }

    @Test
    public void Insert(){
        account.acc_no=1811999;
        account.name="Jessy Dimpudus";
        account.amount=50000;
        account.display();
    }
    @Test
    @Parameters("text")
    public  void testAsserttrue (String text){
        String actual ="Data berhasil disimpan";
        String expect ="Data berhasil disimpan";
        Assert.assertTrue(actual.equals(expect));
    }
}
