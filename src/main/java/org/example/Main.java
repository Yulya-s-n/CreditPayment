package org.example;

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000;
        double percent = 9.99;
        double period = 1; //год

        double payment = service.calculate(credit, percent, period);
        System.out.println("Сумма кредита: " + credit + "Ежемесячный платеж: " + payment + "руб " + "процентная ставка " + percent + "срок кредита " + period);
    }
}