
public class TesteEscopo {
	public static void main(String[] args) {
		System.out.println("Testando concicionais");

		int idade = 20;
		int quantidadedePessoas = 3;
		boolean acompanhado;

		// boolean acompanhado = quantidadedePessoas >=2;

		if (quantidadedePessoas >= 2) {
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		System.out.println("valor de acompanhado = " + acompanhado);

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo");

		} else {
			System.out.println("Infelizmente você não pode entrar");

		}
	}
}

