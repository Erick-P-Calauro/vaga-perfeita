package com.erick.vaga_perfeita.Utilidades.CarregadorModelos.Valores;

public class FaixasSalariais {

    private static int[][] faixasSalariais = {{1000, 2500}, {2501, 4000}, {4001, 7500}, {7501, 10000}, {10000, 100000}};

    public static int[][] retornar() {
        return faixasSalariais;
    }

}
