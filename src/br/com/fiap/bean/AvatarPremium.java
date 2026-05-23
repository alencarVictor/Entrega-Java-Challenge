package br.com.fiap.bean;

public class AvatarPremium extends Avatar {

    // Construtor vazio
    public AvatarPremium() {
    }

    // Construtor completo — usa super() do pai
    public AvatarPremium(String nomeAvatar, int nivelAtual, int experiencia, int totalAcoes) {
        super(nomeAvatar, nivelAtual, experiencia, totalAcoes);
    }

    // Método: apresentar benefícios do Avatar Premium (acumula tudo)
    public String apresentarBeneficios() {
        return "╔══════════════════════════════════════╗\n"
                + "║        ⭐ AVATAR PREMIUM             ║\n"
                + "╠══════════════════════════════════════╣\n"
                + "║ ✔ Todos os beneficios do Primario    ║\n"
                + "║ ✔ Todos os beneficios do Secundario  ║\n"
                + "║ ✔ Visibilidade maxima no dashboard   ║\n"
                + "║   principal do aplicativo            ║\n"
                + "║ ✔ Painel avancado de calculo de      ║\n"
                + "║   impacto historico desbloqueado     ║\n"
                + "║ ✔ +10 XP por acao + bonus exclusivos ║\n"
                + "╚══════════════════════════════════════╝";
    }

    // Método: exibir visibilidade no dashboard principal
    public String exibirDashboard() {
        String aura;
        if (getExperiencia() >= 200) {
            aura = "🟡 RADIANTE";
        } else if (getExperiencia() >= 50) {
            aura = "🟢 BRILHANTE";
        } else {
            aura = "⚫ OPACA";
        }

        return "╔══════════════════════════════════════════╗\n"
                + "║      🏆 DASHBOARD PRINCIPAL — SOULUP     ║\n"
                + "╠══════════════════════════════════════════╣\n"
                + "║  Avatar: " + getNomeAvatar() + "\n"
                + "║  Nivel: " + getNivelAtual() + " — PREMIUM\n"
                + "║  Aura de Perfil: " + aura + "\n"
                + "║  Visibilidade: MAXIMA ✔\n"
                + "║  Posicao na comunidade: DESTAQUE\n"
                + "╠══════════════════════════════════════════╣\n"
                + "║  Total de XP: " + getExperiencia() + "\n"
                + "║  Total de Acoes: " + getTotalAcoes() + "\n"
                + "╚══════════════════════════════════════════╝";
    }

    // Método: painel avançado de impacto histórico
    public String calcularImpacto(int totalAcoes, int diasAtivos) {
        if (diasAtivos <= 0 || totalAcoes < 0) {
            return "Valores invalidos para calculo de impacto!";
        }

        double mediaPorDia = (double) totalAcoes / diasAtivos;
        int arvoresEquivalentes = totalAcoes / 5;
        double co2Evitado = totalAcoes * 0.8;

        String classificacao;
        if (mediaPorDia >= 3) {
            classificacao = "🏆 IMPACTO EXCEPCIONAL";
        } else if (mediaPorDia >= 1) {
            classificacao = "🌳 IMPACTO CONSISTENTE";
        } else {
            classificacao = "🌱 IMPACTO EM CRESCIMENTO";
        }

        return "╔══════════════════════════════════════════╗\n"
                + "║   📊 PAINEL DE IMPACTO HISTORICO         ║\n"
                + "╠══════════════════════════════════════════╣\n"
                + "║  Total de acoes: " + totalAcoes + "\n"
                + "║  Dias ativos: " + diasAtivos + "\n"
                + "║  Media por dia: " + String.format("%.2f", mediaPorDia) + " acoes\n"
                + "╠══════════════════════════════════════════╣\n"
                + "║  🌳 Arvores equivalentes: " + arvoresEquivalentes + "\n"
                + "║  💨 CO2 evitado estimado: " + String.format("%.1f", co2Evitado) + " kg\n"
                + "╠══════════════════════════════════════════╣\n"
                + "║  Classificacao: " + classificacao + "\n"
                + "╚══════════════════════════════════════════╝";
    }
}