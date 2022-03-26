package com.example;

import com.example.annotation.Transform;
import com.example.annotation.JsonElement;
import com.example.annotation.JsonSerializable;

@JsonSerializable
public class Person {

    @JsonElement
    private String firstName;

    @JsonElement
    private String lastName;

    @JsonElement(key = "personAge")
    private String age;

    private String address;

    @Transform
    private void initNames() {
        this.firstName = this.firstName.substring(0, 1).toUpperCase()
            + this.firstName.substring(1);
        this.lastName = this.lastName.substring(0, 1).toUpperCase()
            + this.lastName.substring(1);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
