public class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }

    public void perderVida(int quantidade) {
        if (quantidade > 0) {
            vida -= quantidade;
            if (vida < 0) {
                vida = 0; 
            }
            System.out.println(nome + " perde " + quantidade + " de vida. Vida atual: " + getVida());
        }
    }

}