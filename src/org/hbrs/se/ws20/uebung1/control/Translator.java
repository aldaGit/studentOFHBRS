package org.hbrs.se.ws20.uebung1.control;

/**
 * Das Translator Interface. Die Anzahl der Methoden ist fix
 * und darf nicht erweitert werden.
 * @author saschaalda
 *
 */

public interface Translator {
	
	double version = 1.0;
	
	/*
	 * Uebersetzt eine numerische Zahl in eine String-basierte
	 * Repraesentation gemaess der Spezifikation in der Aufgabe 1-2 
	 */
	String translateNumber(int number);

} 








