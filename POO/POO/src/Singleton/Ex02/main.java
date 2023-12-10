package Singleton.Ex02;

import java.io.IOException;

public class main {
  public static void main(String[] args) throws IOException {
//    Logger log1 = new Logger("POO/src/Singleton/Ficheiros.txt");
//
//    log1.log("oi");
//
      Logger log1 = Logger.getInstance("POO/src/Singleton/Ficheiros.txt");
      log1.log("agora vai");
      log1.log("agora vai outra vez");


  }
}
