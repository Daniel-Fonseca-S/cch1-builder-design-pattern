package edu.utfpr.objects;

/**
 * Class for Refeicao objects.
 *
 * @param nome
 * @param descricao
 * @param preco
 * @param calorias
 * @param tempoPreparo
 * @param isEntrada
 * @param isPratoPrincipal
 * @param isBebida
 * @param isSobremesa
 * @param isVegetariano
 * @param isGlutenFree
 * @param isLactoseFree
 * @author Daniel Fonseca <danielfonseca@alunos.utfpr.edu.br>
 */
public record Refeicao(
        String nome,
        String descricao,
        double preco,
        int calorias,
        int tempoPreparo,
        boolean isEntrada,
        boolean isPratoPrincipal,
        boolean isBebida,
        boolean isSobremesa,
        boolean isVegetariano,
        boolean isGlutenFree,
        boolean isLactoseFree
) {
    @Override
    public String toString() {
        return """
                Nome: %s;
                Descrição: %s;
                Preço: R$ %.2f;
                Calorias: %d;
                Tempo de preparo: %d Minutos;
                É entrada? %s;
                É prato principal? %s;
                É bebida? %s;
                É sobremesa? %s;
                É vegetariano? %s;
                É sem glúten? %s;
                É sem lactose? %s.
                """.formatted(
                nome,
                descricao,
                preco,
                calorias,
                tempoPreparo,
                isEntrada ? "Sim" : "Não",
                isPratoPrincipal ? "Sim" : "Não",
                isBebida ? "Sim" : "Não",
                isSobremesa ? "Sim" : "Não",
                isVegetariano ? "Sim" : "Não",
                isGlutenFree ? "Sim" : "Não",
                isLactoseFree ? "Sim" : "Não"
        );
    }
}
