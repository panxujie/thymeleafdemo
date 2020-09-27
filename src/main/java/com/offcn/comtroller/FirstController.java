package com.offcn.comtroller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Controller
public class FirstController {

    @RequestMapping("/hello")
    public String indexPage(Model model){
        String message="this is thymeleaf!";
        model.addAttribute("message",message);
        return "index";
    }
    @RequestMapping("/showUser")
    public String showUser(Model model){
        model.addAttribute(new User("20001","xiaobai",12));
        return "showUser";
    }
    @RequestMapping("/showMap")
    public String showMap(Model model){
        Map<String,Object> map = new HashMap<>();
        map.put("id","2003");
        map.put("name","xioanf");
        map.put("age",15);
        model.addAttribute("map",map);
        return "showMap";

    }

    @RequestMapping("/show")
    public String showUserList(Model model){
        ArrayList<User> list = new ArrayList<>();
        list.add(new User("20001","xiaobai",12));
        list.add(new User("20002","adnyf",34));
        list.add(new User("20003","asdfa",16));
        model.addAttribute("list",list);
        return "show";
    }
    @RequestMapping("showString")
    public String showString(Model model){
        model.addAttribute("name","小兰");
        model.addAttribute("href","http://www.baidu.com");
        String msg = "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\\r\\n\" + \n" +
                "\t  \t\t\"Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\\r\\n";
        model.addAttribute("msg",msg);
        return "showString";
    }
}
