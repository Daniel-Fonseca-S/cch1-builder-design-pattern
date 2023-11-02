package edu.utfpr.directors;

import edu.utfpr.builders.CardapioBuilder;
import edu.utfpr.builders.RefeicaoBuilder;
import edu.utfpr.enums.AcucarEnum;

/**
 * Director class for RefeicaoBuilder
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class RefeicaoDirector {

    private RefeicaoBuilder builderRef;
    private CardapioBuilder builderCard;

    public RefeicaoDirector() {
        this.builderRef = new RefeicaoBuilder();
        this.builderCard = new CardapioBuilder();
    }

    public void setBuilderRef(RefeicaoBuilder builderRef) {
        this.builderRef = builderRef;
    }

    public void setBuilderCard(CardapioBuilder builderCard) {
        this.builderCard = builderCard;
    }

    public void buildSobremesaSorvete() {
        builderRef.resetValues();
        builderRef
                .nome("Sorvete")
                .descricao("Sorvete de chocolate")
                .preco(10.0)
                .calorias(200)
                .tempoPreparo(5)
                .isSobremesa(true)
                .isGlutenFree(true)
                .isLactoseFree(false)
                .taxaAcucar(AcucarEnum.ALTO)
                .isVegetariano(true);
    }

    public void buildSobremesaPudim() {
        builderRef.resetValues();
        builderRef
                .nome("Pudim")
                .descricao("Pudim de leite")
                .preco(10.0)
                .calorias(200)
                .tempoPreparo(5)
                .isSobremesa(true)
                .isGlutenFree(true)
                .isLactoseFree(false)
                .taxaAcucar(AcucarEnum.ALTO);
    }

    public void buildPizzaCalabresa() {
        builderRef.resetValues();
        builderRef
                .nome("Pizza de calabresa")
                .descricao("Pizza de calabresa com queijo")
                .preco(30.0)
                .calorias(500)
                .tempoPreparo(30)
                .isPratoPrincipal(true)
                .isGlutenFree(false)
                .isLactoseFree(false);
    }

    public void buildCocaCola() {
        builderRef.resetValues();
        builderRef
                .nome("Coca-cola")
                .descricao("Refrigerante de cola")
                .preco(5.0)
                .calorias(100)
                .tempoPreparo(0)
                .isBebida(true)
                .isGlutenFree(true)
                .isLactoseFree(true)
                .taxaAcucar(AcucarEnum.ALTO);
    }

    public void buildPaoFrances() {
        builderRef.resetValues();
        builderRef
                .nome("Pão francês")
                .descricao("Pão francês")
                .preco(1.0)
                .calorias(100)
                .tempoPreparo(0)
                .isEntrada(true)
                .isGlutenFree(false)
                .isLactoseFree(true);
    }

    public void buildCardapioSegunda() {
        builderCard.resetValues();
        builderCard
                .nome("Cardápio de segunda-feira")
                .descricao("""
                        Entrada: Pão francês;
                        Prato principal: Pizza de calabresa;
                        Bebida: Coca-cola;
                        Sobremesa: Sorvete"""
                )
                .preco(45.0)
                .calorias(1000)
                .tempoPreparo(35)
                .isEntrada(true)
                .isPratoPrincipal(true)
                .isBebida(true)
                .isSobremesa(true)
                .isGlutenFree(false)
                .isLactoseFree(false);
    }
}
