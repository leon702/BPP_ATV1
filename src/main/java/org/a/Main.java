package org.a;


public class Main {
    public static void main(String[] args) {
        // Criar catalogo
        Catalogo catalogo = new Catalogo();

        // Adicionar produtos ao catalogo
        catalogo.adicionarProduto(new Produto(1, "Produto 1", 50));
        catalogo.adicionarProduto(new Produto(2, "Produto 2", 75));
        catalogo.adicionarProduto(new Produto(3, "Produto 3", 120));

        // Listar produtos
        System.out.println("Produtos disponíveis:");
        for (Produto produto : catalogo.listarProdutos()) {
            System.out.println(produto.nome() + " - R$" + produto.preco());
        }

        // Buscar produto por ID
        Produto produto = catalogo.buscarProdutoPorId(2);
        if (produto != null) {
            System.out.println("Produto encontrado: " + produto.nome());
        }

        // Criar pedido
        Pedido pedido = new Pedido("João");

        // Adicionar produtos ao pedido
        pedido.adicionarProduto(catalogo.buscarProdutoPorId(1));
        pedido.adicionarProduto(catalogo.buscarProdutoPorId(3));

        // Calcular total do pedido
        float total = pedido.calcularTotal();
        System.out.println("Total do pedido: R$" + total);
    }
}


































