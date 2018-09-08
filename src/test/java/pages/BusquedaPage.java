package pages;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://automationpractice.com/index.php")
public class BusquedaPage extends PageObject {
	
    @FindBy(css = "input#search_query_top")
    private WebElementFacade txtSearch;

    @FindBy(css = "button[name='submit_search']")
    private WebElementFacade btnSearch;

    @FindBy(css = "i.icon-th-list")
    private WebElementFacade btnListView;

    public void writeText(String term){
    	typeInto(txtSearch, term);
    }

    public void clickSearch(){
        btnSearch.click();
    }

    public void clickList(){
        btnListView.click();
    }
    
}