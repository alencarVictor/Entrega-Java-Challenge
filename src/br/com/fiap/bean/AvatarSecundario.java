package br.com.fiap.bean;

public class AvatarSecundario extends Avatar {

    // Construtor vazio
    public AvatarSecundario() {
    }

    // Construtor completo — usa super() do pai
    public AvatarSecundario(String nomeAvatar, int nivelAtual, int experiencia, int totalAcoes) {
        super(nomeAvatar, nivelAtual, experiencia, totalAcoes);
    }

    // Método: apresentar benefícios do Avatar Secundário (acumula com Primário)
    public String apresentarBeneficios() {
        return "╔══════════════════════════════════════╗\n"
                + "║       💧 AVATAR SECUNDARIO           ║\n"
                + "╠══════════════════════════════════════╣\n"
                + "║ ✔ Todos os beneficios do Primario    ║\n"
                + "║ ✔ Acesso a rede de networking:       ║\n"
                + "║   conexao com perfis de reputacao    ║\n"
                + "║   validada na plataforma SoulUp      ║\n"
                + "║ ✔ +10 XP por acao + bonus de ciclo  ║\n"
                + "╚══════════════════════════════════════╝";
    }

    // Método: conectar com perfis da rede de networking
    public String acessarNetworking(String perfilBuscado) {
        if (perfilBuscado == null || perfilBuscado.trim().isEmpty()) {
            return "Informe um nome de perfil para buscar!";
        }
        return "🔗 REDE DE NETWORKING — SoulUp\n"
                + "─────────────────────────────────────\n"
                + "Buscando perfil: @" + perfilBuscado + "\n"
                + "Status: ✔ Perfil com reputacao VALIDADA encontrado!\n"
                + "Acoes sustentaveis registradas: publicas\n"
                + "Nivel de aura: verificado pela plataforma\n"
                + "─────────────────────────────────────\n"
                + "Conexao estabelecida com @" + perfilBuscado + "!\n"
                + "+5 XP bonus por networking ativo.";
    }

    // Método: dicas por tópico (mantida do original)
    public String dicasPorTopico(String topico) {
        if (topico.equalsIgnoreCase("Reciclagem")) {
            return "DICA SUSTENTAVEL — Reciclagem:\n"
                    + "Separe plastico, vidro e papel corretamente.\n"
                    + "Dica bonus: Lave as embalagens antes de descartar!";
        } else if (topico.equalsIgnoreCase("Mobilidade")) {
            return "DICA SUSTENTAVEL — Mobilidade:\n"
                    + "Prefira bicicleta ou transporte publico.\n"
                    + "Dica bonus: Combine caronas para reduzir emissoes!";
        } else if (topico.equalsIgnoreCase("Alimentacao")) {
            return "DICA SUSTENTAVEL — Alimentacao:\n"
                    + "Evite desperdicio de alimentos.\n"
                    + "Dica bonus: Prefira alimentos locais e da estacao!";
        } else {
            return "Topico invalido! Escolha: Reciclagem, Mobilidade ou Alimentacao.";
        }
    }
}