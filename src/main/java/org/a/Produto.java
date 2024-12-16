package org.a;


import java.util.logging.Logger;

public record Produto(int id, String nome, float preco) {
    private static final java.util.logging.Logger logger = Logger.getLogger(String.valueOf(Pedido.class));

    public Produto(int id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        logger.info("Criando Produto!");
    }
}
