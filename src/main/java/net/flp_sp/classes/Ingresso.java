package net.flp_sp.classes;

public class Ingresso {
    private int numero;
    private String nomeAtracao;
    private double valorPago;
    private static int contadorGeral;


    public Ingresso(String nomeAtracao, double valorPago, int amount) {
        contadorGeral += amount;
        this.nomeAtracao = nomeAtracao;
        this.valorPago = valorPago;
    }


    public static int getTotalEmitido(){
        return contadorGeral;
    }
    

    public double getValorPago() {
        return valorPago;
    }
    
    
    public String getNomeAtracao() {
        return nomeAtracao;
    }
}
