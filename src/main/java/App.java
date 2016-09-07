import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/hello.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
      Map model = new HashMap();
      model.put("template", "templates/favorite_photos.vtl" );
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }
}
