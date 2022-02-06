package br.com.seteideias.programafive.controllers;

import br.com.seteideias.programafive.models.Produtos;
import br.com.seteideias.programafive.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public List<Produtos> buscarTodosOsProdutos(){
        return produtoService.obterTodosOsProdutos();
    }

    @PostMapping
    public Produtos adicionar (@RequestBody Produtos produtos){
        return produtoService.adicionar(produtos);
    }

    @PostMapping(value = "/novo/{umaStringQualquer}")
    public Produtos adicionarPorParametro(@PathVariable(value="umaStringQualquer") String novoProduto){
        Produtos produtos = new Produtos();
        produtos.setNome1Produto(novoProduto);
        return produtoService.adicionar(produtos);
    }

}
