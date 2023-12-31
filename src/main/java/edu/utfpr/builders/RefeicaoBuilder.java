package edu.utfpr.builders;

import edu.utfpr.enums.AcucarEnum;
import edu.utfpr.objects.Refeicao;

/**
 * Builder class for Refeicao objects.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class RefeicaoBuilder implements BaseBuilder {
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

    public void resetValues(){
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

    public RefeicaoBuilder() {
        resetValues();
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

    public RefeicaoBuilder taxaAcucar(AcucarEnum taxaAcucar) {
        this.taxaAcucar = taxaAcucar;
        return this;
    }

    public Refeicao build() {
        return new Refeicao(
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
