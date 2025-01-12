package bridge08;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SportControls extends AbstractDriverControls {

    public SportControls(Engine e) {
        super(e);
    }

    public void accelerateHard() {
        this.accelerate();
        this.accelerate();
    }

}
