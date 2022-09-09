public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        byte bird = 44;
        System.out.println("Значение переменной bird с типом byte равно " + bird + ".");
        short h = -32700;
        System.out.println("Значение переменной h с типом short равно " + h + ".");
        int carPrice = 6754320;
        System.out.println("Значение переменной carPrice с типом int равно " + carPrice + ".");
        long caterpillar = 30657L;
        System.out.println("Значение переменной caterpillar с типом long равно " + caterpillar + ".");
        float a_1 = 4.08003f;
        System.out.println("Значение переменной a_1 с типом float равно " + a_1 + ".");
        double orangesWeight = 5.56830801;
        System.out.println("Значение переменной orangesWeight с типом double равно " + orangesWeight + ".");

        // Задача 2
        System.out.println("Задача 2");
        double box = 27.12;
        System.out.println(box);
        long house = 987678965549L;
        System.out.println(house);
        float plane = 2.786f;
        System.out.println(plane);
        boolean liar = 20 <= 10;
        System.out.println(liar);
        int bag = 569;
        System.out.println(bag);
        short tableCloth = -159;
        System.out.println(tableCloth);
        short s = 27897;
        System.out.println(s);
        byte horse = 67;
        System.out.println(horse);

        // Задача 3
        System.out.println("Задача 3");
        byte lyudmilaP = 23;
        byte annaS = 27;
        byte ekaterinaA = 30;
        int allStudents = lyudmilaP + annaS + ekaterinaA;
        short totalPaper = 480;
        System.out.println("На каждого ученика рассчитано " + totalPaper / allStudents + " листов бумаги.");

        // Задача 4
        System.out.println("Задача 4");
        byte bottles = 16;
        byte minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        minutes = 20;
        System.out.println("За 20 минут машина произвела " + bottlesPerMinute * minutes + " бутылок.");
        int bottlesPerDay = bottlesPerMinute * 24 * 60;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " бутылок.");
        System.out.println("За 3 дня машина произвела " + bottlesPerDay * 3 + " бутылок.");
        System.out.println("За месяц машина произвела " + bottlesPerDay * 30 + " бутылок.");

        // Задача 5
        System.out.println("Задача 5");
        short totalPaintCans = 120;
        short white1Class = 2;
        short brown1Class = 4;
        int paintCans1Class = white1Class + brown1Class;
        int numberOfClasses = totalPaintCans / paintCans1Class;
        int brown = brown1Class * numberOfClasses;
        int white = white1Class * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + white + " банок белой краски и " + brown + " банок коричневой краски.");

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        int banana1Weight = 80;
        int milk = 2;
        int milk1Weight = 105;
        int iceCream = 2;
        int iceCream1Weight = 100;
        int eggs = 4;
        int egg1Weight = 70;
        int breakfastWeight = (bananas * banana1Weight) + (milk * milk1Weight) + (iceCream * iceCream1Weight) + (eggs * egg1Weight);
        float breakfastWeightInKilos = breakfastWeight / 1000f;
        System.out.println("Вес завтрака составляет " + breakfastWeightInKilos + " кг.");

        // Задача 7
        System.out.println("Задача 7");
        short totalLostWeight = 7 * 1000;
        System.out.println("Если спортсмен будет каждый день терять по 250 грамм веса, то на похудение понадобится " + totalLostWeight / 250 + " дней.");
        System.out.println("Если спортсмен будет каждый день терять по 500 грамм веса, то на похудение понадобится " + totalLostWeight / 500 + " дней.");
        int averageNumberOfDays = (totalLostWeight / 250 + totalLostWeight / 500) / 2;
        System.out.println("В среднем для похудения понадобится " + averageNumberOfDays + " день.");

        // Задача 8
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int mashaYear = masha * 12;
        int denisYear = denis * 12;
        int kristinaYear = kristina * 12;
        float mashaNew = masha * 1.1f;
        float denisNew = denis * 1.1f;
        float kristinaNew = kristina * 1.1f;
        float mashaYearNew = mashaNew * 12;
        float denisYearNew = denisNew * 12;
        float kristinaYearNew = kristinaNew * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей в месяц. Годовой доход вырос на " + (mashaYearNew - mashaYear) + " рублей.");
        System.out.println("Денис теперь получает " + denisNew + " рублей в месяц. Годовой доход вырос на " + (denisYearNew - denisYear) + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNew + " рублей в месяц. Годовой доход вырос на " + (kristinaYearNew - kristinaYear) + " рублей.");

    }
}