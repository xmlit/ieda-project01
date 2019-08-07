package cn.itcast;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xml_t on 2019/8/4.
 */

@Controller
@ConfigurationProperties(prefix = "person")
public class FirstController {

    private String name;
    private int age;
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {

        return "name"+name+"age"+age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
