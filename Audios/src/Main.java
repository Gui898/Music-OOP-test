import br.com.alura.audios.modelos.Music;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println();
		System.out.println("***************Music***************");
		System.out.println();
		
		Music music = new Music();
		
		music.setTitulo("Hell's Bells");
		music.setDuracaoEmMin(3);
		music.setFavorita(true);
		music.avaliar(8);
		music.avaliar(9);
		music.avaliar(3);
		System.out.println("Avaliação: " + music.getClassificao());
		
		
		System.out.println();
		System.out.println("**************Podcast**************");
		System.out.println();

	}

}
