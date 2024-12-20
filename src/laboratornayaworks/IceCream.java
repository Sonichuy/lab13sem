package laboratornayaworks;

import laboratornayaworks.Syrup.*;
import java.util.Scanner;

public class IceCream implements Nutritions {
    private syrup syrup;
    static int count = 0;

    public IceCream(){
        Scanner in = new Scanner(System.in);

        System.out.println("Выберите сироп для Вашего мороженного, пожалуйста! :)");
        System.out.println("Для выбора сиропа нажмите цифру напротив предпочитаемого наполнения.");
        System.out.println("1. Карамельный сироп");
        System.out.println("2. Шоколадный сироп");

        while(true) {
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    syrup = new Caramel();
                    break;
                case 2:
                    syrup = new Chocolate();
                    break;
                default:
                    System.out.println("Выберите, пожалуйста, цифру из числа указанный выше. :(");
            }
            if(choice < 3 && choice > 0)            {
                break;            }
        }
    }

    public void setSyrup()
    {
        Scanner in = new Scanner(System.in);

        int choice = in.nextInt();
        System.out.println("Выберите сироп для Вашего мороженного, пожалуйста! :)");
        System.out.println("Для выбора сиропа нажмите цифру напротив предпочитаемого наполнения.");
        System.out.println("1. Карамельный сироп");
        System.out.println("2. Шоколадный сироп");

        switch(choice)
        {
            case 1:
                syrup = new Caramel();
                break;
            case 2:
                syrup = new Chocolate();
                break;
            default:
                System.out.println("Неверные параметры ввода. :(");
                break;

        }

    }

    public String getSyrup() {
        return syrup.public_name;
    }

    @Override
    public int CalculateCalories() {
        return syrup.calories;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        IceCream icecream = (IceCream) obj;
        return syrup.equals(icecream.syrup);
    }

}