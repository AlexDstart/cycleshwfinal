public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2_459_000) {
            i++;
            total = total + contribution;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(" Задание 2 ");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + "  ");
        }
        System.out.println(" обратный порядок ");

        for (; a >= 1; a--) {
            System.out.print(a + "  ");

        }
        System.out.println("");
        //Задание 3
        System.out.println(" Задание 3 ");
        int population = 12_000_000;
        int birthPopulation = population / 1000 * 17;
        int deathPopulation = population / 1000 * 8;
        int year = 2022;
        for (int j = 1; j <= 10; j++) {
            year++;
            population = population + birthPopulation - deathPopulation;
            System.out.println(" Год " + year + " Численность населения состовляет " + population);

        }
        int contribution2 = 15000;
        int total2 = 0;
        while (contribution2 <= 12_000_000) {
            total2++;
            contribution2 = contribution2 + contribution2 * 7 / 100;
                System.out.println(" месяц " + total2 + " сумма накоплений " + contribution2 + " рублей ");
            }
        }

    }


