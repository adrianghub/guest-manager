package com.company;

import java.util.ArrayList;
import java.util.List;

public class Fiesta {
    private List<String> guests = new ArrayList<>();

    public List<String> getGuests() {
        return guests;
    }

    public void addGuest(String name) {
        guests.add(name);
    }
}
