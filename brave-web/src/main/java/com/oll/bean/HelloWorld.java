package com.oll.bean;

import org.springframework.stereotype.Controller;

/**
 * @ClassName HelloWorld
 * @Description TODO
 * @Author Hanty
 * @Date 2020/9/28 14:20
 * @ModifyDate 2020/9/28 14:20
 * @Version 1.0
 */
@Controller
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
