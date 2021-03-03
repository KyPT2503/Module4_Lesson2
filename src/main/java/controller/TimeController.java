package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Date;
import java.util.TimeZone;

@Controller
@RequestMapping("/time")
public class TimeController {
    @GetMapping("/page")
    public ModelAndView showPage() {
        return new ModelAndView("time");
    }

    @PostMapping("")
    public ModelAndView doPost(RedirectAttributes redirectAttributes, @RequestParam String country) {
        ModelAndView modelAndView = new ModelAndView("redirect:/time/page");
        Date date = new Date();
        TimeZone timeZoneLocal = TimeZone.getDefault();
        TimeZone timeZoneCountry = TimeZone.getTimeZone(country);
        long time = date.getTime() + (timeZoneCountry.getRawOffset() - timeZoneLocal.getRawOffset());
        date.setTime(time);
        redirectAttributes.addFlashAttribute("message", date);
        return modelAndView;
    }
}
