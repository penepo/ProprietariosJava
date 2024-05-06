import java.util.Scanner;
public class Inquilino {
	Scanner scanner = new Scanner(System.in);
	
	int IdInquilino;
	int IdImovel;
	String Endereco;
	String Telefone;
	String Email;
	String DataHoraCadastro;
                             

	public void CadastrarIdInquilino() {
		System.out.println("Cadastre o id do inquilino:");
		 IdInquilino = scanner.nextInt();
	}
	public void CadastrarIdImovel() {
		System.out.println("Cadastre o ID do Imovel:");
		 IdImovel = scanner.nextInt();
	}
	public void CadastrarEndereco() {
		System.out.println("Cadastre o endereço:");
		 Endereco = scanner.next();
	}
	public void CadastrarTelefone() {
		System.out.println("Cadastre o Telefone:");
		 Telefone = scanner.next();
	}
	public void CadastrarEmail() {
		System.out.println("Cadastre o Email:");
		 Email = scanner.next();
	}
	
	public void ExibirIdInquilino() {
		System.out.println("Exibir o id do inquilino:" + IdInquilino);
	}
	
	public void ExibirIdImovel() {
		System.out.println("Exibir o id do imovel:" + IdImovel);
	}
	
	public void ExibirEndereco() {
		System.out.println("Exibir o Endereço:" + Endereco);
	}
	
	public void ExibirTelefone() {
		System.out.println("Exibir o Telefone:" + Telefone);
	}
	
	
	public void ExibirEmail() {
		System.out.println("Exibir o Email:" + Email);
	}
	
	
	public void ExibirDataHoraCadastro() {
		System.out.println("Exibir a data e a hora:" + DataHoraCadastro);
		
	}
}
