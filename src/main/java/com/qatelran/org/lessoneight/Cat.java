package com.qatelran.org.lessoneight;

public class Cat {

    private int age;

    private String name;

    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        //1
        if (this == obj) {
            return true;
        }
        //2
        if(obj == null) {
            return false;
        }
        //3
        if(!(obj instanceof Cat)){
            return false;
        }
        //4
        Cat cat = (Cat) obj;
        return (this.name.equals(cat.name) && this.age == cat.age);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
