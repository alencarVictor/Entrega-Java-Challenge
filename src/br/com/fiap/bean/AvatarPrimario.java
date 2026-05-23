package br.com.fiap.bean;

public class AvatarPrimario extends Avatar {

    // Construtor vazio
    public AvatarPrimario() {
    }

    // Construtor completo — usa super() do pai
    public AvatarPrimario(String nomeAvatar, int nivelAtual, int experiencia, int totalAcoes) {
        super(nomeAvatar, nivelAtual, experiencia, totalAcoes);
    }

    // Método: apresentar benefícios do Avatar Primário
    public String apresentarBeneficios() {
        return "╔══════════════════════════════════════╗\n"
                + "║        🌱 AVATAR PRIMARIO            ║\n"
                + "╠══════════════════════════════════════╣\n"
                + "║ ✔ Registro nativo de acoes           ║\n"
                + "║   sustentaveis no seu perfil         ║\n"
                + "║ ✔ Inicializacao da progressao        ║\n"
                + "║   na trilha de Marcos                ║\n"
                + "║ ✔ +10 XP por acao registrada         ║\n"
                + "╚══════════════════════════════════════╝";
    }

    // Método: incentivar o usuário a agir
    public String incentivar() {
        return "Continue assim! Com pequenas acoes sustentaveis voce constroi\n"
                + "um historico de impacto real. Cada acao registrada avanca\n"
                + "voce na trilha de Marcos e aumenta sua reputacao no EcoGuia!";
    }
}