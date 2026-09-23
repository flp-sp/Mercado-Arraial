package net.flp_sp.classes;

public class AtracaoFestival {
    private String nome;
    private String hora;
    private double cache;
    private double valorIngresso;
    private int capacidadePublico;
    private int ingressosVendidos;

    public AtracaoFestival(String nome, String hora, double cache, double valorIngresso, int capacidadePublico) {
        this.ingressosVendidos = 0;
        this.nome = nome;
        this.hora = hora;
        this.cache = cache;
        this.valorIngresso = valorIngresso;
        this.capacidadePublico = capacidadePublico;
    }

    /* Verifica se existem vagas suficientes pra quantidade de ingressos que desejam comprar
    e incrementam a quantidade passada aos ingressos vendidos*/
    public boolean venderIngresso(int quantidade){
        if (quantidade <= getIngressosDisponiveis()){
            ingressosVendidos += quantidade;
            return true;
        }
        return false;
    }


    public double getValorPago(int quantidade){
        return this.valorIngresso * quantidade;
    }

    // Retorna a quantidade de ingressos disponiveis
    public int getIngressosDisponiveis(){
        return capacidadePublico - ingressosVendidos;
    }

    // Retorna a receita total
    public double calcularReceita(){
        return valorIngresso * ingressosVendidos;
    }


    public String getNome(){
        return this.nome;
    }


    public String getHora(){
        return this.hora;
    }
}