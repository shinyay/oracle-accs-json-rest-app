package com.sample.shinyay.rest.json;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by syanagih on 2016/12/31.
 */
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

    private Member(MemberBuilder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.birthday = builder.birthday;
        this.height = builder.height;
        this.weight = builder.weight;
        this.blood = builder.blood;
    }

    public Member(){
        Member member = new Member.MemberBuilder().id().build();
        this.id = member.getId();
        this.firstName = member.getFirstName();
        this.lastName = member.getLastName();
        this.age = member.getAge();
        this.height = member.getHeight();
        this.weight = member.getWeight();
        this.birthday = member.getBirthday();
        this.blood = member.getBlood();
    }

    public Member(long id, String lastName, String firstName,
                    int age, String birthday, int height, int weight, String blood){
        Member member = new MemberBuilder().id()
                .lastName(lastName)
                .firstName(firstName)
                .age(age)
                .birthday(birthday)
                .height(height)
                .weight(weight)
                .blood(blood)
                .build();
        this.id = member.getId();
        this.firstName = member.getFirstName();
        this.lastName = member.getLastName();
        this.age = member.getAge();
        this.birthday = member.getBirthday();
        this.height = member.getHeight();
        this.weight = member.getWeight();
        this.blood = member.getBlood();
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

    public static class MemberBuilder {
        private long id;
        private String firstName = "";
        private String lastName = "";
        private int age = 0;
        private String birthday = "";
        private int height = 0;
        private int weight = 0;
        private String blood ="";

        public MemberBuilder id() {
            this.id = Member.counter.getAndIncrement();
            return this;
        }

        public MemberBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public MemberBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public MemberBuilder age(int age) {
            this.age = age;
            return this;
        }

        public MemberBuilder height(int height) {
            this.height = height;
            return this;
        }

        public MemberBuilder weight(int weight) {
            this.weight = weight;
            return this;
        }

        public MemberBuilder birthday(String birthday) {
            this.birthday = birthday;
            return this;
        }

        public MemberBuilder blood(String blood) {
            this.blood = blood;
            return this;
        }

        public Member build() {
            return new Member(this);
        }

    }
}
