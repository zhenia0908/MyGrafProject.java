package lab13.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class TennisTester {
   public static ArrayList<TennisPlayer> players = new ArrayList<>();

    //т.к. мф работаем с теннисистами, то лучше брать не строку, а объект
    public void makingArrayListOfTennisPlayers() throws Exception {
        try (BufferedReader br = new BufferedReader(new FileReader("src/lab13/task1/file"))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                //создаем объект в цикле!!!
                TennisPlayer player = new TennisPlayer();
                String[] res = line.split("\\s+");
                player.setRank(res[0]);
                player.setCountry(res[1]);
                player.setPlayer(res[2] + " " + res[3]);
                player.setAge(Integer.parseInt(res[4]));
                player.setPoints(res[5]);
                player.setTournPlayed(res[6]);
                players.add(player);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showPlayers() {
        System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n", "Rank", "Country", "Player", "Age", "Points", "Tourn played"));
        for (int i = 0; i < players.size(); i++) {
            System.out.println(String.format("%-20s%-20s%-20s%-20s%-20s%-20s%n", players.get(i).getRank(), players.get(i).getCountry(), players.get(i).getPlayer(), players.get(i).getAge(), players.get(i).getPoints(), players.get(i).getTournPlayed()));
        }
    }

    public ArrayList<TennisPlayer> listOfPlayersFromCountry(String country) {
        int howManyPlayersFromCountry = 0;
        ArrayList<TennisPlayer> listOfPlayersFromCountry = new ArrayList<>();
        for (int i = 0; i < players.size(); i++) {
            if (players.get(i).getCountry().equals(country)) {
                howManyPlayersFromCountry++;
                listOfPlayersFromCountry.add(players.get(i));
            }
        }
        System.out.println("From " + country + " people " + howManyPlayersFromCountry);
        return listOfPlayersFromCountry;
    }

    public String returnRank(TennisPlayer player) {
        System.out.println("Rank of the player " + player.getPlayer() + " " + player.getRank());
        return player.getRank();
    }

    public double  middleAge() {
        double middleAge = 0;
        for (int i = 0; i < 10; i++) {
           middleAge += (players.get(i).getAge());
        }
        middleAge = middleAge/10;
        System.out.println("Middle age is "+ middleAge);
        return middleAge;
    }
    public void writeToFilePlayersFromCountry(String country)throws  Exception{
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("src/lab13/task1/file2"))){
          bw.write(String.format("%-20s%-20s%-20s%n","Lp", "Kraj", "Liczba"));
          for(int i = 0; i<players.size();i++) {
              if (players.get(i).getCountry().equals(country)) {
                  bw.write(String.format("%-20s%-20s%-20s%n", i + 1, players.get(i).getCountry(), players.get(i).getPoints()));
              }
          }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {
        TennisTester tester = new TennisTester();
        tester.makingArrayListOfTennisPlayers();
        tester.showPlayers();
        tester.listOfPlayersFromCountry("BEL");
        tester.returnRank(players.get(2));//public static должен быть!!!
        tester.middleAge();
        tester.writeToFilePlayersFromCountry("GER");
    }
}
