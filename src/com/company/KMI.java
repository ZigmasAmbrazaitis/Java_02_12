package com.company;

public class KMI {
    private float a;
    private float b;

    public KMI(float pirmas, float antras) {
        a = pirmas;
        b = antras;
    }

    public float skaiciuokKMI() {
        return a / (b * b);
    }
}
