package ru;

public class Main {
    public static void main(String[] args) {
//        System.out.println("\uD83D\uDC30");
        double startMoney = 500000;
        double savedMoneyEveryMonth = 50000;
        double percentForYear = 0.19;
        for (int i = 0; i < 3; i++) {
            double capitalizationMoney = startMoney * percentForYear / 12;
            System.out.println("capitalization money = " + capitalizationMoney);
            System.out.println("free money = " + (capitalizationMoney + savedMoneyEveryMonth));
            startMoney += capitalizationMoney;
            startMoney += savedMoneyEveryMonth;
        }
        System.out.println(startMoney);
    }

}