public class Main {
    public static void main(String[] args) {
        int deposit = 15_000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            i = i + 1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }
        // Строка цыфр
        int x = 0;
        while (x < 10) {
            x = x + 1;
            System.out.print(x + " ");
        }
        System.out.println(" ");
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println(" ");
        // Деммографическая задача
        int populationY = 12_000_000;
        int years = 0;
        int born = 17;
        int dead = 8;
        while (years < 10) {
            populationY = populationY + born*(populationY/1000) - dead*(populationY/1000);
            years = years + 1;
            System.out.println("Год " + years + ", численность населения составляет " + populationY);
        }
    }
}
