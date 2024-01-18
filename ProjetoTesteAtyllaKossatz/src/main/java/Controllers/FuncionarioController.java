package Controllers;

import Domain.Venda;
import Repository.VendasRepository;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FuncionarioController {
    private ArrayList<Venda> todasVendas;

    public FuncionarioController() throws FileNotFoundException {
        VendasRepository repository = new VendasRepository("C:\\Users\\atyll\\DEV\\CESAE_Softdev_PRT_1023\\ProjetoTesteAtyllaKossatz\\src\\main\\resources\\minimercado.csv");
        this.todasVendas = repository.getVendaArray();
    }

    public void addVenda(String tipoProduto, String nomeProduto, int quantidadeProduto, double precoProduto) throws IOException {
        File ficheiro = new File("C:\\Users\\atyll\\DEV\\CESAE_Softdev_PRT_1023\\ProjetoTesteAtyllaKossatz\\src\\main\\resources\\minimercado.csv");

        FileWriter fw = new FileWriter(ficheiro, true);
        fw.append("\n"+tipoProduto+","+nomeProduto+","+quantidadeProduto+","+precoProduto);
        fw.close();
    }

    public int consultarStockProduto(String nomeProduto){
        int quantidadeVendida=0;
        int stock=1200;
        for (Venda vendaAtual : this.todasVendas) {
            if (vendaAtual.getProduto().equals(nomeProduto)){
                quantidadeVendida += vendaAtual.getQuantidadeVendida();
            }
        }

        stock-=quantidadeVendida;
        return stock;
    }

}
