package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.regex.Pattern;

@Controller
@RequestMapping("/email")
public class EmailController {
    @RequestMapping("/page")
    public ModelAndView showPage() {
        return new ModelAndView("mail");
    }

    @PostMapping("")
    public ModelAndView isValidMail(@RequestParam String email, RedirectAttributes redirectAttributes) {
        System.out.println("post run!!!");
        ModelAndView modelAndView = new ModelAndView("redirect:/email/page");
        Pattern emailPattern = Pattern.compile("^[a-zA-Z0-9]+@[a-zA-Z0-9]+\\.[a-zA-Z0-9]+");
        if (emailPattern.matcher(email).matches()) {
            redirectAttributes.addFlashAttribute("message","Valid Email");
        } else {
            redirectAttributes.addFlashAttribute("message", "Invalid Email");
        }
        return modelAndView;
    }
}
