package com.example.demo.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mrbird.blog")
public class BlogProperties2 {
    private String name;
    private String title;
    private String wholeTitle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWholeTitle() {
        return wholeTitle;
    }

    public void setWholeTitle(String wholeTitle) {
        this.wholeTitle = wholeTitle;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BlogProperties2{");
        sb.append("name='").append(name).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", wholeTitle='").append(wholeTitle).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

