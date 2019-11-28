package Github.MercadoLibre.definitions;

import Github.MercadoLibre.steps.app_step;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class app_definition {
	
	@Steps
	app_step app_step;
	
	@Given("^Ingreso a navegador$")
	public void ingreso_a_navegador() throws Exception {
	    app_step.ingreso_a_navegador();
	}

	@When("^Seleccionar un pais \"([^\"]*)\"$")
	public void seleccionar_un_pais(String pais) throws Exception {
		app_step.seleccionar_un_pais(pais);
	}
	
	@When("^Ingresar a Login$")
	public void ingresar_a_Login() throws Exception {
		app_step.ingresar_a_Login();
	}
	
	@When("^Ingresar correo \"([^\"]*)\"$")
	public void ingresar_correo(String correo) throws Exception {
		app_step.ingresar_correo(correo);
	}

	@When("^Ingresar correo aleatorio \"([^\"]*)\"$")
	public void ingresar_correo_aleatorio(String dominio) throws Exception {
		app_step.ingresar_correo_aleatorio(dominio);
	}
	
	@When("^Ingresar contrasena \"([^\"]*)\"$")
	public void ingresar_contrasena(String contrasena) throws Exception {
		app_step.ingresar_contrasena(contrasena);
	}
	
	@When("^Ingresar dato de busqueda \"([^\"]*)\"$")
	public void ingresar_dato_de_busqueda(String dato) throws Exception {
		app_step.ingresar_dato_de_busqueda(dato);
	}
	
	@When("^Aplicar filtro$")
	public void aplicar_filtro() throws Exception {
		app_step.aplicar_filtro();
	}

	@Then("^Verificar que corresponda al pais seleccionado$")
	public void verificar_que_corresponda_al_pais_seleccionado() throws Exception {
		app_step.verificar_que_corresponda_al_pais_seleccionado();
	}

	@Then("^Verificar que el usuario no esté registrado$")
	public void verificar_que_el_usuario_no_esté_registrado() throws Exception {
		app_step.verificar_que_el_usuario_no_esté_registrado();
	}
	
	@Then("^Verificar que la clave sea incorrecta$")
	public void verificar_que_la_clave_sea_incorrecta() throws Exception {
		app_step.verificar_que_la_clave_sea_incorrecta();
	}
	
	@Then("^Verificar pop-up$")
	public void verificar_pop_up() throws Exception {
		app_step.verificar_pop_up();
	}

}
