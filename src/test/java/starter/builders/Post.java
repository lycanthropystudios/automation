package starter.builders;

import javafx.geometry.Pos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.selectactions.SelectByIndexFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByVisibleTextFromElement;
import org.openqa.selenium.Keys;
import starter.ui.category.CategoriesForm;
import starter.ui.login.LoginForm;
import starter.ui.post.PostForm;

import java.io.Console;


public class Post implements Task {
    private String title;
    private String link;
    private String status;
    private String category;
    private String related;
    private String thumb;
    private String keyw;
    private String desc;
    private String text;

    public Post(String title, String link, String status, String category, String related, String thumb, String keyw, String desc, String text) {
        this.title = title;
        this.link = link;
        this.status = status;
        this.category = category;
        this.related = related;
        this.thumb = thumb;
        this.keyw = keyw;
        this.desc = desc;
        this.text = text;
    }

    public static Post.PostWith with() {
        return new Post.PostWith ();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(title).into(PostForm.TITLE_FIELD),
                Enter.theValue(link).into(PostForm.SLUG_FIELD),
                Enter.theValue(status).into(PostForm.STATUS_FIELD),
                Click.on(PostForm.RELATED_FIELD),
                Click.on(PostForm.RELATED_OP),
                //Enter.theValue(related).into(PostForm.RELATED_FIELD),
                Click.on(PostForm.CATEGORY_DROP),
                Enter.theValue(thumb).into(PostForm.THUMB_FIELD),
                Click.on(PostForm.SOURCE_BTN),
                Enter.theValue(text).into(PostForm.TEXT_FIELD),
                Enter.theValue(keyw).into(PostForm.KEYWORDS_FIELD),
                Enter.theValue(desc).into(PostForm.META_FIELD)
        );
        actor.attemptsTo(
                Click.on(PostForm.NEW_POST)
        );
    }

    public static class PostWith{
        private String title;
        private String link;
        private String status;
        private String category;
        private String related;
        private String thumb;
        private String keyw;
        private String desc;
        private String text;

        public Post.PostWith and() {
            return this;
        }

        public Post.PostWith ti(String title) {
            this.title = title;
            return this;
        }
        public Post.PostWith lk(String link) {
            this.link = link;
            return this;
        }
        public Post.PostWith sta(String status) {
            this.status = status;
            return this;
        }
        public Post.PostWith cat(String category) {
            this.category = category;
            return this;
        }
        public Post.PostWith rel(String related) {
            this.related = related;
            return this;
        }
        public Post.PostWith thu(String thumb) {
            this.thumb = thumb;
            return this;
        }
        public Post.PostWith key(String keyw) {
            this.keyw = keyw;
            return this;
        }
        public Post.PostWith des(String desc) {
            this.desc = desc;
            return this;
        }
        public Post.PostWith txt(String text) {
            this.text = text;
            return this;
        }

        public Performable addPost() {
            return new Post( title, link,  status,  category,  related,  thumb,  keyw,  desc,  text);
        }
    }

}
