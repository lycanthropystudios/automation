package starter.ui.category;

import org.openqa.selenium.By;

public class CategoriesForm {
    public static By ADD_CATEGORY = By.cssSelector("button[data-target='#ADD_BLOG_CAT']");
    public static By NAME_CATEGORY = By.name("name");
    public static By STATUS_DROPDOWN = By.name("status");
    public static By VI_FIELD = By.name("translated[vi][name]");
    public static By RU_FIELD = By.name("translated[ru][name]");
    public static By AR_FIELD = By.name("translated[ar][name]");
    public static By FA_FIELD = By.name("translated[fa][name]");
    public static By TR_FIELD = By.name("translated[tr][name]");
    public static By FR_FIELD = By.name("translated[fr][name]");
    public static By ES_FIELD = By.name("translated[es][name]");
    public static By DE_FIELD = By.name("translated[de][name]");
    public static By NEW_CAT =  By.cssSelector("button[type='submit']");


}
