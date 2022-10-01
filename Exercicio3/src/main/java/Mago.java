
import java.util.ArrayList;

public class Mago extends Personagem {

    public Mago(String nome, int vida, int mana, double xp, int inteligencia, int forca, int level, random raNumero) {
        super(nome, vida, mana, xp, inteligencia, forca, level, raNumero);
    }
    
    ArrayList<String> habilidade = new ArrayList<String> ();

    
    @Override
    public void lvlUp() {
        mana += 5;
        inteligencia += 5;
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(String.format("Parabéns você acaba de upar seu personagem %s. Esses são os atribulos atualizados:\nVida: %s\nMana: %s\nXp: %s\nInteligencia: %s\nForça: %s\nLevel: %s ",nome, vida, mana, xp, inteligencia, forca, level));
    }

    public ArrayList<String> getHabilidade() {
		return habilidade;
  
    }
    
    public void setHabilidade(ArrayList<String> habilidade) {
		this.habilidade = habilidade;
    }
    public int attack() {
    	int Random = getRanPersonagem().RandomNumero(301);
        int inteligenciaDeAtaque = (inteligencia * level) + Random;
        System.out.println(String.format("%s acabou de atacar e a força de seu ataque foi %s",nome , inteligenciaDeAtaque));
        return inteligenciaDeAtaque;
    }


}
