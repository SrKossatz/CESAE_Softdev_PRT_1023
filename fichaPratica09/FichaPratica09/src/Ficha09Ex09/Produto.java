package Ficha09Ex09;

public class Produto {
    private String nome;
    private double preco;
    private double stock = 0;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;

    }

    public void comprar(double unidades) {
        this.stock+=unidades;
    }

    public void vender(double unidades){
        if (this.stock>=unidades){
            this.stock-=unidades;
            System.out.println("A venda foi efetuada com sucesso. Stock atual: "+this.stock);
        }

//        if (this.stock<unidades){
//            System.out.println("Não temos stock suficiente: "+this.stock);
//        }

    }

    public void exibirDetalhes(){
        System.out.println("Nome: "+this.nome);
        System.out.println("preco: "+this.preco);
        System.out.println("stock: "+this.stock);
    }

}


