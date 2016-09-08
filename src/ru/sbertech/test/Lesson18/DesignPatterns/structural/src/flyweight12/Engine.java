package flyweight12;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

import java.awt.*;

public interface Engine {

    // Methods having intrinsic (i.e. shared) state
    public int getSize();
    public boolean isTurbo();

    // Methods having extrinsic (i.e. unshared) state
    public void drawDiagram(Component c, Graphics g);

}
