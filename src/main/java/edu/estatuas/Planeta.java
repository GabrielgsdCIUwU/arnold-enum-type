package edu.estatuas;

import java.util.EnumSet;

public enum Planeta {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS  (8.686e+25, 2.5559e7),
    NEPTUNE (1.024e+26, 2.4746e7);

    private final double G = 6.67300e-11; // Gravitational constant

    private final double masa; // Kg
    private final double radio; //m
    private Planeta(double masa, double radio) {
        this.masa = masa;
        this.radio = radio;
    }

    public double getMasa() {
        return masa;
    }
    public double getRadio() {
        return radio;
    }

    private double getGravedadSuperficie() {
        return G * masa / (radio * radio);
    }

    private double getGravedadSuperficie(Planeta planeta) {
        return G * planeta.masa / (planeta.radio * planeta.radio);
    }

    private double getMasaObject(double peso) {
        return peso / getGravedadSuperficie(Planeta.EARTH);
    }

    public double pesoSuperficie(double peso) {
        return getMasaObject(peso) * getGravedadSuperficie();
    }

    public static EnumSet<Planeta> getPlanetasTerrestres() {
        return EnumSet.range(MERCURY, MARS);
    }

    public static EnumSet<Planeta> getGigantesGaseosos() {
        return EnumSet.complementOf(getPlanetasTerrestres());
    }
} 
