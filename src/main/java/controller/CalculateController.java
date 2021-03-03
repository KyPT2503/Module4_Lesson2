package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/calculate")
public class CalculateController {
    @GetMapping("/page")
    public ModelAndView showPage() {
        return new ModelAndView("calculator");
    }

    @PostMapping("")
    public ModelAndView cal(@RequestParam double number1, @RequestParam double number2, RedirectAttributes redirectAttributes, @RequestParam(name = "operation", required = false, defaultValue = "+") String operation) {
        ModelAndView modelAndView = new ModelAndView("redirect:/calculate/page");
        double result = 0;
        if (operation.equals("+")) {
            result = number1 + number2;
        } else if (operation.equals("-")) {
            result = number1 - number2;
        } else if (operation.equals("*")) {
            result = number1 * number2;
        } else if (operation.equals("/")) {
            result = number1 / number2;
        }
        redirectAttributes.addFlashAttribute("result", result);
        return modelAndView;
    }
}
