public class CreditPaymentService {
    public int calculate(double sumOfCredit, double percentOfCredit, double period) {
        double monthPercent = percentOfCredit / 12 / 100;

        double element = (1 + monthPercent);

        double coefficient = monthPercent * Math.pow(element, period) / (Math.pow(element, period) - 1);

        double sumOfPayment = coefficient * sumOfCredit;
        return (int) sumOfPayment;
}
}

// i = p / 12 / 100
// k = i * (1 + i) ⌃m  / ((1 + i) ⌃m - 1)           k = i * p1  / (p
// a = k * s

// a -      sumOfPayment        платеж по кредиту
// s -      sumOfCredit          сумма займа
// p -      percentOfCredit     процентная ставка
// p1-      element
// m -      period              количество месяцев
// i -      monthPercent        месячная процентная ставка
// k -      coefficient         коэффициент
