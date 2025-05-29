package com.gustavo.estoque.service;

import com.gustavo.estoque.model.Produto;
import com.gustavo.estoque.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public List<Produto> listarTodos() {
        return repository.findAll();
    }
    public Produto buscarPorId(Long id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }
    public Produto salvar(Produto produto) {
        return repository.save(produto);
    }
    public Produto atualizar(Long id, Produto produto) {
        Produto existente = buscarPorId(id);
        existente.setNome(produto.getNome());
        existente.setDescricao(produto.getDescricao());
        existente.setPreco(produto.getPreco());
        existente.setQuantidade(produto.getQuantidade());
        return repository.save(existente);
    }
    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
