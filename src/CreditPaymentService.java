public class CreditPaymentService {
    public int calculate(double s, double p, double m) {
        double i = p / 12 / 100;
        double p1 = (1 + i);

        double k = i * Math.pow(p1, m) / (Math.pow(p1, m) - 1);

        double a = k * s;
        return (int) a;
}
}

// месячная процентная ставка         i = p / 12 / 100
// коэффициент                        K = i * p1 / (p1 - 1)
// ежемесячная платеж                 A = K * S

// a - сумма платежа
// k - коэффициент аннуитета
// s - сумма займа

// p - процентная ставка
// i - месячная процентная ставка
// m - количество месяцев