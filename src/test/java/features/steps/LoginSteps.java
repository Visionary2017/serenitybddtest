package features.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import features.steps.serenity.ClienteSteps;
import features.steps.serenity.UserLoginSteps;
import net.thucydides.core.annotations.Steps;
import utilitario.UrlPages;

public class LoginSteps {

	UrlPages urlPage = new UrlPages();
	
	@Steps
	UserLoginSteps userLoginSteps;
	
	@Steps
	ClienteSteps clienteSteps;
	
	
	@Given("^ingresar a la pagina de Everilion$")
	public void ingresar_a_la_pagina_de_Everilion() {
	    // Write code here that turns the phrase above into concrete actions
	    userLoginSteps.cargar_la_pagina_everilion();
	}


	@Given("^que he ingresado el nombre de usuario \"([^\"]*)\"$")
	public void que_he_ingresado_el_nombre_de_usuario(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    userLoginSteps.ingresa_name(arg1);
	}

	@Given("^que he ingresado la contrasenia \"([^\"]*)\"$")
	public void que_he_ingresado_la_contrasenia(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    userLoginSteps.ingresa_password(arg1);
	}

	@When("^realizar click entrar$")
	public void realizar_click_entrar() {
	    // Write code here that turns the phrase above into concrete actions
	    userLoginSteps.ingresa_plataforma_everilion();
	}

	@Then("^se visualiza la pagina de bienvenida con el nombre \"([^\"]*)\"$")
	public void se_visualiza_la_pagina_de_bienvenida_con_el_nombre(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
	    userLoginSteps.valida_nombre_session(arg1);
	}
	
}
