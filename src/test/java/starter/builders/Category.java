package starter.builders;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.category.CategoriesForm;
import starter.ui.login.LoginForm;


public class Category implements Task {
    private String catName;
    private String status;
    private String vietnam;
    private String russian;
    private String arabic;
    private String farsi;
    private String turkish;
    private String french;
    private String spanish;
    private String german;

    public Category(String catName, String status, String vietnam, String russian, String arabic, String farsi, String turkish, String french, String spanish, String german) {
        this.catName = catName;
        this.status = status;
        this.vietnam = vietnam;
        this.russian = russian;
        this.arabic = arabic;
        this.farsi = farsi;
        this.turkish = turkish;
        this.french = french;
        this.spanish = spanish;
        this.german = german;
    }
    public static Category.CategoryWith with() {
        return new Category.CategoryWith();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Click.on(CategoriesForm.ADD_CATEGORY)
            );
            actor.attemptsTo(
                    Enter.theValue(catName).into(CategoriesForm.NAME_CATEGORY),
                    Enter.theValue(vietnam).into(CategoriesForm.VI_FIELD),
                    Enter.theValue(russian).into(CategoriesForm.RU_FIELD),
                    Enter.theValue(arabic).into(CategoriesForm.AR_FIELD),
                    Enter.theValue(farsi).into(CategoriesForm.FA_FIELD),
                    Enter.theValue(turkish).into(CategoriesForm.TR_FIELD),
                    Enter.theValue(french).into(CategoriesForm.FR_FIELD),
                    Enter.theValue(spanish).into(CategoriesForm.ES_FIELD),
                    Enter.theValue(german).into(CategoriesForm.DE_FIELD)
                    );
        actor.attemptsTo(
                Click.on(CategoriesForm.NEW_CAT)
        );
    }
    public static class CategoryWith {

        private String catName;
        private String status;
        private String vietnam;
        private String russian;
        private String arabic;
        private String farsi;
        private String turkish;
        private String french;
        private String spanish;
        private String german;

        public Category.CategoryWith and() {
            return this;
        }

        public Category.CategoryWith name(String catName) {
            this.catName = catName;
            return this;
        }

        public Category.CategoryWith status(String status) {
            this.status = status;
            return this;
        }

        public Category.CategoryWith vi(String vietnam) {
            this.vietnam = vietnam;
            return this;
        }

        public Category.CategoryWith ru(String russian) {
            this.russian = russian;
            return this;
        }

        public Category.CategoryWith ar(String arabic) {
            this.arabic = arabic;
            return this;
        }

        public Category.CategoryWith fa(String farsi) {
            this.farsi = farsi;
            return this;
        }

        public Category.CategoryWith tu(String turkish) {
            this.turkish = turkish;
            return this;
        }

        public Category.CategoryWith fr(String french) {
            this.french = french;
            return this;
        }

        public Category.CategoryWith es(String spanish) {
            this.spanish = spanish;
            return this;
        }

        public Category.CategoryWith de(String german) {
            this.german = german;
            return this;
        }

        public Performable addCategory() {
            return new Category( catName,  status,  vietnam,  russian,  arabic,  farsi,  turkish,  french,  spanish,  german);

        }

    }
}
