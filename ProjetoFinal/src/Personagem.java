import java.util.*;

//Declarações da Classe Personagem
public class Personagem {
	private String nome;
    private int vidamax;
	private int vida;
    private int energiamax;
    private int energia;
	private ArrayList<Equipamento> listaEquipamento;

//Construtor de Instâncias para a Classe Personagem
public Personagem(String nome, int vidamax, int vida, int energiamax, int energia) {
	this.nome = nome;
	this.vidamax = vidamax;
	this.vida = vida;
	this.energiamax = energiamax;
	this.energia = energia;
	this.listaEquipamento = new ArrayList<Equipamento>();
}

//Getters da Classe Personagem (Retornam as informações sobre o Personagem)
public String getNome() {
	return nome;
}
public int getVidamax() {
	return vidamax;
}
public int getVida() {
	return vida;
}
public int getEnergiamax() {
	return energiamax;
}
public int getEnergia() {
	return energia;
}
public ArrayList<Equipamento> getListaEquipamento() {
	return listaEquipamento;
}

//Setters da Classe Personagem (Modificam os valores das informações sobre o Personagem)
public void setNome(String nome) {
	this.nome = nome;
}
public void setVidamax(int vidamax) {
	this.vidamax = vidamax;
}
public void setVida(int vida) {
	this.vida = vida;
}
public void setEnergiamax(int energiamax) {
	this.energiamax = energiamax;
}
public void setEnergia(int energia) {
	this.energia = energia;
}

//Metódos da classe Personagem
public int AtaqueBasico(Personagem alvo){
	int DanoCausado = alvo.TomarDano(10);
	return DanoCausado;
}

public int TomarDano(int DanoEnviado){
	int melhordefesa = 0;
	for(int i = 0; i<this.getListaEquipamento().size();i++){
		if(melhordefesa>0){
			if(this.getListaEquipamento().get(i)!=null && this.getListaEquipamento().get(i).getDefesa()>this.getListaEquipamento().get(melhordefesa-1).getDefesa() && this.getListaEquipamento().get(i).getDurabilidade()>0){
				melhordefesa = i+1;
			}
		}
		else{
			melhordefesa = i+1;
		}
	}
	int DanoTomado = DanoEnviado-this.getListaEquipamento().get(melhordefesa-1).getDefesa();
	if(this.getListaEquipamento().get(melhordefesa-1).getDefesa()>0){
		this.getListaEquipamento().get(melhordefesa-1).setDurabilidade(this.getListaEquipamento().get(melhordefesa-1).getDurabilidade()-1);
	}
	this.setVida(this.getVida()-DanoEnviado);
	return DanoTomado;
}

}
