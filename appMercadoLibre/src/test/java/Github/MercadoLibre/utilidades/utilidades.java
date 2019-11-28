package Github.MercadoLibre.utilidades;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;

public class utilidades extends PageObject {

	public void clickElement(String xpath) {
		find(By.xpath(xpath)).click();
	}

	public void escribirElement(String xpath, String texto) {
		find(By.xpath(xpath)).sendKeys(texto);
	}

	public String leerElement(String xpath) {
		String texto = find(By.xpath(xpath)).getText();
		return texto;
	}

	public void limpiarElement(String xpath) {
		find(By.xpath(xpath)).clear();
	}

	public void enterElement(String xpath) {
		find(By.xpath(xpath)).sendKeys(Keys.ENTER);
	}

	public void selecElement(String xpath, String numLinea) {
		Select lista = new Select(find(By.xpath(xpath)));
		lista.selectByValue(numLinea);
	}

	public void escribirEnterElement(String xpath, String texto, Keys enter) {
		find(By.xpath(xpath)).sendKeys(texto);
	}

	public void esperarElement(String xpath) {
		WebDriverWait obj = new WebDriverWait(getDriver(), 90);
		obj.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
	}

	public String correoAleatorio(String dominio) {
		String nombre = RandomStringUtils.randomAlphabetic(8);
		String correo = nombre + dominio;
		return correo;
	}

	public String contrasenaAleatoria() {
		String contrasena = RandomStringUtils.randomAlphabetic(8);
		return contrasena;
	}


}
