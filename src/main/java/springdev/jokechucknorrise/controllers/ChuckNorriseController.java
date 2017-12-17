package springdev.jokechucknorrise.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import springdev.jokechucknorrise.services.ChuckNorriseQuotesService;

/**
 * Created by oleht on 16.12.2017
 */

@Controller
public class ChuckNorriseController {

    @Autowired
    private ChuckNorriseQuotesService service;

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("jokeData", service.getChcksQuot());

        return "jokeTemp";
    }

}
