import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {

  public static void main(String[] args) {
    staticFileLocation("/public");
    
    get("/", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/hello.vtl");
    }, new VelocityTemplateEngine());

    get("/favorite_photos", (request, response) -> {
      return new ModelAndView(new HashMap(), "templates/favorite_photos.vtl");
    }, new VelocityTemplateEngine());

  }
}
