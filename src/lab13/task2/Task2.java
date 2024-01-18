package lab13.task2;

import java.util.HashMap;
import java.util.Scanner;

public class Task2 {
    /*Напишите программу, в которой метод будет возвращать количество очков за заданное слово — точно так же, как в популярной игре.
Эрудит. С помощью клавиатуры загрузите заданное слово (строчные и прописные буквы), а затем подсчитайте сумму баллов за
отдельные буквы. Программа должна работать в цикле до тех пор, пока не будет загружено "end". После загрузки слова
отображается количество баллов за данное слово. Наконец, он отображает общее количество заработанных очков и
слова и набранные баллы, в двух столбцах по убыванию количества баллов
 toLowerCase()
*/
    public static HashMap<String, Integer> symbolCost = new HashMap<>();

    public void initialise() {
        symbolCost.put("A", 1);
        symbolCost.put("E", 1);
        symbolCost.put("I", 1);
        symbolCost.put("N", 1);
        symbolCost.put("O", 1);
        symbolCost.put("R", 1);
        symbolCost.put("S", 1);
        symbolCost.put("W", 1);
        symbolCost.put("Z", 1);
        symbolCost.put("C", 2);
        symbolCost.put("D", 2);
        symbolCost.put("K", 2);
        symbolCost.put("L", 1);
        symbolCost.put("M", 2);
        symbolCost.put("P", 2);
        symbolCost.put("T", 2);
        symbolCost.put("Y", 2);
        symbolCost.put("B", 3);
        symbolCost.put("G", 3);
        symbolCost.put("H", 3);
        symbolCost.put("J", 3);
        symbolCost.put("U", 3);
        symbolCost.put("Ł", 3);
        symbolCost.put("Ą", 5);
        symbolCost.put("Ę", 5);
        symbolCost.put("F", 5);
        symbolCost.put("Ó", 5);
        symbolCost.put("Ś", 5);
        symbolCost.put("Ż", 5);
        symbolCost.put("Ć", 6);
        symbolCost.put("Ń", 7);
        symbolCost.put("V", 9);
    }
/*1.  Разбили на символы, потом проходимся по массиву полученному из символов,
для каждого элемента смотрим его балл, увеличиваем переменную vallue(ее создаем в цикле фор),
которая отражает количество баллов за слово на полученное значение
2. Когда все буквы посчитали, выводим о том сколько баллов за слово(value), добавляем в мап это слово
и количество баллов за него, увеличиваем totalValue*/

    public static void main(String[] args) {
        Task2 tester = new Task2();
        tester.initialise();
        int totalValue = 0;
        HashMap<String, Integer> word = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        while (line != "end") {
          line =   line.toUpperCase();
            char[] symbols = line.toCharArray();
            int value = 0;
            for (int i = 0; i < symbols.length; i++) {
               int  value1 = symbolCost.get(symbols[i]);
                word.put(line, value);
            }
            totalValue += value;
            value = 0;
        }
        System.out.println("Sum of balls " + totalValue);
    }
}
