package com.oracle.jp.shinyay.rest.json;

import java.util.concurrent.atomic.AtomicLong;

public class Member {

    private final long id;
    private final String firstName;
    private final String lastName;
    private final int age;
    private final String birthday;
    private final int height;
    private final int weight;
    private final String blood;

    private static final AtomicLong counter = new AtomicLong(100);

    public static class Builder {
        private final String firstName;
        private final String lastName;
        private final int age;
        private final String birthday;
        private final int height;
        private final int weight;
        private final String blood;

        private long id;

        public Builder(String firstName,
                       String lastName,
                       int age,
                       String birthday,
                       int height,
                       int weight,
                       String blood) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.birthday = birthday;
            this.height = height;
            this.weight = weight;
            this.blood = blood;
            this.id = Member.counter.getAndIncrement();

        }
        public Member build() {
            return new Member(this);
        }
    }

    private Member(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.height = builder.height;
        this.weight = builder.weight;
        this.blood = builder.blood;
    }

    public long getId(){
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() { return this.age; }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getBirthday(){
        return this.birthday;
    }

    public String getBlood() { return this.blood; }

    @Override
    public String toString(){
        return "ID: " + id
                + " 姓: " + lastName
                + " 名: " + firstName+ "\n"
                + "年齢: " + age + "\n"
                + "誕生日 " + birthday + "\n"
                + "身長: " + height
                + " 体重: " + weight + "\n"
                + "血液型" + blood;
    }
}