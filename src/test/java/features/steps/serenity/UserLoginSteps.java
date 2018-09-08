package features.steps.serenity;

import static org.assertj.core.api.Assertions.assertThat;

import net.thucydides.core.annotations.Step;
import pages.BienvenidaPage;
import pages.LoginPage;
import utilitario.UrlPages;

public class UserLoginSteps {
	LoginPage loginPage;
	BienvenidaPage bienvenidaPage;
	UrlPages urlPage = new UrlPages();
	
	public String userName = "";
	
	@Step
	public void cargar_la_pagina_everilion() {
		loginPage.open();
	}
	
	@Step
	public void ingresa_name(String name) {
		userName = name;
		loginPage.writeTextName(name);
	}
	
	@Step
	public void ingresa_password(String password) {
		loginPage.writeTextPassword(password);
	}
	
	@Step
	public void ingresa_plataforma_everilion() {
		loginPage.clickEntrar();
	}
	
	@Step
	public void valida_nombre_session(String session) {
		System.out.println("Pagina Inicial - " + urlPage.P_LOGIN);
		System.out.println("Pagina Actual - " + urlPage.getCurrent());
		urlPage.waitSeconds(5);
		if (urlPage.getCurrent().equalsIgnoreCase(urlPage.P_BIENVENIDA)) {
			assertThat(bienvenidaPage.getMensaje()).contains(session);
		}else if(urlPage.getCurrent().equalsIgnoreCase(urlPage.p_desactivado(userName))){
			urlPage.desactivarUser();
			System.out.println("La Sesion existe del usuario - " + userName);
			urlPage.closeWindow();
		}else {
			System.out.println("Cerrar Browser Forzado");
			urlPage.closeWindow();
		}
		
	}
	
	@Step
	public void autenticacion(String usuario, String password) {
		loginPage.writeTextName(usuario);
		loginPage.writeTextPassword(password);
		loginPage.clickEntrar();
		urlPage.waitSeconds(5);
		if (urlPage.getCurrent().equalsIgnoreCase(urlPage.P_BIENVENIDA)) {
			//assertThat(bienvenidaPage.getMensaje()).contains("Angel Jhonatan Mamani");
			System.out.println("Inicio sesion correctamente");
		}else if(urlPage.getCurrent().equalsIgnoreCase(urlPage.p_desactivado(usuario))){
			urlPage.desactivarUser();
			urlPage.alertAccept();
			urlPage.waitSeconds(5);
			autenticacion(usuario,password);
			System.out.println("La sesion existe del usuario - " + userName);
		}else {
			urlPage.closeWindow();
			System.out.println("Cerrar la ventana de manera forzada");
		}
	}
	
}
