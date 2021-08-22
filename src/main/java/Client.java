/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaos X
 */
public class Client {
    private String name;
    private String phone_number;
    private int id;
    private int duration;
    private int room_id;
    private int age;
    private float paybill;

    public Client(String name, String phone_number, int id, int duration, int room_id, int age, float paybill) {
        this.name = name;
        this.phone_number = phone_number;
        this.id = id;
        this.duration = duration;
        this.room_id = room_id;
        this.age = age;
        this.paybill = paybill;
    }

    public Client() {
        this.name = "";
        this.phone_number = "";
        this.id = 0;
        this.duration = 0;
        this.room_id = 0;
        this.age = 0;
        this.paybill = 0;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getPaybill() {
        return paybill;
    }

    public void setPaybill(float paybill) {
        this.paybill = paybill;
    }

}
