package com.prueba.Banitsmo.userinterfaces;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Iterator;


@DefaultUrl("https://www.aerocivil.gov.co/")
public class ElementosDOM extends PageObject {
    WebDriver driver = new ChromeDriver();
    public static final Target BTNTRANSPARENCIA = Target.the("Dar clic en la opción “Transparencia” del menú:").located(By.xpath("//*[@id=\"zz2_RootAspMenu\"]/li[7]/a/span/span"));
    public static final Target BTNPRESUPUESTO = Target.the("btnprestamos").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_ctl01__ControlWrapper_RichHtmlField\"]/table[2]/tbody/tr[5]/td/a"));

    public static final Target BTNESTADOFINANCIERO = Target.the("HAce click sobre el boton Estado Financiero").located(By.xpath("//*[@id=\"ctl00_PlaceHolderMain_MenuThirdLevel\"]/ul/li[3]/a"));
    public static final Target BTNBALANCE = Target.the("HAce click sobre l boton de balnce").located(By.xpath("//*[@id=\"WebPartWPQ10\"]/div[1]"));
    public static final Target BTNVISUALIZARPDF= Target.the("Visualizar el pdf").located(By.xpath("//*[@id=\"paging_container3\"]/ul/li[2]/div/div/div/a[1]"));
}