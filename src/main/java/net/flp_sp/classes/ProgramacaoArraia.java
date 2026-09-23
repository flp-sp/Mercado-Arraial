package net.flp_sp.classes;

public class ProgramacaoArraia {
    private AtracaoFestival[] atracoes;
    private int quantidadeAtual;
    private final int MAX_ATRACOES;

    public ProgramacaoArraia() {
        MAX_ATRACOES = 10;
        this.atracoes = new AtracaoFestival[MAX_ATRACOES];
        this.quantidadeAtual = 0;
    }

    public void adicionarAtracao(AtracaoFestival atracao){
        if (quantidadeAtual < MAX_ATRACOES){
            this.atracoes[quantidadeAtual] = atracao;
            quantidadeAtual++;
        }
    }

    public void listarProgramacao() {
        // Acionar metodo de imprimir atracao na classe AtracaoFestival para todos os
        // itens
        if (this.atracoes.length > 0){
            for (int i = 0; i < quantidadeAtual; i++) {
                AtracaoFestival atracao = this.atracoes[i];
                System.out.printf("Nome: %s\nHorario: %s\n", atracao.getNome(), atracao.getHora());
            }
        }
    }

    public AtracaoFestival buscarPorNome(String nome){
        if (this.atracoes.length > 0){
            for (int i = 0; i < quantidadeAtual; i++){
                AtracaoFestival atracao = this.atracoes[i];
                if (atracao.getNome().equals(nome)){
                    return atracao; 
                }
            }
        }
        return null;
    }
}
