package br.com.alura.audios.modelos;

public class Audio {

	private String titulo;
	private double duracaoEmMin;
	private int totalReproducoes;
	private int curtidas;
	private int classificao;
	private boolean favorita;
	
	private boolean reproduzir = true;
	private double avaliacoes = 0;
	private int totalAvaliacoes = 0;
	
	
	public double getDuracaoEmMin() {
		return duracaoEmMin;
	}
	
	public void setDuracaoEmMin(int duracaoEmMin) {
		this.duracaoEmMin = duracaoEmMin;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTotalReproducoes() {
		return totalReproducoes;
	}
	
	public void setTotalReproducoes(int totalReproducoes) {
		this.totalReproducoes = totalReproducoes;
	}
	
	public int getCurtidas() {
		return curtidas;
	}
	
	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public int getClassificao() {
		classificao = (int) avaliacoes / totalAvaliacoes;
		return classificao / 2;
	}
	
	
	public boolean getFavorita() {
		return favorita;
	}
	
	public void setFavorita(boolean favorita) {
		this.favorita = favorita;
	}
	
	public void pausarReproduzir() {
		if(reproduzir == true) {
			reproduzir = false;
			System.out.println("Você pausou o áudio!");
		} else {
			reproduzir = true;
			System.out.println("Você deu play no áudio!");
		}
	}
	
	public void curtir() {
		curtidas++;
	}
	
	public void avaliar(double valor) {
		if(valor >= 0 && valor <= 10) {
			avaliacoes += valor;
			totalAvaliacoes++;
		}
	}
	
	
}
