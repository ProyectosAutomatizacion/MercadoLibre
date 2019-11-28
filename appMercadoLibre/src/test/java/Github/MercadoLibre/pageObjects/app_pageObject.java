package Github.MercadoLibre.pageObjects;

import org.openqa.selenium.By;
import Github.MercadoLibre.utilidades.utilidades;
import junit.framework.Assert;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl ("http://mercadolibre.com")
public class app_pageObject extends PageObject{

	//WebDriverWait wait = new WebDriverWait(getDriver(), 10);
	utilidades uti;
	String pais, errorUsuario, errorClave, correoAleatorio, contenidoAdultos;
	
	String selectPaisAleatorio = "//*[@id=\"pais\"]";
	String selectPaisAleatorioAux = "//*[@id=\"pais\"]";
	String txtIngresa = "//*[@id=\"nav-header-menu\"]/a[2]";
	String txtUsuario = "//*[@id=\"user_id\"]";
	String txtClave = "//*[@id=\"password\"]";
	String txtMensajeCorreo = "//*[@id=\"login_user_form\"]/div[1]/div[1]/div/label/span/span/div/div";
	String txtMensajeClave = "//*[@id=\"login_user_form\"]/div[1]/div[2]/div[2]/div";
	String btnContinuar = "//*[@id=\"login_user_form\"]/div[2]/input";
	String btnIngresar = "//*[@id=\"action-complete\"]";
	String txtCompararPais = "/html/body/footer/div/div[1]/div";
	String txtDato = "/html/body/header/div/form/input";
	String btnBuscar = "/html/body/header/div/form/button/div";
	String txtMensajeAdultos = "//*[@id=\"root-app\"]/section/div/div[1]/h2";
	String btnCategorias = "/html/body/header/div/div[2]/div/ul/li[2]/a";

	
	public void seleccionar_un_pais(String pais) throws Exception {

		selectPaisAleatorio = selectPaisAleatorioAux;
		selectPaisAleatorio = selectPaisAleatorio.replace("pais", pais);
		uti.clickElement(selectPaisAleatorio);
	}
	
	public void ingresar_a_Login() throws Exception {
		Thread.sleep(1000);
		uti.clickElement(txtIngresa);
	}
	
	public void ingresar_correo_aleatorio(String dominio) throws Exception {
		Thread.sleep(1000);
		find(By.id(txtUsuario)).isVisible();
		correoAleatorio = uti.correoAleatorio(dominio);
		uti.escribirElement(txtUsuario, correoAleatorio);
		uti.clickElement(btnContinuar);
	}
	
	public void ingresar_correo(String correo) throws Exception {
		uti.escribirElement(txtUsuario, correo);
		uti.clickElement(btnContinuar);
	}
	
	public void ingresar_contrasena(String contrasena) throws Exception {
		contrasena = uti.contrasenaAleatoria();
		uti.escribirElement(txtClave, contrasena);
		uti.clickElement(btnIngresar);
	}
	
	public void ingresar_dato_de_busqueda(String dato) throws Exception {
		uti.escribirElement(txtDato, dato);
		uti.clickElement(btnBuscar);
	}
	
	public void aplicar_filtro() throws Exception {
		
	}
	
	public void verificar_que_el_usuario_no_esté_registrado() throws Exception {
		errorUsuario = uti.leerElement(txtMensajeCorreo);
		System.out.println(errorUsuario);
		Assert.assertEquals(errorUsuario, "Revisa tu e-mail o usuario.");

	}
	
	public void verificar_que_la_clave_sea_incorrecta() throws Exception {
		errorClave = uti.leerElement(txtMensajeClave);
		System.out.println("======================================\n"+errorClave);
		Assert.assertEquals(errorClave, "Completa este paso para continuar.");
	}
	
	public void verificar_que_corresponda_al_pais_seleccionado() throws Exception {
		System.out.println("=============================================================");
		String contenido = find(By.xpath(txtCompararPais)).getText();
		
		if (selectPaisAleatorio.contains("CL")) {
			pais = "Chile";
		}else if (selectPaisAleatorio.contains("CO")) {
			pais = "Colombia";
		}else if (selectPaisAleatorio.contains("CR")) {
			pais = "Costa Rica";
		}else if (selectPaisAleatorio.contains("EC")) {
			pais = "Ecuador";
		}else if (selectPaisAleatorio.contains("MX")) {
			pais = "México";
		}else if (selectPaisAleatorio.contains("PE")) {
			pais = "Perú";
		}else if (selectPaisAleatorio.contains("UY")) {
			pais = "Uruguay";
		}else if (selectPaisAleatorio.contains("VE")) {
			pais = "Venezuela";
		}else {
			pais = "No se pudo validar si corresponde al pais seleccionado";
		}
		System.out.println("Resultado: "+contenido+"\nPais: "+pais);
		System.out.println("EL pais seleccionado "+pais
		+" corresponde a la seleccion inicial"
		+ "\n=============================================================");
		Assert.assertTrue(contenido.contains(pais));
	}
	
	public void verificar_pop_up() throws Exception {
		contenidoAdultos = uti.leerElement(txtMensajeAdultos);
		System.out.println("======================================\n"+contenidoAdultos);
		Assert.assertEquals(contenidoAdultos, "Ver resultados para Adultos");
	}
	
	
	
}
