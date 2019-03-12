package com.gupao.study.pattern.prototype;

import java.io.Serializable;

/**
 * @Author chenghu
 * @Descripion TODO
 * @Date
 * @Version 1.0
 **/
public class Person implements Serializable {

    /** 姓名 */
    private String name;

    /** 年龄 */
    private Integer age;

    /** 性别 */
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }
}
