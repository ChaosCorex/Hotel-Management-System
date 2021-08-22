/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Chaos X
 */
public class Room {
    private int room_id;
    private Object capacity; 
    private boolean availability;
    private boolean isBooked = false;
    
    public Room(int room_id, Object capacity, boolean availability) {
        this.room_id = room_id;
        this.capacity = capacity;
        this.availability = availability;
    }
    
    public Room() {
        this.room_id = 0;
        this.capacity = "";
        this.availability = true;
    }

    public int getRoom_id() {
        return room_id;
    }

    public void setRoom_id(int room_id) {
        this.room_id = room_id;
    }

    public Object getCapacity() {
        return capacity;
    }

    public void setCapacity(Object capacity) {
        this.capacity = capacity;
    }

  
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
}
