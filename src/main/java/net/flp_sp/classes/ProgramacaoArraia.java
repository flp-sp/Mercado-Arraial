package net.flp_sp.classes;

public class ProgramacaoArraia {
    private String[] atracoes;
    private int quantidadeAtual;
    private final int MAX_ATRACOES;

    public ProgramacaoArraia() {
        MAX_ATRACOES = 10;
        this.atracoes = new String[MAX_ATRACOES];
        this.quantidadeAtual = 0;
    }

    public void adicionarAtracao(AtracaoFestival atracao){
        if (quantidadeAtual < MAX_ATRACOES){
            this.atracoes[quantidadeAtual] = // atracao.getname;
            quantidadeAtual++;
        }
    }

    public void listarProgramacao(){
        // Acionar metodo de imprimir atracao na classe AtracaoFestival para todos os itens
    }

    public void buscarPorNome(String nome){
        for (int i = 0; i < quantidadeAtual; i++){
            if (// atracao.getname == nome){
                return // atracao;    
            }
        }
    }
}
