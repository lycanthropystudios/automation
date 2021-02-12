package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable dashboardPanel() {
        return Task.where("{0} opens the dashboard home page",
                Open.browserOn().the(DashboardPage.class)
        );
    }
    public static Performable theCategoryPanel() {
        return Task.where("{0} opens the Category page",
                Open.browserOn().the(CategoryPanel.class)
        );
    }
    public static Performable postPanel() {
        return Task.where("{0} opens the add post page",
                Open.browserOn().the(PostPage.class)
        );
    }
}