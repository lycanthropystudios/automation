package starter.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import starter.ui.category.CategoriesForm;
import starter.ui.login.LoginForm;
import starter.ui.search.SearchForm;

public class CreateCat implements Interaction {
    @Override
    public <T extends Actor> void performAs(T t) {
        Click.on(CategoriesForm.ADD_CATEGORY);
    }

    public static Performable addCat() {
        return Task.where("{0} attempts to search for #term",
                Click.on(CategoriesForm.ADD_CATEGORY)
        );
    }
}
