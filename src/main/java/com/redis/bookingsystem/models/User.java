package com.redis.bookingsystem.models;

import jakarta.persistence.*;



@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
  //  private String userName;
    //private int age;

 /*   @OneToMany (mappedBy = "user")
    private Set<Reservation> reservations ;

    public long getId_nr() {
        return id_nr;
    }

    public void setId_nr(long id_nr) {
        this.id_nr = id_nr;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

*/


}
