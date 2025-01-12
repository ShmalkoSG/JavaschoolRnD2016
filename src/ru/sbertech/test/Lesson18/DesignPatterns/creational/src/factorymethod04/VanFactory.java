package factorymethod04;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import carsandengines.*;

public class VanFactory extends VehicleFactory {

    protected Vehicle selectVehicle(DrivingStyle style) {
        Vehicle selectedVehicle;

        if ((style.equals(DrivingStyle.ECONOMICAL)) ||
            (style.equals(DrivingStyle.MIDRANGE))) {
            selectedVehicle = new Pickup(new StandardEngine(2200));

        } else if (style.equals(DrivingStyle.POWERFUL)) {
            selectedVehicle = new BoxVan(new TurboEngine(2500));

        } else {
            throw new IllegalArgumentException("DrivingStyle not recognised");
        }

        return selectedVehicle;
    }

}
