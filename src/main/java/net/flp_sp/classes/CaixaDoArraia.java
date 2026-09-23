package net.flp_sp.classes;

public class CaixaDoArraia {
    private static double saldoGeral;
    private static final double TAXA_SERVICO = 0.05;

    public void registrarVenda(double valor){
        valor = (valor * (1 + TAXA_SERVICO));
        saldoGeral += valor;
    }

    public static double consultarSaldoGeral(){
        return saldoGeral;
    }
}