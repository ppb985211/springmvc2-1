package cap.controller;

import cap.bean.Admin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


public class HelloController {
    @RequestMapping(value = "hello", method = RequestMethod.POST)
        public String hello(@ModelAttribute("admin") Admin admin){
            return "result2";
        }

        @RequestMapping(value="hi/{name}",method=RequestMethod.GET)
    public ModelAndView sayHi(@PathVariable("name") String name) {
            ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("admin", admin);
        modelAndView.setViewName("result2");
        modelAndView.addObject("name", name);
        modelAndView.setViewName("welcome");
        return modelAndView;
    }
}
