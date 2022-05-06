package tests;

import elements.ElementosWeb;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	ElementosWeb el = new ElementosWeb();

	@Given("que eu esteja no site {string}")
	public void que_eu_esteja_no_site(String site) throws InterruptedException {

	}

	@When("eu incluir as pecas no carrinho")
	public void eu_incluir_as_pecas_no_carrinho() throws InterruptedException {
		metodos.clicar(el.getVestido());
		Thread.sleep(2000);
		metodos.clicar(el.getCorVestido());
		Thread.sleep(2000);
		metodos.clicar(el.getFlecha());
		Thread.sleep(2000);
		metodos.clicar(el.getTamanhoVestido());
		Thread.sleep(2000);
		metodos.clicar(el.getAdicionarCarrinho());
		Thread.sleep(5000);
		metodos.clicar(el.getContinuarComprando());
		metodos.clicar(el.getSelecionarCatalogo());
		metodos.clicar(el.getBlusaAzul());
		Thread.sleep(2000);
		metodos.clicar(el.getCorBlusaAzul());
		Thread.sleep(2000);
		metodos.clicar(el.getAdicionarCarrinho());
		Thread.sleep(5000);
		metodos.clicar(el.getContinuarComprando());
		metodos.clicar(el.getSelecionarCatalogo());
		metodos.clicar(el.getBlusa());
		Thread.sleep(2000);
		metodos.clicar(el.getQuantidade());
		Thread.sleep(2000);
		metodos.clicar(el.getAdicionarCarrinho());
		Thread.sleep(5000);
		metodos.clicar(el.getContinuarComprando());
		metodos.clicar(el.getSelecionarCatalogo());
		metodos.clicar(el.getVestidoMidi());
		metodos.clicar(el.getAdicionarCarrinho());

	}

	@Then("finalizo a minha compra")
	public void finalizo_a_minha_compra() throws InterruptedException {
		Thread.sleep(5000);
		metodos.clicar(el.getFinalizarCompra());
		Thread.sleep(2000);
		metodos.clicar(el.getProsseguirCompra());

	}

	@Given("que eu esteja finalizando uma compra e nao tenha cadastro no site")
	public void que_eu_esteja_finalizando_uma_compra_e_nao_tenha_cadastro_no_site() throws InterruptedException {
		Thread.sleep(3000);
		metodos.clicar(el.getEscreverEmail());
		metodos.escrever("michelle_5m@hotmail.com", el.getEscreverEmail());
		metodos.clicar(el.getCriarConta());

	}

	@When("eu preencher os meus dados")
	public void eu_preencher_os_meus_dados() throws InterruptedException {
		Thread.sleep(3000);
		metodos.clicar(el.getPrimeiroNome());
		Thread.sleep(3000);
		metodos.escrever("Michelle", el.getPrimeiroNome());
		Thread.sleep(3000);
		metodos.clicar(el.getSobrenome());
		Thread.sleep(3000);
		metodos.escrever("Munhoz", el.getSobrenome());
		Thread.sleep(3000);
		metodos.clicar(el.getSenha());
		metodos.escrever("190695", el.getSenha());
		metodos.clicar(el.getDia());
		metodos.clicar(el.getMeuDia());
		metodos.clicar(el.getMes());
		metodos.clicar(el.getMeuMes());
		metodos.clicar(el.getAno());
		metodos.clicar(el.getMeuAno());
		metodos.clicar(el.getPrimeiroNomeEndereco());
		metodos.escrever("Michelle", el.getPrimeiroNomeEndereco());
		metodos.clicar(el.getSobrenomeEndereco());
		metodos.escrever("Munhoz", el.getSobrenomeEndereco());
		metodos.clicar(el.getEndereco());
		metodos.escrever("NW 14TH ST 542 - 598", el.getEndereco());
		metodos.clicar(el.getCidade());
		metodos.escrever("MIAMI BEACH", el.getCidade());
		metodos.clicar(el.getEstado());
		metodos.clicar(el.getSelecionarEstado());
		metodos.clicar(el.getCodigoPostal());
		metodos.escrever("33140", el.getCodigoPostal());
		metodos.clicar(el.getNumeroCelular());
		metodos.escrever("+1 112 5554321", el.getNumeroCelular());
		metodos.clicar(el.getEnderecoAlternativo());
		metodos.escrever("NW 14TH ST 700 - 728", el.getEnderecoAlternativo());

	}

	@Then("eu finalizo o cadastro")
	public void eu_finalizo_o_cadastro() throws InterruptedException {
		metodos.clicar(el.getRegistrar());
		Thread.sleep(10000);
		metodos.fecharNavegador("Encerrando o teste.");
		

	}

}
