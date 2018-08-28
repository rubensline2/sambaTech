package Tests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Pages.LoginPage;
import Pages.DashboardSambaVideosPage;

public class LoginStepsDefitions {
	WebDriver driver;

	@Given("^que acesso o site SambaVideos$")
	public void que_acesso_o_site_SambaVideos() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "c:\\path\\to\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://web1.qa.sambatech.com:10000/");
	}

	@When("^informar os dados de login \"(.*?)\" e \"(.*?)\"$")
	public void informar_os_dados_de_login_e(String login, String senha) throws Throwable {
		// driver.findElement(By.id("inputEmail")).sendKeys(login);
		// driver.findElement(By.id("inputPassword")).sendKeys(senha);
		LoginPage _loginPage = new LoginPage(driver);
		_loginPage.PreencherLogin(login);
		_loginPage.PreencherSenha(senha);
	}

	@When("^aciono o Entrar$")
	public void aciono_o_Entrar() throws Throwable {
		LoginPage _loginPage = new LoginPage(driver);
		_loginPage.ClicarEntrar();
	}

	@Then("^redireciona para a pagina Dashboard - Painel QA Samba$")
	public void redireciona_para_a_pagina_Dashboard_Painel_QA_Samba() throws Throwable {

		DashboardSambaVideosPage _dashboardPage = new DashboardSambaVideosPage(driver);
		_dashboardPage.VerificaUrl();
	}

	@Then("^usuario logado e exibido corretamente$")
	public void usuario_logado_exibido_e_o() throws Throwable {
		DashboardSambaVideosPage _dashboardPage = new DashboardSambaVideosPage(driver);
		_dashboardPage.VerificaUsuarioLogado();
		driver.quit();
	}

	@Then("^exibe a mensagem de erro \"(.*?)\"$")
	public void exibe_a_mensagem_de_erro(String msg) throws Throwable {
		LoginPage _loginPage = new LoginPage(driver);
		_loginPage.ValidaMsgErroLoginIncorreto(msg);
		driver.quit();
	}

}
