package Singleton.Ex01;

public class DataBaseConnection {
    private static DataBaseConnection instance;
    private String connectionString;
    private DataBaseConnection(String connectionString) {
      this.connectionString = connectionString;
    }
    public static synchronized DataBaseConnection getInstance(String connectionString) {
      if (instance == null) {
        instance = new DataBaseConnection(connectionString);
      }
      return instance;
    }


    public void connect() {
      // Código para conectar à base de dados usando a connectionString
      System.out.println("Conectado à base de dados: " + connectionString);
    }
    public void disconnect() {
      // Código para desconectar da base de dados
      System.out.println("Desconectado da base de dados: " + connectionString);
    }
    // Outros métodos da classe

}
