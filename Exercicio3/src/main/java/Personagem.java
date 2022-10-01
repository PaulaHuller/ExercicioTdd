
public class Personagem {

    String nome;
    int vida;
    int mana;
    double xp;
    int inteligencia;
    int forca;
    int level;
    random ranPersonagem;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }


    public Personagem(String nome, int vida, int mana, double xp2, int inteligencia, int forca, int level, random raNumero) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp2;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
        this.ranPersonagem = raNumero;
    }

	public random getRanPersonagem() {
		return ranPersonagem;
	}

	public void setRanPersonagem(random ranPersonagem) {
		this.ranPersonagem = ranPersonagem;
	}

	public void lvlUp(){
        vida += 1;
        mana += 1;
        xp += 20;
        inteligencia += 1;
        forca += 1;
        level += 1;
    }
}
