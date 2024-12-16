package org.a;



import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class Catalogo {
    private final List<Produto> produtos;
    private static final java.util.logging.Logger logger = Logger.getLogger(String.valueOf(Pedido.class));

    public Catalogo() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produto produto) {
        logger.info("Adicionando produto!");
        produtos.add(produto);
    }

    public List<Produto> listarProdutos() {
        logger.info("Listando produtos!");
        return produtos;
    }

    public Produto buscarProdutoPorId(int id) {
        logger.info("Iniciando busca por produto!");
        for (Produto produto : produtos) {
            if (produto.id() == id) {
                logger.info("Busca concluida!");
                return produto;
            }
        }
        logger.warning("Produto não encontrado!");
        return null;
    }
}
