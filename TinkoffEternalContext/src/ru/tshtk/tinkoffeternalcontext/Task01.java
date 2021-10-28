package ru.tshtk.tinkoffeternalcontext;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        int costTrafficInTariff  = scanner.nextInt();
        int volumeTrafficInTariff  = scanner.nextInt();
        int costTrafficOverTariff = scanner.nextInt();
        int volumeTraffic = scanner.nextInt();

        int cost = costTrafficInTariff;
        if(volumeTraffic>volumeTrafficInTariff) cost+= (volumeTraffic-volumeTrafficInTariff)*costTrafficOverTariff;

        //Вывод данных
        System.out.println(cost);
    }
}
