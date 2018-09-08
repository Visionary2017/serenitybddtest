package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ClienteSteps;
import features.steps.serenity.UserLoginSteps;
import net.thucydides.core.annotations.Steps;
import utilitario.UrlPages;

public class TarjetaSteps {

	UrlPages urlPage = new UrlPages();
	
	@Steps
	UserLoginSteps userLoginSteps;
	
	@Steps
	ClienteSteps clienteSteps;
	
	@Given("^ingresa a la opcion de clientes con el usuario \"([^\"]*)\" y \"([^\"]*)\"$")
	public void ingresa_a_la_opcion_de_clientes_con_el_usuario_y(String arg1, String arg2) {
		userLoginSteps.cargar_la_pagina_everilion();
		urlPage.waitSeconds(5);
		userLoginSteps.autenticacion(arg1,arg2);
		clienteSteps.ingresa_la_opcion_clientes();
	    System.out.println("Ingreso a la opcion de clientes.");
	}


	@Given("^buscar por nombre cliente que contiene \"([^\"]*)\"$")
	public void buscar_por_nombre_cliente_que_contiene(String arg1) {
		urlPage.waitSeconds(5);
		clienteSteps.filtro_cliente(arg1);
		clienteSteps.search();
		System.out.println("visualiza la lista de clientes.");
	}

	@When("^visualizar la ventana de tarjetas$")
	public void visualizar_la_ventana_de_tarjetas() {
		urlPage.waitSeconds(5);
		clienteSteps.selectClient();
		
		urlPage.waitSeconds(5);
		clienteSteps.openWindowTarjeta();
		
		urlPage.waitSeconds(5);
		urlPage.selectWindow();
		urlPage.alertAccept();

		System.out.println("Visualizar la ventana de tarjeta del cliente seleccionado.");
	}
	
	@When("^ingresar datos$")
	public void ingresar_datos() {
		System.out.println("ingresa los datos de prueba.");
	}

	@Then("^cerrar la ventana de tarjetas$")
	public void cerrar_la_ventana_de_tarjetas() {

		urlPage.waitSeconds(5);
		urlPage.closeWindow();
		
		urlPage.waitSeconds(5);
		urlPage.selectWindow();
		urlPage.logout();
		System.out.println("Cerrar la ventana");
	}
	
}
