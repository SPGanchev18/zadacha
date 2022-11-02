import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class dai {

    @RequestMapping("/home")
    public String home(){
        return "Welcome user";
    }

    @RequestMapping("/user")
    public String user(){
        return "User: Ilian Yanev <br> Age: 18 <br> From: Burgas";
    }

    @RequestMapping("/about")
    public String about(){
        return "Born 13.09.2004 in Burgas. Lives in Banevo.";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "unufri333@gmail.com";
    }

}