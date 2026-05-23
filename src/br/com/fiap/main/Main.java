package br.com.fiap.main;

import br.com.fiap.bean.Avatar;
import br.com.fiap.bean.AvatarPrimario;
import br.com.fiap.bean.AvatarSecundario;
import br.com.fiap.bean.AvatarPremium;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // ══════════════════════════════════════════════════
        // INSTANCIAÇÃO DE TODAS AS CLASSES (requisito FIAP)
        // Usando construtores completos com super()
        // ══════════════════════════════════════════════════
        Avatar avatarDemo          = new Avatar("EcoSoul", 0, 0, 0);
        AvatarPrimario primario    = new AvatarPrimario("AlmaVerde", 1, 0, 0);
        AvatarSecundario secundario = new AvatarSecundario("BrotoAzul", 2, 120, 15);
        AvatarPremium premium      = new AvatarPremium("ArvoreDourada", 3, 350, 40);

        // ══════════════════════════════════════════════════
        // ABERTURA — AVATAR DEMONSTRATIVO
        // ══════════════════════════════════════════════════
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║       🌿 BEM-VINDO AO ECOGUIA! 🌿       ║");
        System.out.println("║         Alma Digital Sustentavel         ║");
        System.out.println("╚══════════════════════════════════════════╝");
        System.out.println();
        System.out.println("-- AVATAR DEMONSTRATIVO --");
        avatarDemo.exibirInfo();
        System.out.println();

        // ══════════════════════════════════════════════════
        // CRIAÇÃO DO AVATAR DO USUÁRIO
        // ══════════════════════════════════════════════════
        System.out.println("Vamos criar o seu Avatar Sustentavel!");
        System.out.print("Informe o nome do seu avatar: ");
        String nome = sc.nextLine();

        System.out.println();
        System.out.println("Escolha o tipo do seu avatar:");
        System.out.println("  1 - Primario  (🌱 Semente Ecologica)");
        System.out.println("  2 - Secundario (💧 Broto Consciente)");
        System.out.println("  3 - Premium   (⭐ Arvore da Mudanca)");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();
        sc.nextLine();
        System.out.println();

        // ══════════════════════════════════════════════════
        // NIVEL 1 — AVATAR PRIMÁRIO
        // ══════════════════════════════════════════════════
        if (opcao == 1) {

            primario.setNomeAvatar(nome);

            System.out.println(primario.apresentarBeneficios());
            System.out.println();
            System.out.println("-- SEU AVATAR --");
            primario.exibirInfo();
            System.out.println();

            // Registrar ação sustentável
            System.out.print("Descreva uma acao sustentavel que voce realizou hoje: ");
            String acao = sc.nextLine();
            System.out.println();
            System.out.println(primario.registrarAcao(acao));
            System.out.println();

            // Exibir trilha de Marcos
            System.out.println(primario.trilhaDeMarcos());
            System.out.println();

            // Mensagem motivacional
            System.out.println("💬 " + primario.incentivar());

            // ══════════════════════════════════════════════════
            // NIVEL 2 — AVATAR SECUNDÁRIO
            // ══════════════════════════════════════════════════
        } else if (opcao == 2) {

            secundario.setNomeAvatar(nome);

            System.out.println(secundario.apresentarBeneficios());
            System.out.println();
            System.out.println("-- SEU AVATAR --");
            secundario.exibirInfo();
            System.out.println();

            // Registrar ação sustentável (benefício herdado do Primário)
            System.out.print("Descreva uma acao sustentavel que voce realizou hoje: ");
            String acao = sc.nextLine();
            System.out.println();
            System.out.println(secundario.registrarAcao(acao));
            System.out.println();

            // Exibir trilha de Marcos (benefício herdado do Primário)
            System.out.println(secundario.trilhaDeMarcos());
            System.out.println();

            // Dica sustentável por tópico
            System.out.println("Escolha um topico para receber uma dica sustentavel:");
            System.out.println("  1 - Reciclagem");
            System.out.println("  2 - Mobilidade");
            System.out.println("  3 - Alimentacao");
            System.out.print("Topico: ");
            String topico = sc.nextLine();
            System.out.println();
            System.out.println(secundario.dicasPorTopico(topico));
            System.out.println();

            // Networking (benefício exclusivo do Secundário)
            System.out.print("Digite o nome de um perfil para conectar na rede EcoGuia: ");
            String perfilBuscado = sc.nextLine();
            System.out.println();
            System.out.println(secundario.acessarNetworking(perfilBuscado));
            secundario.ganharExperiencia(5);

            // ══════════════════════════════════════════════════
            // NIVEL 3 — AVATAR PREMIUM
            // ══════════════════════════════════════════════════
        } else if (opcao == 3) {

            premium.setNomeAvatar(nome);

            System.out.println(premium.apresentarBeneficios());
            System.out.println();
            System.out.println("-- SEU AVATAR --");
            premium.exibirInfo();
            System.out.println();

            // Registrar ação sustentável (benefício herdado do Primário)
            System.out.print("Descreva uma acao sustentavel que voce realizou hoje: ");
            String acao = sc.nextLine();
            System.out.println();
            System.out.println(premium.registrarAcao(acao));
            System.out.println();

            // Exibir trilha de Marcos (benefício herdado do Primário)
            System.out.println(premium.trilhaDeMarcos());
            System.out.println();

            // Dashboard principal (benefício exclusivo do Premium)
            System.out.println(premium.exibirDashboard());
            System.out.println();

            // Painel avançado de impacto histórico (benefício exclusivo do Premium)
            System.out.println("-- PAINEL AVANCADO DE IMPACTO HISTORICO --");

            int diasAtivos;
            int totalAcoesHistorico;

            try {
                System.out.print("Quantos dias voce esta ativo na plataforma: ");
                diasAtivos = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Numero invalido! Usando valor padrao: 30 dias.");
                diasAtivos = 30;
            }

            try {
                System.out.print("Quantas acoes sustentaveis realizou no total: ");
                totalAcoesHistorico = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Numero invalido! Usando valor padrao: 10 acoes.");
                totalAcoesHistorico = 10;
            }

            premium.ganharExperiencia(totalAcoesHistorico * 10);
            System.out.println();
            System.out.println(premium.calcularImpacto(totalAcoesHistorico, diasAtivos));

        } else {
            System.out.println("Opcao invalida! Escolha 1, 2 ou 3.");
        }

        // ══════════════════════════════════════════════════
        // ENCERRAMENTO
        // ══════════════════════════════════════════════════
        System.out.println();
        System.out.println("╔══════════════════════════════════════════╗");
        System.out.println("║   🌿 Obrigado por agir pelo planeta! 🌿  ║");
        System.out.println("║        Continue seu Eco-Ciclo!           ║");
        System.out.println("╚══════════════════════════════════════════╝");

        sc.close();
    }
}