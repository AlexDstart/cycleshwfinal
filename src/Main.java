public class Main {
    public static void main(String[] args) {
        System.out.println(" Задание 1 ");
        int contribution = 15000;
        int total = 0;
        int i =0;
        while ( total <= 2_459_000) {
            i++;
            total=total+contribution;

            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println(" Задание 2 ");
        int a=0;
        while(a<10){
            a++;
            System.out.print(a+ "  ");
        }
        System.out.println(" обратный порядок ");

        for (; a >=1 ; a--) {
            System.out.print(a + "  ");
            
        }

    }
}
