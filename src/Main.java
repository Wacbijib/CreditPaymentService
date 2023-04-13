public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int sumOfPayment = service.calculate(1_000_000, 9.99, 12);
        System.out.println("Платеж по кредиту составляет: " + sumOfPayment);

        System.out.println("Платеж по кредиту составляет: " + service.calculate(1_000_000, 9.99, 24));

        System.out.println("Платеж по кредиту составляет: " + service.calculate(1_000_000, 9.99, 36));

        System.out.println("Платеж по кредиту составляет: " + service.calculate(937_876, 10.2, 84));

    }
}