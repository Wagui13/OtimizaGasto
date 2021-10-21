import java.util.Scanner;

public class OtimizaGastos {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String nomeCompleto;
		System.out.println("Bem vindo ao Gastos Organizer!\nOrginize sua vida financeira");
		double vAluguel, vAgua, vLuz,vNet,vSaude,vMercado,vEdu,vTranporte;
		double totalCusto, totalMeta;
		double vSalario,vAtual,vPoupar;
		
		System.out.println("Informe os seus dados...");
		System.out.println("Nome completo:");
		nomeCompleto = sc.nextLine();
		System.out.println("Informe o salario:");
		vSalario = Double.parseDouble(sc.nextLine());
		System.out.println("Valor atual:");
		vAtual = Double.parseDouble(sc.nextLine());
		System.out.println("O quanto você deseja poupar:");
		vPoupar = Double.parseDouble(sc.nextLine());
		
		totalMeta = vSalario + vAtual - vPoupar;
		
		System.out.println("Sua meta inicial de poupança foi criada, no valor de: R$" + totalMeta);
		System.out.println("Escolha uma categoria para organizar: 1- casa; 2- mercado; 3- acessórios; 4- outro.");
		//concatenar com as variáveis para emitir o valor preenchido de cada custo.
		System.out.println("O que deseja adicionar na categoria ");

		
		vAluguel = perguntar("Voce tem custo com aluguel");
		vAgua = perguntar("Voce tem custo com água?");
		vLuz = perguntar("Voce tem custo com luz");
		vNet = perguntar("Voce tem custo com internet");
		vSaude = perguntar("Voce tem custo com saude?");
		vMercado = perguntar("Voce tem custo com mercado ");
		vEdu = perguntar("Voce tem custo com educação");
		vTranporte = perguntar("Voce tem custo com transporte");
		
		totalCusto = vAluguel+vAgua+vLuz+vNet+vSaude+vMercado+vEdu+vTranporte;
		System.out.println("Seu total de gastos é: R$" + totalCusto);
		
	}
	
	
	static double perguntar(String pergunta) {
		double valor = 0;
		System.out.println(pergunta);
		System.out.println("Digite 0-NAO 1-SIM");
		int opcao = Integer.parseInt(sc.nextLine());
		if(opcao == 1) {
			System.out.println("Digite o valor:");
			valor = Double.parseDouble(sc.nextLine());
		}
		return valor;
	}

}
