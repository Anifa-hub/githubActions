import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Sort {
    public static void main(String[] args){
        Page page = Playwright.create().chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false)
        ).newPage();

        page.navigate("https://practicesoftwaretesting.com/");
        Locator sort = page.locator("//select[@aria-label='sort']");
        sort.selectOption("name,as");

        page.close();

    }
}
