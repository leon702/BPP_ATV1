package org.a;

import java.util.logging.Logger;


import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private final List<Produto> produtos;
    private final String cliente;
    private static final Logger logger = Logger.getLogger(String.valueOf(Pedido.class));

    public Pedido(String cliente) {
        this.produtos = new ArrayList<>();
        this.cliente = cliente;
        logger.info("Pedido Criado!");
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public float calcularTotal() {
        logger.info("Calculando total do pedido!");
        float total = 0;
        for (Produto produto : produtos) {
            total += produto.preco();
        }
        if (total > 100) {
            logger.info("Aplicando Desconto!");
            total *= 0.9F; // desconto de 10%
        }
        logger.info("Retornando o valor!");
        return total;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
