package DesignPatterns.Singleton.Ex01;

public class main {
  public static void main(String[] args) {

    DataBaseConnection firstData = DataBaseConnection.getInstance("firstData");
    firstData.connect();
    firstData.connect();
  }
}
