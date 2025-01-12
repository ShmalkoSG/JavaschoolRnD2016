package decorator10;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public abstract class AbstractVehicle implements Vehicle {

    private Engine engine;
    private Vehicle.Colour colour;

    public AbstractVehicle(Engine engine) {
        this(engine, Vehicle.Colour.UNPAINTED);
    }

    public AbstractVehicle(Engine engine, Vehicle.Colour colour) {
        super();
        this.engine = engine;
        this.colour = colour;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public void paint(Vehicle.Colour colour) {
        this.colour = colour;
    }

    public Vehicle.Colour getColour() {
        return this.colour;
    }

    public abstract double getPrice();

    public String toString() {
        return (this.getClass().getSimpleName() +
                "[" + 
                "engine=" + this.getEngine().toString() +
                ", colour=" + this.getColour() +
                ", price=" + this.getPrice() +
                "]");
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (! (other instanceof Vehicle)) return false;
        Vehicle otherVehicle = (Vehicle) other;
        return (this.toString().equals(otherVehicle.toString()));
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

}
