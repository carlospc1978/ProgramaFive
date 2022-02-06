package br.com.seteideias.programafive.repository;

import br.com.seteideias.programafive.models.Produtos;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProdutoRepository {

private List<Produtos> listaDeProdutos = new ArrayList<Produtos>();
private Integer ultimoID = 0;

public List<Produtos> obterTodosOsProdutosCadastrados(){
    return listaDeProdutos;
}

    /**
     * Método que retorna o produto conforme o id informado
     * @param id que será localizado
     * @return retorna um produto caso seja localizado
     */
    public Optional<Produtos> obterPorId(Integer id){
    return listaDeProdutos
            .stream()
            .filter(produtos -> produtos.getIdProduto() == id)
            .findFirst()
            ;
}

}
