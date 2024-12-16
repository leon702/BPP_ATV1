package org.a;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestJUnit {

    //TESTE CATALAGO
    @Test
    public void testAdicionarProduto() {
        Catalogo catalogo = new Catalogo();
        Produto produto = new Produto(1, "Produto Teste", 10.99f);
        catalogo.adicionarProduto(produto);
        assertEquals(1, catalogo.listarProdutos().size());
    }

    @Test
    public void testBuscarProdutoPorId() {
        Catalogo catalogo = new Catalogo();
        Produto produto = new Produto(1, "Produto Teste", 10.99f);
        catalogo.adicionarProduto(produto);
        Produto produtoEncontrado = catalogo.buscarProdutoPorId(1);
        assertEquals(produto, produtoEncontrado);
    }




    //TESTE PRODUTO
    @Test
    public void testGetId() {
        Produto produto = new Produto(1, "Produto Teste", 10.99f);
        assertEquals(1, produto.id());
    }

    @Test
    public void testGetNome() {
        Produto produto = new Produto(1, "Produto Teste", 10.99f);
        assertEquals("Produto Teste", produto.nome());
    }

    @Test
    public void testGetPreco() {
        Produto produto = new Produto(1, "Produto Teste", 10.99f);
        assertEquals(10.99f, produto.preco(), 0.01);
    }




    //TESTE PEDIDO
    @Test
    public void testCalcularTotalSemDesconto() {
        Pedido pedido = new Pedido("Cliente Teste");
        pedido.adicionarProduto(new Produto(1, "Produto Teste", 50f));
        assertEquals(50f, pedido.calcularTotal(), 0.01);
    }

    @Test
    public void testCalcularTotalComDesconto() {
        Pedido pedido = new Pedido("Cliente Teste");
        pedido.adicionarProduto(new Produto(1, "Produto Teste", 120f));
        assertEquals(108f, pedido.calcularTotal(), 0.01);
    }


}