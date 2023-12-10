package FichaPratica14Ex03;

import java.util.ArrayList;
import java.util.Scanner;

public class Curso {
  private String nome;
  private ArrayList<DisciplinaCurso> disciplinaCursos;

  //false para curta duração (máximo de 100 horas, inclusive) ou true para longa duração
  //(mínimo de 101 horas
  private boolean longaDuracao;

  public Curso(String nome) {
    this.nome = nome;
    this.disciplinaCursos= new ArrayList<DisciplinaCurso>( );

  }




}
