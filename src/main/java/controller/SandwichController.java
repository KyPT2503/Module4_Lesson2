package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ModelAndView save(@RequestParam("condiment") String[] condiment) {
        ModelAndView modelAndView = new ModelAndView("sandwich");
        modelAndView.addObject("condiment", condiment);
        return modelAndView;
    }

    @GetMapping("")
    public ModelAndView showSandwichPage() {
        return new ModelAndView("sandwich");
    }
}
