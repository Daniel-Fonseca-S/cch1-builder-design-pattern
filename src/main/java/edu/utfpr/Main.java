package edu.utfpr;

import edu.utfpr.builders.CardapioBuilder;
import edu.utfpr.builders.RefeicaoBuilder;
import edu.utfpr.directors.RefeicaoDirector;
import edu.utfpr.objects.Refeicao;
import edu.utfpr.objects.RefeicaoCardapio;

/**
 * Main class for the project.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        RefeicaoBuilder builderRef = new RefeicaoBuilder();
        CardapioBuilder builderCard = new CardapioBuilder();
        RefeicaoDirector director = new RefeicaoDirector();
        director.setBuilderRef(builderRef);
        director.setBuilderCard(builderCard);

        System.out.println("Refeições:");
        director.buildSobremesaSorvete();
        Refeicao sorvete = builderRef.build();
        System.out.println(sorvete);
        director.buildSobremesaPudim();
        Refeicao pudim = builderRef.build();
        System.out.println(pudim);
        director.buildPizzaCalabresa();
        Refeicao pizza = builderRef.build();
        System.out.println(pizza);
        director.buildCocaCola();
        Refeicao coca = builderRef.build();
        System.out.println(coca);
        director.buildPaoFrances();
        Refeicao pao = builderRef.build();
        System.out.println(pao);

        System.out.println();

        System.out.println("Cardápio:");
        director.buildCardapioSegunda();
        RefeicaoCardapio segunda = builderCard.build();
        System.out.println(segunda);

    }
}