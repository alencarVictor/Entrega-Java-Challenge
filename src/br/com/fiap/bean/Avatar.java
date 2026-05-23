package br.com.fiap.bean;

public class Avatar {

    // Atributos
    private String nomeAvatar;
    private int nivelAtual;
    private int experiencia;
    private int totalAcoes;

    // Construtor vazio
    public Avatar() {
    }

    // Construtor completo
    public Avatar(String nomeAvatar, int nivelAtual, int experiencia, int totalAcoes) {
        this.nomeAvatar = nomeAvatar;
        this.nivelAtual = nivelAtual;
        this.experiencia = experiencia;
        this.totalAcoes = totalAcoes;
    }

    // Getters e Setters
    public String getNomeAvatar() { return nomeAvatar; }
    public void setNomeAvatar(String nomeAvatar) { this.nomeAvatar = nomeAvatar; }

    public int getNivelAtual() { return nivelAtual; }
    public void setNivelAtual(int nivelAtual) { this.nivelAtual = nivelAtual; }

    public int getExperiencia() { return experiencia; }
    public void setExperiencia(int experiencia) { this.experiencia = experiencia; }

    public int getTotalAcoes() { return totalAcoes; }
    public void setTotalAcoes(int totalAcoes) { this.totalAcoes = totalAcoes; }

    // Método: ganhar experiência
    public void ganharExperiencia(int xp) {
        if (xp > 0) {
            this.experiencia += xp;
        }
    }

    // Método: registrar ação sustentável (disponível para TODOS os avatares)
    public String registrarAcao(String descricaoAcao) {
        if (descricaoAcao == null || descricaoAcao.trim().isEmpty()) {
            return "Descricao da acao nao pode ser vazia!";
        }
        this.totalAcoes++;
        ganharExperiencia(10);
        return "✔ Acao registrada: \"" + descricaoAcao + "\"\n"
                + "  +10 XP conquistados!\n"
                + "  Total de acoes: " + this.totalAcoes + "\n"
                + "  Experiencia atual: " + this.experiencia + " XP";
    }

    // Método: exibir progressão na trilha de Marcos (disponível para TODOS os avatares)
    public String trilhaDeMarcos() {
        StringBuilder trilha = new StringBuilder();
        trilha.append("=== TRILHA DE MARCOS ===\n");

        if (totalAcoes >= 1)
            trilha.append("[X] 🌱 Primeira Acao - Desbloqueado!\n");
        else
            trilha.append("[ ] 🌱 Primeira Acao - Registre sua 1a acao!\n");

        if (totalAcoes >= 10)
            trilha.append("[X] 🌿 Cultivador - 10 acoes completas!\n");
        else
            trilha.append("[ ] 🌿 Cultivador - Faltam " + (10 - totalAcoes) + " acoes\n");

        if (totalAcoes >= 50)
            trilha.append("[X] 🌳 Guardian Verde - 50 acoes completas!\n");
        else
            trilha.append("[ ] 🌳 Guardian Verde - Faltam " + (50 - totalAcoes) + " acoes\n");

        if (totalAcoes >= 100)
            trilha.append("[X] 🏆 Centenario Sustentavel - 100 acoes!\n");
        else
            trilha.append("[ ] 🏆 Centenario Sustentavel - Faltam " + (100 - totalAcoes) + " acoes\n");

        return trilha.toString();
    }

    // Método: exibir informações do avatar
    public void exibirInfo() {
        System.out.println("Nome: " + nomeAvatar);
        System.out.println("Nivel: " + nivelAtual);
        System.out.println("Experiencia: " + experiencia + " XP");
        System.out.println("Total de acoes: " + totalAcoes);
    }
}