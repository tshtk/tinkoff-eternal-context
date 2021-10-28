package ru.tshtk.tinkoffeternalcontext;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //Ввод данных
        Scanner scanner = new Scanner(System.in);
        int piecesInCutPiece = scanner.nextInt();

        int numberOfCuts  = 0;
        while(piecesInCutPiece != 1) {
            numberOfCuts += 1;
            piecesInCutPiece = piecesInCutPiece / 2 + piecesInCutPiece % 2;
        }
        //Вывод данных
        System.out.println(numberOfCuts);
    }
}
