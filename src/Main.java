public class Main {
    public static void main(String[] args) {
        int deposit = 15_000;
        int total = 0;
        int monthSave = 0;
        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            monthSave = monthSave + 1;
            System.out.println("Месяц " + monthSave + ", сумма накоплений равна " + total + " рублей.");
        }
        // Строка цыфр
        int num = 0;
        while (num < 10) {
            num = num + 1;
            System.out.print(num + " ");
        }
        System.out.println(" ");
        for (int num1 = 10; num1 > 0; num1--) {
            System.out.print(num1 + " ");
        }
        System.out.println(" ");
        // Демографическая задача
        int populationY = 12_000_000;
        int years = 0;
        int born = 17;
        int dead = 8;
        while (years < 10) {
            populationY = populationY + born * (populationY / 1000) - dead * (populationY / 1000);
            years = years + 1;
            System.out.println("Год " + years + ", численность населения составляет " + populationY);
        }
        // Накопления Василия
        // # 1
        int diposit1 = 15000;
        int numberMonth = 0;
        while (diposit1 < 12_000_000) {
            diposit1 = diposit1 + (diposit1 / 100 * 7);
            numberMonth = numberMonth + 1;
            System.out.println(numberMonth + " месяц сумма накоплений " + diposit1);
        }
        // # 2
        int diposit2 = 15_000;
        int month = 0;
        while (diposit2 < 12_000_000) {
            diposit2 = diposit2 + (diposit2 / 100 * 7);
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println(month + " месяц сумма накоплений " + diposit2);
            }
        }
        // # 3
        int diposit3 = 15_000;
        int monthNumber = 0;
        while (monthNumber < 108) {
            diposit3 = diposit3 + (diposit3 / 100 * 7);
            monthNumber = monthNumber + 1;
            if (monthNumber % 6 == 0) {
                System.out.println(monthNumber + " месяц сумма накоплений " + diposit3);
            }
        }
        // Отчеты по пятницам
        int friday = 2;
        {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        while (friday < 24) {
            friday = friday + 7;
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
        }
        // Кометы

        int yearPast = 2022 - 200;
        int yearFuture = 2022 + 100;
        int year = 0;
        while (year <= yearFuture) {
            year += 79;
            if (year >= yearPast && year <= yearFuture) {
                System.out.println(year);
                }
            }
        // Таблица умножения
        for (int multiplicand = 1; multiplicand <= 10; multiplicand++) {
        int produkt = multiplicand * 2;
            System.out.println("2 * " + multiplicand + " = " + produkt);
        }
    }
}