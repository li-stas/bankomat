package com.lista;


public class Account {
    private int nSumAcc;

    public Account(int nSumAcc) {
        this.nSumAcc = nSumAcc;
    }

    public synchronized void setnSumAcc(int nSumAcc) {
        this.nSumAcc = nSumAcc;
    }

    public  int getnSumAcc() {
        return nSumAcc;
    }

    public void minusDollar(int sum) {
        setnSumAcc(nSumAcc - sum);
    }

    public void plusDollar(int sum) {
        setnSumAcc(nSumAcc + sum);
    }

}
