package com.example.scholar_gql_poc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Scholar
{

    @Id
    private String id;
    private String name;
    private int number;
    private String email;
    private String address;
    private int age;

    public Scholar()
    {

    }

    public String getId ()
    {
        return id;
    }

    public Scholar (
        String id,
        String name,
        int number,
        String email,
        String address,
        int age)
    {
        this.id = id;
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public int getNumber ()
    {
        return number;
    }

    public void setNumber (int number)
    {
        this.number = number;
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public int getAge ()
    {
        return age;
    }

    public void setAge (int age)
    {
        this.age = age;
    }
}
