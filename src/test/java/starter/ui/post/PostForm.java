package starter.ui.post;

import org.openqa.selenium.By;

public class PostForm {

    public static By TITLE_FIELD = By.name("title");
    public static By SLUG_FIELD = By.name("status");
    public static By STATUS_FIELD = By.name("status");
    public static By CATEGORY_DROP = By.cssSelector("option[value='20']");
    public static By RELATED_FIELD = By.className("select2-choices");
    public static By RELATED_OP = By.className("select2-result-label");
    public static By THUMB_FIELD = By.name("defaultphoto");
    public static By KEYWORDS_FIELD = By.name("keywords");
    public static By META_FIELD = By.name("metadesc");
    public static By SOURCE_BTN =  By.cssSelector("a[title='Source']");
    public static By TEXT_FIELD =  By.cssSelector("textarea[dir='ltr']");
    public static By ADD_CATEGORY = By.cssSelector("button[data-target='#ADD_BLOG_CAT']");
    public static By NEW_POST =  By.cssSelector("button[type='submit']");
}
