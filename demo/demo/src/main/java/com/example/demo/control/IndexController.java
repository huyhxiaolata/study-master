package com.example.demo.control;

import com.example.demo.bean.BlogProperties;
import com.example.demo.bean.BlogProperties2;
import com.example.demo.bean.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private BlogProperties2 blogProperties2;

    @Autowired
    private TestConfigBean testConfigBean;


    @GetMapping("/index")
    String index() {
        System.out.println(testConfigBean.getName()+"——"+testConfigBean.getAge());
        return blogProperties.getName()+"——"+blogProperties.getTitle()+"------"
                +blogProperties2.getName()+"——"+blogProperties2.getTitle()+"——"+blogProperties2.getWholeTitle();
    }
}
