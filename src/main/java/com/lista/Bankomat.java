package com.lista;


public class Bankomat extends Thread {

    private Account account;
    private int sumAdd;
    private boolean lSumAdd;


//    @Override
//    public void start(){
//        for( int i = 0; i < 100; i++) {
//            run();
//            //System.out.println(account.getValue());
//        }
//    }

    @Override
    public void run( ) {

        if (lSumAdd) {

            // добавляеся 100 единиц с паузой 150
            for (int i = 0; i < 100; i++) {

                account.plusDollar(sumAdd);

                System.out.println("++++ " + account.getnSumAcc());
                try {
                    sleep(150);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } else {
            // снимается 110 единиц с паузой 5
            for (int i = 0; i < 110; i++) {
                // цикл паузы, остатка <= 0
                while (account.getnSumAcc() - sumAdd <= 0) {
                    try {
                        sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("---- SSS");
                }
                // снятие единиц
                account.minusDollar(sumAdd);
                System.out.println("---- " + account.getnSumAcc());
                try {
                    sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public Account getAccount( ) {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public boolean isLSumAdd( ) {
        return lSumAdd;
    }

    public void setLSumAdd(boolean lsumAdd) {
        this.lSumAdd = lsumAdd;
    }

    public int getSumAdd( ) {
        return sumAdd;
    }

    public void setSum(int sumAdd) {
        this.sumAdd = sumAdd;
    }
}
