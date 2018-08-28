package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardSambaVideosPage {
	WebDriver driver;

	public DashboardSambaVideosPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Mapeamento dos campos da tela
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div/div[2]/form/ul[2]/li/a/span")
	WebElement txt_usuario_logado;

	// A��es da tela
	public void VerificaUrl() {
		String titulo = driver.getTitle();
		System.out.println("O titulo � " + titulo);
		if (titulo.trim().equals("Samba Videos")) {
			System.out.println("A tela SambaVideo foi aberta");
		} else {
			System.out.println("A tela SambaVideo n�o foi aberta");
		}
	}

	public void VerificaUsuarioLogado() {
		String texto = txt_usuario_logado.getText();
		
		if (texto.equals("Automação Samba - Teste QA")) 
		{
			System.out.println("Usu�rio logado corretamente!");
		} 
		else 
		{
			System.out.println("Usu�rio n�o logado");
		}

	}

}
