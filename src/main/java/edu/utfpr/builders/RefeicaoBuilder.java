package edu.utfpr.builders;

import edu.utfpr.objects.Refeicao;

/**
 * Builder class for Refeicao objects.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class RefeicaoBuilder {
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

    public RefeicaoBuilder() {
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
    }

    public RefeicaoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public RefeicaoBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    public RefeicaoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public RefeicaoBuilder calorias(int calorias) {
        this.calorias = calorias;
        return this;
    }

    public RefeicaoBuilder tempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
        return this;
    }

    public RefeicaoBuilder isEntrada(boolean isEntrada) {
        this.isEntrada = isEntrada;
        return this;
    }

    public RefeicaoBuilder isPratoPrincipal(boolean isPratoPrincipal) {
        this.isPratoPrincipal = isPratoPrincipal;
        return this;
    }

    public RefeicaoBuilder isBebida(boolean isBebida) {
        this.isBebida = isBebida;
        return this;
    }

    public RefeicaoBuilder isSobremesa(boolean isSobremesa) {
        this.isSobremesa = isSobremesa;
        return this;
    }

    public RefeicaoBuilder isVegetariano(boolean isVegetariano) {
        this.isVegetariano = isVegetariano;
        return this;
    }

    public RefeicaoBuilder isGlutenFree(boolean isGlutenFree) {
        this.isGlutenFree = isGlutenFree;
        return this;
    }

    public RefeicaoBuilder isLactoseFree(boolean isLactoseFree) {
        this.isLactoseFree = isLactoseFree;
        return this;
    }

    public Refeicao build() {
        return new Refeicao(
                this.nome,
                this.descricao,
                this.preco,
                this.calorias,
                this.tempoPreparo,
                this.isEntrada,
                this.isPratoPrincipal,
                this.isBebida,
                this.isSobremesa,
                this.isVegetariano,
                this.isGlutenFree,
                this.isLactoseFree
        );
    }
}
