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
   );

   get("/favorite_photos", (request, response) ->
    "<!DOCTYPE html>" +
      "<html>" +
      "<head>" +
        "<title>Hello Friend!</title>" +
        "<link rel='stylesheet'  href='https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css'>" +
      "</head>" +
      "<body>" +
       "<h1>Favorite Traveling Photos</h1>" +
          "<ul>" +
            "<li><img src='/images/foggymountain.jpeg' alt='A photo of a mountain.'/></li>" +
            "<li><img src='/images/rockycoast.jpeg' alt='A photo of a a rocky beach.'/></li>" +
          "</ul>" +
      "</body>" +
      "</html>"
    );

  }
}
