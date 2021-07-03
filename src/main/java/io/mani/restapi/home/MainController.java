package io.mani.restapi.home;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

@RequestMapping("/topics")
public String HomePage() {
        return "All topics os course";
    }

    @RequestMapping("/about")
public String AboutPage() {
        return "This is About page mani !!!";
    }

    @RequestMapping("/contact")
    public String ContactUsPage() {
        return "This is Just for contacting us *******";
    }


}
