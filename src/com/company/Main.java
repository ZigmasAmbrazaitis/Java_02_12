package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1.6.​ Parašyti programą, kuri leistų vartotojui įvesti savo masę ir ūgį, pagal gautus duomenis
        // paskaičiuotų ir atvaizduotų jo kūno masės indeksą.
        // KMI = masė (kg) / (ūgis(m))^2
        // 1.12​. Pakeiskite 1.6.​ programos kodą, KMI skaičiavimo metodą perkelkite į naujai sukurtą
        // klasę. Įvesti parametrai turi būti perduoti per konstruktorių ir sukurtas metodas turi
        // apskaičiuto KMI, bet pačiam metodui perduoti parametrų nebereikia.
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo svori(kg): ");
        int mase = sc.nextInt();
        System.out.println("Iveskite savo ugi(metrais): ");
        float ugis = sc.nextFloat();
        KMI objektas = new KMI((float) mase, ugis);
        System.out.println("Jusu KMI yra: " + objektas.skaiciuokKMI());
    }
}
