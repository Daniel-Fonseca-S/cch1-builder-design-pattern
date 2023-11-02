package edu.utfpr.enums;

/**
 * Enum for Acucar objects to express the amount of sugar in a meal.
 *
 * @author Daniel Fonseca <danielfonseca@utfpr.edu.br>
 */
public enum AcucarEnum {
    BAIXO,
    MEDIO,
    ALTO;

    @Override
    public String toString() {
        return switch (this) {
            case BAIXO -> "Baixo";
            case MEDIO -> "Médio";
            case ALTO -> "Alto";
        };
    }
}
