package net.flp_sp;

import java.util.Scanner;

import net.flp_sp.classes.AtracaoFestival;
import net.flp_sp.classes.CaixaDoArraia;
import net.flp_sp.classes.Ingresso;
import net.flp_sp.classes.ProgramacaoArraia;

public class Main {
    public static void main(String[] args) {
        ProgramacaoArraia programacao = new ProgramacaoArraia();
        CaixaDoArraia caixaDoArraia = new CaixaDoArraia();

        programacao.adicionarAtracao(new AtracaoFestival("Banda de Forro", "18:00", 2.0, 50.0, 100));
        programacao.adicionarAtracao(new AtracaoFestival("Quadrilha", "17:30", 1.0, 15.0, 60));
        programacao.adicionarAtracao(new AtracaoFestival("Show de Fogos", "20:00", 2.0, 30.0, 150));
        programacao.adicionarAtracao(new AtracaoFestival("Parque de Diversões", "16:00", 2.0, 100.0, 200));

        programacao.listarProgramacao();

        Scanner scanner = new Scanner(System.in);
        String pickAtracao1 = scanner.nextLine();
        int amount1 = scanner.nextInt();

        AtracaoFestival atracao1 = programacao.buscarPorNome(pickAtracao1);
        if (atracao1 != null){
            if (atracao1.venderIngresso(amount1)){
                Ingresso ingresso1 = new Ingresso(pickAtracao1, atracao1.getValorPago(amount1), amount1);
                caixaDoArraia.registrarVenda(ingresso1.getValorPago());
            }
        }

        scanner.nextLine();
        String pickAtracao2 = scanner.nextLine();
        int amount2 = scanner.nextInt();

        AtracaoFestival atracao2 = programacao.buscarPorNome(pickAtracao2);
        if (atracao2 != null){
            if (atracao2.venderIngresso(amount2)){
                Ingresso ingresso2 = new Ingresso(pickAtracao2, atracao2.getValorPago(amount2), amount2);
                caixaDoArraia.registrarVenda(ingresso2.getValorPago());
            }

            
        }
        scanner.close();

        System.out.println("Receita: " + atracao1.calcularReceita());
        System.out.println("Receita: " + atracao2.calcularReceita());

        System.out.println("Total emitido: " + Ingresso.getTotalEmitido());

        System.out.println("Total saldo geral: " + caixaDoArraia.consultarSaldoGeral());

    }
}