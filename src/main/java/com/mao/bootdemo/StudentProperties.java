package com.mao.bootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Mingpeidev
 * @date 2021/10/26 15:07
 * @description Component：表明当前类是一个 Java Bean
 * ConfigurationProperties(prefix = "student")：表示获取前缀为 student 的配置信息
 */
@Component
@ConfigurationProperties(prefix = "student")
public class StudentProperties {
    private String name;
    private String age;
    private String content;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
