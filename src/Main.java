public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        // a - платеж по кредиту
        // s - сумма займа
        // p - процентная ставка
        // m - количество месяцев

        int a = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Платеж по кредиту составляет: " + a);

        //int a = service.calculate(1_000_000, 9.99, 24);
        //System.out.println("Платеж по кредиту составляет: " + a);

        //int a = service.calculate(1_000_000, 9.99, 36);
        //System.out.println("Платеж по кредиту составляет: " + a);
    }
}