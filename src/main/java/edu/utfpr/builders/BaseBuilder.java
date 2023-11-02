package edu.utfpr.builders;

import edu.utfpr.enums.AcucarEnum;

/**
 * Builder interface for Refeicao objects.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public interface BaseBuilder {
    public BaseBuilder nome(String nome);

    public BaseBuilder descricao(String descricao);

    public BaseBuilder preco(double preco);

    public BaseBuilder calorias(int calorias);

    public BaseBuilder tempoPreparo(int tempoPreparo);

    public BaseBuilder isEntrada(boolean isEntrada);

    public BaseBuilder isPratoPrincipal(boolean isPratoPrincipal);

    public BaseBuilder isBebida(boolean isBebida);

    public BaseBuilder isSobremesa(boolean isSobremesa);

    public BaseBuilder isVegetariano(boolean isVegetariano);

    public BaseBuilder isGlutenFree(boolean isGlutenFree);

    public BaseBuilder isLactoseFree(boolean isLactoseFree);

    public BaseBuilder taxaAcucar(AcucarEnum taxaAcucar);
}
