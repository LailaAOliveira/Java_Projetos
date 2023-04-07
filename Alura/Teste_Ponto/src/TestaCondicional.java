
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("Testando concicionais");
		int idade = 16;
		int quantidadedePessoas = 3;
		
		if (idade >= 18) {
			System.out.println("Você tem mais de 18 anos!");
			System.out.println("Seja bem vindo");
					
		} else {
			if (quantidadedePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar, pois está acompanhado");
			} else {
			System.out.println("infelizmente você não pode entrar");
			
		}
	 }
	
   }
}

