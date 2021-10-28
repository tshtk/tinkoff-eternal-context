package ru.tshtk.tinkoffeternalcontext;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int numberOfCuts  = 0;
        for(int piecesInCutPiece  = n; piecesInCutPiece != 1; piecesInCutPiece = piecesInCutPiece / 2 + piecesInCutPiece % 2)
            numberOfCuts++;

        //Вывод данных
        System.out.println(numberOfCuts);
    }
}
