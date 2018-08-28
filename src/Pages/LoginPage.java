package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Mapeamento dos campos da tela
	@FindBy(how = How.ID, using = "inputEmail")
	WebElement txt_login;

	@FindBy(how = How.ID, using = "inputPassword")
	WebElement txt_senha;

	@FindBy(how = How.ID, using = "login")
	WebElement btn_login;

	@FindBy(how = How.ID, using = "keep-logged")
	WebElement ckx_mantenha_conectado;

	@FindBy(how = How.ID, using = "forgot-pwd-link")
	WebElement link_esqueci_minha_senha;

	@FindBy(how = How.ID, using = "password_incorrect")
	WebElement msg_erro_login_incorreto;

	// Ações da tela
	public void PreencherLogin(String login) {
		txt_login.sendKeys(login);
	}

	public void PreencherSenha(String senha) {
		txt_senha.sendKeys(senha);
	}

	public void MarcarMantenhaConectado() {
		ckx_mantenha_conectado.click();
	}

	public void ClicarEntrar() {
		btn_login.click();
	}

	public void ClicarLinkEsqueciSenha() {
		link_esqueci_minha_senha.click();
	}

	public void ValidaMsgErroLoginIncorreto(String mensagem) {
		if (msg_erro_login_incorreto.isDisplayed() == true) {
			System.out.println("Mensagem de erro foi exibida!");
			if (msg_erro_login_incorreto.getText().equals(mensagem)) {
				System.out.println("Mensagem de erro exibida esta correta!");
			} else {
				System.out.println("Mensagem de erro exibida esta incorreta!");
			}
		} else {
			System.out.println("Mensagem de erro não exibida!");
		}
	}

}
