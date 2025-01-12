package chainofresponsibility14;

/*
 *  Java Design Pattern Essentials
 *  Copyright 2010, Ability First Limited
 *
 *  This source code is provided to accompany the book and is provided AS-IS without warranty of any kind.
 *  It is intended for educational and illustrative purposes only, and may not be re-published
 *  without the express written permission of the publisher.
 */

public class SpamEmailHandler extends AbstractEmailHandler {

    protected String[] matchingWords() {
        return new String[]{"viagra", "pills", "medicines"};
    }

    protected void handleHere(String email) {
        System.out.println("This is a spam email.");
    }

}
