package lab13.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class Task1 {
    /*Напишите программу для обработки списка теннисистов. Внедрить, среди прочего: следующие методы:
а) метод, который загружает в ArrayList текстовый файл, содержащий список первых 50 теннисистов по
рейтинг АТП,
б) метод, отображающий загруженный список
в) метод, отображающий теннисистов из заданной страны и возвращающий их количество
г) метод, возвращающий номер позиции в рейтинге указанного теннисиста,
д) метод, возвращающий средний возраст теннисистов, входящих в первую десятку,
е) метод, сохраняющий количество теннисистов из определенных стран в новый файл, в формате:
 № Номер страны
 х гггг 99*/
    ArrayList<String> words = new ArrayList<>();
    String country;
    String player;
    String age;
    String points;
    String tournPlayed;
    String rank;

    public void fileMaker() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/lab13/task1/file"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("src/lab13/task1/file2"))) {
            String line;
            br.readLine();
            System.out.println(String.format("%-10s%-10s%-20s%-10s%-20s%-20s%n", "Rank", "Country", "Player", "Age", "Points", "Tourn played"));
            while ((line = br.readLine()) != null) {
                String[] res = line.split("\\s+");
                for (int i = 0; i < res.length; i++) {
                    words.add(res[i]);

                    rank = res[0];
                    country = res[1];
                    player = res[2];
                    age = res[3];
                    points = res[4];
                    tournPlayed = res[5];
                    bw.write(String.format("%-10s%-10s%-20s%-10s%-20s%-20s%n", "Rank", "Country", "Player", "Age", "Points", "Tourn played"));
                    bw.write(String.format("%-10s%-10s%-20s%-10s%-20s%-20s", rank, country, player, age, points, tournPlayed));

                }

                System.out.println(String.format("%-10s%-10s%-20s%-10s%-20s%-20s%n", rank, country, player, age, points, tournPlayed));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void returnCountry(String c) {
        int howManyPlayersFromCountry = 0;
        for (int i = 0; i < words.size(); i++) {
            if (c.equals(words.get(i))) {
                howManyPlayersFromCountry++;
            }
        }
        System.out.println("Ile players z tego kraju: " + howManyPlayersFromCountry);
    }

    public void rejtingOfPlayer(String p) {
        for (int i = 0; i < words.size(); i++) {
            if (words.get(i).equals(p)) {

            }
        }
    }

    public static void main(String[] args) throws Exception {
        Task1 tester = new Task1();
        tester.fileMaker();
        tester.returnCountry("SRB");

    }
}