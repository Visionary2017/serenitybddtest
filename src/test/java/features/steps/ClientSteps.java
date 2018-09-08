package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ClienteSteps;
import features.steps.serenity.UserLoginSteps;
import net.thucydides.core.annotations.Steps;
import utilitario.UrlPages;

public class ClientSteps {
	
	UrlPages resource = new UrlPages();
	
	@Steps
	UserLoginSteps userLoginSteps;
	
	@Steps
	ClienteSteps clienteSteps;
	
	@Given("^ingreso a la opcion de clientes con el usuario \"([^\"]*)\" y \"([^\"]*)\"$")
	public void ingreso_a_la_opcion_de_clientes_con_el_usuario_y(String user, String password) {
	    // Write code here that turns the phrase above into concrete actions
		userLoginSteps.cargar_la_pagina_everilion();
		resource.waitSeconds(5);
		userLoginSteps.autenticacion(user, password);
		clienteSteps.ingresaOpcionClientesP();
	    System.out.println("ingreso a la opcion de clientes");
	}

	@Given("^completar los campos del cliente$")
	public void completar_los_campos_del_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		resource.waitSeconds(5);
		clienteSteps.loadClient();
		System.out.println("completar los campos del cliente");
	}

	@When("^guardar los datos ingresados$")
	public void guardar_los_datos_ingresados() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("guardar los datos clientes");
	}

	@Then("^visualizo en la lista de clientes$")
	public void visualizo_en_la_lista_de_clientes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("visualizar en la lista cliente");
		resource.waitSeconds(5);
		resource.logout();
	}

	@Given("^busco el cliente \"([^\"]*)\"$")
	public void busco_el_cliente(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("busco el cliente");
	}

	@When("^consulto cliente$")
	public void consulto_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("consulto cliente");
	}

	@Given("^modifico los campos del cliente$")
	public void modifico_los_campos_del_cliente() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("modifico al cliente");
	}

	@When("^guardo los cambios$")
	public void guardo_los_cambios() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("guardo los datos modificados clientes");
	}
	
}
