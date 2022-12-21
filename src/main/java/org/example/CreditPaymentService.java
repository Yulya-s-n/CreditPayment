package org.example;

public class CreditPaymentService {
    public double calculate(double credit, double percent, double period) {
        double rate = percent/100/12;
        double loan = period * 12;
        double match = Math.pow(1  + rate, loan);
        double coef = (rate * match) / (match - 1);
        double payment = Math.round(credit * coef);


        //double payment = credit * (rate + (rate / (match-1)));
        return payment;
    }
}
