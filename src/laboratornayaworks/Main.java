package laboratornayaworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<IceCream> icecreams = new ArrayList<>();
        List<Tea> teas = new ArrayList<>();
        List<Lemonade> lemonades = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        boolean continueAdding = true;

        while (continueAdding) {
            System.out.println("Добавить мороженное? (Да/Нет)");
            String response = in.nextLine();

            if (response.equalsIgnoreCase("Да")) {
                IceCream icecreamses = new IceCream();
                icecreams.add(icecreamses);
                System.out.println("Мороженное добавлено.");
            } else {
                System.out.println("Добавить ещё один продукт? (Чай/Лимонад/Нет)");
                String foodResponse = in.nextLine();

                if (foodResponse.equalsIgnoreCase("Чай")) {
                    teas.add(new Tea());
                    System.out.println("Чай добавлен.");
                } else if (foodResponse.equalsIgnoreCase("Лимонад")) {
                    System.out.println("Введите желаемый размер лимонада:");
                    String size = in.nextLine();
                    lemonades.add(new Lemonade());
                    System.out.println("Лимонад добавлен.");
                } else {
                    continueAdding = false;
                }
            }
        }

        // Сортировка мороженных по калорийности
        Collections.sort(icecreams, new IceCreamComparator());

        // Вывод общей калорийности мороженных
        int totalCalories = icecreams.stream().mapToInt(laboratornayaworks.IceCream::CalculateCalories).sum();
        System.out.println("Общая калорийность мороженных: " + totalCalories);

        // Подсчет количества продуктов каждого типа
        int iceCreamCount = icecreams.size();
        int teaCount = teas.size();
        int lemonadeCount = lemonades.size();

        System.out.println("Количество мороженого: " + iceCreamCount);
        System.out.println("Количество чая: " + teaCount);
        System.out.println("Количество лимонада: " + lemonadeCount);

        // Употребление продуктов
        for (IceCream iceCream : icecreams) {
            System.out.println(iceCream.getSyrup() + " мороженное съедено.");
        }
        for (Tea tea : teas) {
            tea.consume();
        }
        for (Lemonade lemonade : lemonades) {
            lemonade.consume();
        }

        System.out.println("Всего хорошего! :)");
    }
}
