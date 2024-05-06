import java.util.Date;
import java.util.Scanner;
public class Proprietario {
	Date time = new Date();
	Scanner scanner = new Scanner(System.in);
	
		String idProprietario;
		String nome;
		String endereco;
		String DataHoraCadastro;
		String cpfcnpj;
		
		public void CadastrarIdProprietario() {
			System.out.println("Cadastre o ID:");
			idProprietario = scanner.nextLine();
		}
		
		public void CadastrarNome() {
			System.out.println("Cadastre o nome:");
			 nome = scanner.nextLine();
		}
	
		public void CadastrarEndereco() {
			System.out.println("Cadastre o Endereço:");
			 endereco = scanner.nextLine();
		}
		
		public void CadastrarDataHoraCadastro() {
			System.out.println("Digite a Data; Hora e Cadastro:");
			 DataHoraCadastro = scanner.nextLine();
		}
		
		public void Cadastrarcpfcnpj() {
			System.out.println("Digite seu CPF e CNPJ:");
			 cpfcnpj = scanner.nextLine();
		}
		
		public void ExibiridProprietario() {
			System.out.println("Exibir o Id:" + idProprietario);
		}
		
		public void ExibirNome() {
			System.out.println("Exibir o Nome:" + nome);
		}
	
		
		public void ExibiridEndereco() {
			System.out.println("Exibir o Endereço:" + endereco);
		}
	
		public void ExibiridDataHoraCadastro() {
			System.out.println("Exibir o Data; Hora e Cadastro:" + DataHoraCadastro);
		}
	
		public void ExibirCpfCnpj() {
			System.out.println("Exibir o Cpf Cnpj:" + DataHoraCadastro);
		}
	
	 
}
