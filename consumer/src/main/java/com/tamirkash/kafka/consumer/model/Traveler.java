package com.tamirkash.kafka.consumer.model;

public class Traveler {
    private String name;
    private String destination;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Traveler{" + "name='" + name + '\'' + ", destination='" + destination + '\'' + '}';
    }
}