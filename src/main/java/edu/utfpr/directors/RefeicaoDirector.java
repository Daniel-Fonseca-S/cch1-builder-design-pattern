package edu.utfpr.directors;

import edu.utfpr.builders.RefeicaoBuilder;

/**
 * Director class for RefeicaoBuilder
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class RefeicaoDirector {
    public void buildSobremesaSorvete(RefeicaoBuilder builder) {
        builder
                .nome("Sorvete")
                .descricao("Sorvete de chocolate")
                .preco(10.0)
                .calorias(200)
                .tempoPreparo(5)
                .isSobremesa(true)
                .isGlutenFree(true)
                .isLactoseFree(false);
    }

    public void buildSobremesaPudim(RefeicaoBuilder builder) {
        builder
                .nome("Pudim")
                .descricao("Pudim de leite")
                .preco(10.0)
                .calorias(200)
                .tempoPreparo(5)
                .isSobremesa(true)
                .isGlutenFree(true)
                .isLactoseFree(false);
    }

    public void buildPizzaCalabresa(RefeicaoBuilder builder) {
        builder
                .nome("Pizza de calabresa")
                .descricao("Pizza de calabresa com queijo")
                .preco(30.0)
                .calorias(500)
                .tempoPreparo(30)
                .isPratoPrincipal(true)
                .isGlutenFree(false)
                .isLactoseFree(false);
    }

    public void buildCocaCola(RefeicaoBuilder builder) {
        builder
                .nome("Coca-cola")
                .descricao("Refrigerante de cola")
                .preco(5.0)
                .calorias(100)
                .tempoPreparo(0)
                .isBebida(true)
                .isGlutenFree(true)
                .isLactoseFree(true);
    }

    public void buildPaoFrances(RefeicaoBuilder builder) {
        builder
                .nome("Pão francês")
                .descricao("Pão francês")
                .preco(1.0)
                .calorias(100)
                .tempoPreparo(0)
                .isEntrada(true)
                .isGlutenFree(false)
                .isLactoseFree(true);
    }
}
