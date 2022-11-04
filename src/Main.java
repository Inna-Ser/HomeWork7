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
        // Демографическая задача
        int populationY = 12_000_000;
        int years = 0;
        int born = 17;
        int dead = 8;
        while (years < 10) {
            populationY = populationY + born*(populationY/1000) - dead*(populationY/1000);
            years = years + 1;
            System.out.println("Год " + years + ", численность населения составляет " + populationY);
        }
        // Накопления Василия
        // # 1
        int diposit1 = 15000;
        int b  = 0;
        while (diposit1 < 12_000_000) {
            diposit1 = diposit1 + (diposit1 / 100 * 7);
            b = b + 1;
            System.out.println(b + " месяц сумма накоплений " + diposit1);
        }
        // # 2
        int diposit2 = 15_000;
        int month  = 0;
        while (diposit2 < 12_000_000) {
            diposit2 = diposit2 + (diposit2/100*7);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println (month + " месяц сумма накоплений " + diposit2);
            }
        }
        // # 3
        int diposit3 = 15_000;
        int d  = 0;
        while (d < 108) {
            diposit3 = diposit3 + (diposit3 / 100 * 7);
            d = d + 1;
            if (d % 6 == 0) {
                System.out.println(d + " месяц сумма накоплений " + diposit3);
            }
        }
        // Отчеты по пятницам
        int friday = 2; {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        while (friday < 24) {
            friday = friday + 7;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
    }
}
