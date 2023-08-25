package candidatura;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		selecaoCandidados();
	}

	static void selecaoCandidados() {	

		String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGOSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		
		int candidatoSelecionado = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.00;
		while(candidatoSelecionado < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O canditado " + candidato + " foi selecionado para a vaga");
				candidatoSelecionado++;
			}
			candidatosAtual++;
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}

	static void analizarCandidato(double salarioPretendido) {

		double salarioBase = 2000.0;

		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
