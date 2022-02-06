package br.com.seteideias.programafive.services;

import br.com.seteideias.programafive.models.Produtos;
import br.com.seteideias.programafive.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;


    public List<Produtos> obterTodosOsProdutos(){
        return produtoRepository.obterTodosOsProdutosCadastrados();
    }

    public Optional<Produtos> obterPorID(Integer id){
        return produtoRepository.obterPorId(id);
    }

    public Produtos adicionar(Produtos produtos){
        return produtoRepository.adicionarProduto(produtos);
    }

    public void deletar (Integer id){
        produtoRepository.deletarProduto(id);
    }

    public Produtos atualizarProduto(Integer id, Produtos produtos){
        produtos.setIdProduto(id);
        return produtoRepository.atualizarProduto(produtos);
    }

}
