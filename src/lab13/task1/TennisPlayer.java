package lab13.task1;

import java.util.ArrayList;

public class TennisPlayer {//если в задании есть какой-то объект, то создаем для него отдельный класс с конструктором и гетерами
    private String country;
    private String player;
    private int age;
    private String points;
    private String tournPlayed;
    private String rank;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlayer() {
        return player;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getTournPlayed() {
        return tournPlayed;
    }

    @Override
    public String toString() {
        return "TennisPlayer{" +
                "country='" + country + '\'' +
                ", player='" + player + '\'' +
                ", age='" + age + '\'' +
                ", points='" + points + '\'' +
                ", tournPlayed='" + tournPlayed + '\'' +
                ", rank='" + rank + '\'' +
                '}';
    }

    public void setTournPlayed(String tournPlayed) {
        this.tournPlayed = tournPlayed;
    }

    public TennisPlayer() {
    }

    public TennisPlayer(String country, String player, int age, String points, String tournPlayed, String rank) {
        this.country = country;
        this.player = player;
        this.age = age;
        this.points = points;
        this.tournPlayed = tournPlayed;
        this.rank = rank;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPlayer(String player) {
        this.player = player;
    }
}
