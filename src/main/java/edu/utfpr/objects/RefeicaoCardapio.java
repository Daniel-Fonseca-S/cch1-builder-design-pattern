package edu.utfpr.objects;

import edu.utfpr.enums.AcucarEnum;

public record RefeicaoCardapio(
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
        boolean isLactoseFree,
        AcucarEnum taxaAcucar
) {
    @Override
    public String toString() {
        return """
                Item do cardápio: %s;
                Descrição do item: %s;
                Preço do item com taxa: R$ %.2f;
                Calorias do item: %d;
                Tempo de produção: %d Minutos;
                É entrada? %s;
                É prato principal? %s;
                É bebida? %s;
                É sobremesa? %s;
                É vegetariano? %s;
                É sem glúten? %s;
                É sem lactose? %s;
                Nível de açúcar: %s.
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
                isLactoseFree ? "Sim" : "Não",
                taxaAcucar == null ? "Não se aplica" : taxaAcucar.toString()
        );
    }
}
