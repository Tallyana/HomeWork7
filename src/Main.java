public class Main {
    public static void main(String[] args) {
        System.out.println("HomeWork7 ");
        System.out.println("Задание1 ");
        int zarplata1 = 29000;
        int total1 = 0;
        int i = 0;
        for (; i < 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + zarplata1;
            System.out.println("Месяц " + zarplata1 + ". Cумма накоплений равна " + total1 + "  рублей");
            System.out.println(total1);
        }
        {
            System.out.println("Задание1.1 ");
//С помощью цикла while посчитайте, сколько месяцев потребуется,
// чтобы накопить 2 459 000 рублей при условии, что первоначально мы имеем 0 рублей
// и готовы откладывать по 15 тысяч рублей.
//Результат программы должен быть выведен в консоль в формате "Месяц … ,
// сумма накоплений равна … рублей" с тем количеством месяцев,
// необходимым для накопления данной суммы.
            int monthNum = 1;
            int sum = 0;
            while (sum < 2_459_000) {
                sum += 15000;
                System.out.printf("Месяц %d. Cумма накоплений равна %d\n", monthNum, sum);
                monthNum++;
            }

            System.out.println("Задание2 ");
            {
                int num = 1;
                while (num <= 10) {
                    if (num == 10) {
                        System.out.print(num);
                        break;
                    }
                    System.out.print(num + "... ");
                    num++;
                }
                for (; num > 0; num--) {
                    if (num == 1) {
                        System.out.println(num + ".. ");
                        break;
                    }
                    System.out.print(num + " __ ");
                }
                System.out.println("Задача3.  ");

                //В стране Y население равно 12 миллионам человек.
                //За год рождаемость составляет 17 человек на 1000 человек,
                // смертность - 8 человек. Рассчитайте, какая численность населения будет через 10 лет,
                // принимая во внимание, что показатели рождаемости и смертности постоянны.
                //В консоль выведите результат операции на каждый год в формате
                //"Год …, численность населения составляет … "
                int naselenie = 12_000_000 ;
                int pribyl = 17*naselenie/1000 ;
                int ubyl = 8*naselenie/1000;
                for(int ii=1;ii<= 10;ii++){
                    naselenie+=pribyl;
                    naselenie -= ubyl;
                    System.out.printf("Год %d.Численность %d\n",ii,naselenie);
                }
            }
        }
    }
}

