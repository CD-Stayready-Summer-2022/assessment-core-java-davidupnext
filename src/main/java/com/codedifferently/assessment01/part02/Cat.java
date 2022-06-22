package com.codedifferently.assessment01.part02;

public class Cat extends Pet {
    /**
     * @param name name of this Cat
     * @param age age of this Cat
     */
    private String CatName;
    private Integer age;

    public Cat(String name, Integer age) {

        super(name,age);
        this.age = age;
        this.CatName = name;
    }

    /**
     * @param age age of this Cat
     */
    public Cat(Integer age) {

        super(age);
        this.age = age;
    }

    /**
     * @param name name of this Cat
     */
    public Cat(String name) {
        super(name);
        this.CatName = name;

    }

    /**
     * nullary constructor
     * by default, a Cat's
     * name is CatName
     * age is 0
     */
    public Cat() {
        super();
    }

    /**
     * @return meow as a string
     */
    public String speak() {
        //String meow = "meow";
        return "Meow";
    }
}
