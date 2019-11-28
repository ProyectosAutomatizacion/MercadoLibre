package Github.MercadoLibre.steps;

import Github.MercadoLibre.pageObjects.app_pageObject;
import net.thucydides.core.annotations.Step;

public class app_step {
	
	app_pageObject app_pageObject;
	
	@Step
	public void ingreso_a_navegador() {
		app_pageObject.open();
	}
	
	@Step
	public void seleccionar_un_pais(String pais) throws Exception {
		app_pageObject.seleccionar_un_pais(pais);
	}
	
	@Step
	public void ingresar_a_Login() throws Exception {
		app_pageObject.ingresar_a_Login();
	}
	
	@Step
	public void ingresar_correo_aleatorio(String dominio) throws Exception {
		app_pageObject.ingresar_correo_aleatorio(dominio);
	}
	
	@Step
	public void ingresar_correo(String correo) throws Exception {
		app_pageObject.ingresar_correo(correo);
	}
	
	@Step
	public void ingresar_contrasena(String contrasena) throws Exception {
		app_pageObject.ingresar_contrasena(contrasena);
	}
	
	@Step
	public void ingresar_dato_de_busqueda(String dato) throws Exception {
		app_pageObject.ingresar_dato_de_busqueda(dato);
	}
	
	@Step
	public void aplicar_filtro() throws Exception {
		app_pageObject.aplicar_filtro();
	}
	
	@Step
	public void verificar_que_corresponda_al_pais_seleccionado() throws Exception {
		app_pageObject.verificar_que_corresponda_al_pais_seleccionado();
	}
	
	@Step
	public void verificar_que_el_usuario_no_esté_registrado() throws Exception {
		app_pageObject.verificar_que_el_usuario_no_esté_registrado();
	}
	
	@Step
	public void verificar_que_la_clave_sea_incorrecta() throws Exception {
		app_pageObject.verificar_que_la_clave_sea_incorrecta();
	}
	
	@Step
	public void verificar_pop_up() throws Exception {
		app_pageObject.verificar_pop_up();
	}
	
}
