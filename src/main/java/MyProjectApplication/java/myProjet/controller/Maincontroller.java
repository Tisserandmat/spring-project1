package MyProjectApplication.java.myProjet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
class MainController {
    @GetMapping("/greetings")
    @ResponseBody
    public String index() {

        return "Greetings from Spring Boot!";

    }

    @GetMapping("/doctor/1")
    @ResponseBody
    public String doc() {

        return "William Hartnell";

    }

    @GetMapping("/doctor/10")
    @ResponseBody
    public String doc10() {

        return "David Tennant";

    }

    @GetMapping("/doctor/13")
    @ResponseBody
    public String doc13() {

        return "Jodie Whittaker";

    }


}
