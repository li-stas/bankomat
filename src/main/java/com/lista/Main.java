package com.lista;


public class Main {

    public static void main(String[] args) {
        int start = 100;
        int end;

        Account account = new Account(start);

        Bankomat bnkT01 = new Bankomat();
        bnkT01.setAccount(account);
        bnkT01.setLSumAdd(true);
        bnkT01.setSum(1);

        Bankomat bnkT02 = new Bankomat();
        bnkT02.setAccount(account);
        bnkT02.setLSumAdd(false);
        bnkT02.setSum(1);

        bnkT01.start();
        bnkT02.start();

        try {
            bnkT01.join();
            bnkT02.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        end = account.getnSumAcc();

        System.out.println("Start value = " + start);
        System.out.println("Finish value = " + end);

    }
}
