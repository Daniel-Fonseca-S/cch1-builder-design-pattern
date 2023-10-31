package edu.utfpr;

import edu.utfpr.builders.RefeicaoBuilder;
import edu.utfpr.directors.RefeicaoDirector;
import edu.utfpr.objects.Refeicao;

/**
 * Main class for the project.
 *
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public class Main {
    public static void main(String[] args) {
        RefeicaoDirector director = new RefeicaoDirector();
        RefeicaoBuilder builder = new RefeicaoBuilder();

        director.buildSobremesaSorvete(builder);
        Refeicao sorvete = builder.build();
        director.buildSobremesaPudim(builder);
        Refeicao pudim = builder.build();
        director.buildPizzaCalabresa(builder);
        Refeicao pizza = builder.build();
        director.buildCocaCola(builder);
        Refeicao coca = builder.build();
        director.buildPaoFrances(builder);
        Refeicao pao = builder.build();

        System.out.println(sorvete.toString());
        System.out.println();
        System.out.println(pudim.toString());
        System.out.println();
        System.out.println(pizza.toString());
        System.out.println();
        System.out.println(coca.toString());
        System.out.println();
        System.out.println(pao.toString());
    }
}