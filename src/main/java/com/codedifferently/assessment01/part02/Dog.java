package com.codedifferently.assessment01.part02;

public class Dog extends Pet {

    /**
     * @param name name of this Dog
     * @param age age of this dog
     */
    private String DogName;
    private Integer age;
    public Dog(String name, Integer age) {

        super(name, age);
        this.DogName = name;
        this.age = age;
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {

        super(age);
        this.age = age;
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super(name);
        this.DogName = name;

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog() {
        super();

        String name = DogName;
        Integer age = 0;

    }

    /**
     * @return bark as a string
     */
    public String speak() {
        String bark = "Bark";
        return bark;
    }
}
