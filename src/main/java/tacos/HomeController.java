package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by user on 16.10.2019.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/test")
    public String  testtest(){
        return "testhome";
    }

    @GetMapping("/test22")
    public String  testtest22(){
        return "testhome";
    }

}
