package RPG.Itens;

import java.util.ArrayList;

public class Itens {
  private String tipo;
  private String nome;
  private int preco;
  private ArrayList <String> heroisPermitidos;
  private int ataque;
  private int ataqueEspecial;
  private int ataqueInstantaneo;
  private int vida;
  private int forca;

  public Itens(String tipo, String nome, int preco, int ataque, int ataqueEspecial, int ataqueInstantaneo, int vida, int forca) {
    this.tipo = tipo;
    this.nome = nome;
    this.preco = preco;
    this.ataque = ataque;
    this.ataqueEspecial = ataqueEspecial;
    this.ataqueInstantaneo = ataqueInstantaneo;
    this.vida = vida;
    this.forca = forca;
    this.heroisPermitidos=new ArrayList<>();

  }

  public String getTipo() {
    return tipo;
  }

  public String getNome() {
    return nome;
  }

  public int getPreco() {
    return preco;
  }

  public ArrayList<String> getHeroisPermitidos() {
    return heroisPermitidos;
  }

  public int getAtaque() {
    return ataque;
  }

  public int getAtaqueEspecial() {
    return ataqueEspecial;
  }

  public int getAtaqueInstantaneo() {
    return ataqueInstantaneo;
  }

  public int getVida() {
    return vida;
  }

  public int getForca() {
    return forca;
  }

  public void adicionarHeroi(String heroi){
    heroisPermitidos.add(heroi);

  }
}
