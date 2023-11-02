package edu.utfpr.builders;

import edu.utfpr.enums.AcucarEnum;
import edu.utfpr.objects.RefeicaoCardapio;

public class CardapioBuilder implements BaseBuilder {
    private String nome;
    private String descricao;
    private double preco;
    private int calorias;
    private int tempoPreparo;
    private boolean isEntrada;
    private boolean isPratoPrincipal;
    private boolean isBebida;
    private boolean isSobremesa;
    private boolean isVegetariano;
    private boolean isGlutenFree;
    private boolean isLactoseFree;

    private AcucarEnum taxaAcucar;

    public CardapioBuilder() {
        resetValues();
    }

    public void resetValues() {
        this.nome = "";
        this.descricao = "";
        this.preco = 0.0;
        this.calorias = 0;
        this.tempoPreparo = 0;
        this.isEntrada = false;
        this.isPratoPrincipal = false;
        this.isBebida = false;
        this.isSobremesa = false;
        this.isVegetariano = false;
        this.isGlutenFree = false;
        this.isLactoseFree = false;
        this.taxaAcucar = null;
    }

    public CardapioBuilder nome(String nome) {
        this.nome = nome + " - Especial do dia";
        return this;
    }

    public CardapioBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public CardapioBuilder preco(double preco) {
        this.preco = preco * 1.1;
        return this;
    }

    public CardapioBuilder calorias(int calorias) {
        this.calorias = calorias;
        return this;
    }

    public CardapioBuilder tempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo + 5;
        return this;
    }

    public CardapioBuilder isEntrada(boolean isEntrada) {
        this.isEntrada = isEntrada;
        return this;
    }

    public CardapioBuilder isPratoPrincipal(boolean isPratoPrincipal) {
        this.isPratoPrincipal = isPratoPrincipal;
        return this;
    }

    public CardapioBuilder isBebida(boolean isBebida) {
        this.isBebida = isBebida;
        return this;
    }

    public CardapioBuilder isSobremesa(boolean isSobremesa) {
        this.isSobremesa = isSobremesa;
        return this;
    }

    public CardapioBuilder isVegetariano(boolean isVegetariano) {
        this.isVegetariano = isVegetariano;
        return this;
    }

    public CardapioBuilder isGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public CardapioBuilder isLactoseFree(boolean isLactoseFree) {
        this.isLactoseFree = isLactoseFree;
        return this;
    }

    public CardapioBuilder taxaAcucar(AcucarEnum taxaAcucar) {
        this.taxaAcucar = taxaAcucar;
        return this;
    }

    public RefeicaoCardapio build() {
        return new RefeicaoCardapio(
                nome,
                descricao,
                preco,
                calorias,
                tempoPreparo,
                isEntrada,
                isPratoPrincipal,
                isBebida,
                isSobremesa,
                isVegetariano,
                isGlutenFree,
                isLactoseFree,
                taxaAcucar
        );
    }

}
