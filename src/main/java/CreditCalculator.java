public class CreditCalculator {
    public int payMonth(int sum, double percent, int period) {
        double monthRate = (percent / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) (sum*annuityRate);
    }

    public int allReturn(int sum, double percent, int period) {
        double monthRate = (percent / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) ((sum*annuityRate) * period);
    }

    public int overPay(int sum, double percent, int period) {
        double monthRate = (percent / 12) / 100;
        double annuityRate = monthRate*(Math.pow(1+monthRate, period))/((Math.pow(1+monthRate, period))-1);
        return (int) ((sum*annuityRate)*period - sum);
    }

    public static void main(String[] args) {
        int sum = 10_000_000;
        double percent = 8.5;
        int period = 240;

        CreditCalculator calculator = new CreditCalculator();

        System.out.println("Ежемесячный платеж: " + calculator.payMonth(sum,percent, period));
        System.out.println("Общая сумма: " + calculator.allReturn(sum, percent, period));
        System.out.println("Переплата: " + calculator.overPay(sum, percent, period));
    }
}
