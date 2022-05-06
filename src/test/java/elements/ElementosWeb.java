package elements;

import org.openqa.selenium.By;

public class ElementosWeb {
	
	private By vestido = By.xpath("//*[@id=\"homefeatured\"]/li[7]/div/div[2]/h5/a");
	private By corVestido = By.id("color_15");
	private By flecha = By.id("group_1");
	private By tamanhoVestido = By.xpath("//*[@id=\"group_1\"]/option[2]");
	private By adicionarCarrinho = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
	private By continuarComprando = By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i");
	private By selecionarCatalogo = By.xpath("//*[@id=\"columns\"]/div[1]/a[2]");
	private By blusaAzul = By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a");
	private By corBlusaAzul = By.id("color_14");
	private By blusa = By.xpath("//a[normalize-space()='Blouse']");
	private By quantidade = By.xpath("//i[@class='icon-plus']");
	private By vestidoMidi = By.xpath("//li[@class='ajax_block_product col-xs-12 col-sm-6 col-md-4 first-in-line last-item-of-tablet-line first-item-of-mobile-line']//a[@title='Printed Dress'][normalize-space()='Printed Dress']");
	private By finalizarCompra = By.xpath("//span[normalize-space()='Proceed to checkout']");
	private By prosseguirCompra = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span");
	private By escreverEmail = By.id("email_create");
	private By criarConta = By.xpath("//span[normalize-space()='Create an account']");
	private By primeiroNome = By.id("customer_firstname");
	private By sobrenome = By.id("customer_lastname");
	private By senha = By.id("passwd");
	private By dia = By.id("days");
	private By mes = By.id("months");
	private By ano = By.id("years");
	private By meuDia = By.xpath("//select[@id='days']//option[@value='19']");
	private By meuMes = By.xpath("//select[@id='months']//option[@value='6']");
	private By meuAno = By.xpath("//option[@value='1995']");
	private By primeiroNomeEndereco = By.id("firstname");
	private By sobrenomeEndereco = By.id("lastname");
	private By endereco = By.id("address1");
	private By cidade = By.id("city");
	private By estado = By.id("id_state");
	private By selecionarEstado = By.xpath("//option[normalize-space()='Florida']");
	private By codigoPostal = By.id("postcode");
	private By numeroCelular = By.id("phone_mobile");
	private By enderecoAlternativo = By.id("alias");
	private By registrar = By.xpath("//span[normalize-space()='Register']");
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	public By getVestido() {
		return vestido;
	}

	public By getCorVestido() {
		return corVestido;
	}

	public By getTamanhoVestido() {
		return tamanhoVestido;
	}

	public By getFlecha() {
		return flecha;
	}

	public By getAdicionarCarrinho() {
		return adicionarCarrinho;
	}

	public By getContinuarComprando() {
		return continuarComprando;
	}

	public By getSelecionarCatalogo() {
		return selecionarCatalogo;
	}

	public By getBlusaAzul() {
		return blusaAzul;
	}

	public By getCorBlusaAzul() {
		return corBlusaAzul;
	}

	public By getBlusa() {
		return blusa;
	}

	public By getQuantidade() {
		return quantidade;
	}

	public By getVestidoMidi() {
		return vestidoMidi;
	}

	public By getFinalizarCompra() {
		return finalizarCompra;
	}

	public By getProsseguirCompra() {
		return prosseguirCompra;
	}

	public By getEscreverEmail() {
		return escreverEmail;
	}

	public By getCriarConta() {
		return criarConta;
	}

	public By getPrimeiroNome() {
		return primeiroNome;
	}

	public By getSobrenome() {
		return sobrenome;
	}

	public By getSenha() {
		return senha;
	}

	public By getDia() {
		return dia;
	}

	public By getMes() {
		return mes;
	}

	public By getAno() {
		return ano;
	}

	public By getMeuDia() {
		return meuDia;
	}

	public By getMeuMes() {
		return meuMes;
	}

	public By getMeuAno() {
		return meuAno;
	}

	public By getSobrenomeEndereco() {
		return sobrenomeEndereco;
	}

	public By getPrimeiroNomeEndereco() {
		return primeiroNomeEndereco;
	}

	public By getEstado() {
		return estado;
	}

	public By getCidade() {
		return cidade;
	}

	public By getEndereco() {
		return endereco;
	}

	public By getSelecionarEstado() {
		return selecionarEstado;
	}

	public By getCodigoPostal() {
		return codigoPostal;
	}

	public By getNumeroCelular() {
		return numeroCelular;
	}

	public By getEnderecoAlternativo() {
		return enderecoAlternativo;
	}

	public By getRegistrar() {
		return registrar;
	}

}
