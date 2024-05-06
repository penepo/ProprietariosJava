import java.util.Scanner;
import java.util.Date;
import java.util.Formatter;
public class Historico {
	Scanner sc = new Scanner(System.in);
	
	int IdHisto;
	int IdImovel;
	float ValorAluguel;
	String DataInicial;
	String DataFinal;
	
	public void CadastrarIdHisto() {
		System.out.println("Cadastrar historico:");
		IdHisto = sc.nextInt();
	}

	public void CadastrarIdImovel() {
		System.out.println("Cadastrar Imovel:");
		IdImovel = sc.nextInt();
	}
	
	public void CadastrarValorAluguel() {
		System.out.println("Cadastrar Valor Aluguel:");
		ValorAluguel = sc.nextFloat();
	}
	
	public void CadastrarDataInicial() {
		System.out.println("Cadastrar a data inicial:");
		String data = sc.next();
		DataInicial = data.formatted("H%:M%:S%");
	}
	
	public void CadastrarDataFinal() {
		System.out.println();
		String data = sc.next();
		DataFinal = data.formatted("H%:M%:S%");
	}
	
	public void ExibirIdHisto() {
		System.out.println("Exibir historico:" + IdHisto);
	}
	
	public void ExibirIdImovel() {
		System.out.println("Exibir Id do Imovel:" + IdImovel);
	}
	
	public void ExibirIdValorAluguel() {
		System.out.println("Exibir Valor do Aluguel:" + ValorAluguel);
	}
	
	public void ExibirDataInicial() {
		System.out.println("Exibir Data Inicial:" + DataInicial);
	}

	public void ExibirDataFinal() {
		System.out.println("Exibir Data Final:" + DataFinal);
	}

}
