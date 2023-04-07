package superbank;

public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDaLaila = new Conta();
		contaDaLaila.saldo = 100;
		contaDaLaila.deposita(50);
		System.out.println(contaDaLaila.saldo);
		boolean conseguiuRetirar = contaDaLaila.saca(20);
		System.out.println(contaDaLaila.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTransferencia = contaDaMarcela.transfere(300, contaDaLaila);
		
		if(sucessoTransferencia) {
			System.out.println(("Transferência com sucesso"));
		} else {
			System.out.println("Faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDaLaila.saldo);
	}
}
