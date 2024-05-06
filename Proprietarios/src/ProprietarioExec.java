import java.util.Date;
public class ProprietarioExec {
	static Date time = new Date();
	public static void main(String[] args) {
		System.out.println("Data Agora: "+ time);
		
		
		Proprietario prop = new Proprietario();
		prop.CadastrarIdProprietario();
		prop.CadastrarNome();
		prop.CadastrarEndereco();
		prop.CadastrarDataHoraCadastro();
		prop.Cadastrarcpfcnpj();
		
		prop.ExibiridProprietario();
		prop.ExibirNome();
		prop.ExibiridEndereco();
		prop.ExibiridDataHoraCadastro();
		prop.ExibirCpfCnpj();
	
		Imovel imo = new Imovel();
		imo.CadastrarIdImovel();
		imo.CadastrarIdProprietario();
		imo.CadastrarValorAluguel();
		imo.CadastrarEndereco();
		
		
		imo.ExibirIdImovel();
		imo.ExibirIdProprietario();
		imo.ExibirValorAluguel();
		imo.ExibirEndereco();
		
	
		Inquilino inq = new Inquilino();
		inq.CadastrarIdInquilino();
		inq.CadastrarIdImovel();
		inq.CadastrarEndereco();
		inq.CadastrarTelefone();
		inq.CadastrarEmail();
		
		inq.ExibirIdInquilino();
		inq.ExibirIdImovel();
		inq.ExibirEndereco();
		inq.ExibirTelefone();
		inq.ExibirEmail();
	
		Historico hist = new Historico();
		hist.CadastrarIdHisto();
		hist.CadastrarIdImovel();
		hist.CadastrarValorAluguel();
		hist.CadastrarDataInicial();
		hist.CadastrarDataFinal();
		
		hist.ExibirIdHisto();
		hist.ExibirIdImovel();
		hist.ExibirIdValorAluguel();
		hist.ExibirDataInicial();
		hist.ExibirDataFinal();
	
	
	
	}
}
