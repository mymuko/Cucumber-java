
package com.mycompany.loginpage;

import com.mycompany.basepage.BasePage;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    
    LoginPage() {
        PageFactory.initElements(driver, this);
    }

    void goToLoginPage() {
        driver.get(this.LOGIN_PAGE_URL);
    }
    
}
