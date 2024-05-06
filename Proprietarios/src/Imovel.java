import java.util.Scanner;
public class Imovel {
	Scanner scanner = new Scanner(System.in);
	
	
	int IdImovel;
	int IdProprietario;
	String Endereco;
	float ValorAluguel;
	
	public void CadastrarIdImovel() {
		System.out.println("Cadastre o Id do Imovel");
		IdImovel = scanner.nextInt();
	}
	
	public void CadastrarIdProprietario() {
		System.out.println("Cadastre o Id do Proprietario");
		IdProprietario = scanner.nextInt();
	}

	
	public void CadastrarValorAluguel() {
		System.out.println("Cadastre o Id do Imovel");
		ValorAluguel = scanner.nextFloat();
	}
	
	
	public void CadastrarEndereco() {
		System.out.println("Cadastre o Endereço:5");
		Endereco = scanner.next();
	}

	
	
	
	public void ExibirIdImovel() {
		System.out.println("Exibir o Id do Imovel:" + IdImovel);
		
	}
	
	public void ExibirIdProprietario() {
		System.out.println("Exibir o Id do Proprietario:" + IdProprietario);
		
	}

	
	public void ExibirValorAluguel() {
		System.out.println("Exibir o Valor do Aluguel:" + ValorAluguel);
		
	}
	
	public void ExibirEndereco() {
		System.out.println("Exibir o endereço:" + Endereco);
		
	}

	








}
