package edu.utfpr.builders;

import edu.utfpr.enums.AcucarEnum;

/**
 * Builder interface for Refeicao objects.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public interface BaseBuilder {
    BaseBuilder nome(String nome);

    BaseBuilder descricao(String descricao);

    BaseBuilder preco(double preco);

    BaseBuilder calorias(int calorias);

    BaseBuilder tempoPreparo(int tempoPreparo);

    BaseBuilder isEntrada(boolean isEntrada);

    BaseBuilder isPratoPrincipal(boolean isPratoPrincipal);

    BaseBuilder isBebida(boolean isBebida);

    BaseBuilder isSobremesa(boolean isSobremesa);

    BaseBuilder isVegetariano(boolean isVegetariano);

    BaseBuilder isGlutenFree(boolean isGlutenFree);

    BaseBuilder isLactoseFree(boolean isLactoseFree);

    BaseBuilder taxaAcucar(AcucarEnum taxaAcucar);
}
