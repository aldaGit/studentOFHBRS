package org.hbrs.se.ws20.uebung1.control;

public class Factory {

    public Translator createTranslator() {
        return new GermanTranslator();
    }

}
