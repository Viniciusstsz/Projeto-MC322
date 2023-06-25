
//Declarações da Classe Equipamento
public class Equipamento {
    private String nome;
    private int dano;
    private int defesa;
	private int durabilidademax;
    private int durabilidade;
    private int cooldown;
    private int tamanho;

//Construtor de Instâncias para a Classe Equipamento
public Equipamento(String nome, int dano, int defesa, int durabilidademax, int durabilidade, int cooldown, int tamanho) {
	this.nome = nome;
	this.dano = dano;
	this.defesa = defesa;
	this.durabilidademax = durabilidademax;
	this.durabilidade = durabilidade;
	this.cooldown = cooldown;
    this.tamanho = tamanho;
}

//Getters da Classe Equipamento (Retornam as informações sobre o Equipamento)
public String getNome() {
	return nome;
}
public int getDano() {
	return dano;
}
public int getDefesa() {
	return defesa;
}
public int getDurabilidademax() {
	return durabilidademax;
}
public int getDurabilidade() {
	return durabilidade;
}
public int getCooldown() {
	return cooldown;
}
public int getTamanho() {
	return tamanho;
}


//Setters da Classe Equipamento (Modificam os valores das informações sobre o Equipamento)
public void setNome(String nome) {
	this.nome = nome;
}
public void setDano(int dano) {
	this.dano = dano;
}
public void setDefesa(int defesa) {
	this.defesa = defesa;
}
public void setDurabilidademax(int durabilidademax) {
	this.durabilidademax = durabilidademax;
}
public void setDurabilidade(int durabilidade) {
	this.durabilidade = durabilidade;
}
public void setCooldown(int cooldown) {
	this.cooldown = cooldown;
}
public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}

}
