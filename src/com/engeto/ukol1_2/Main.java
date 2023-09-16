package com.engeto.ukol1_2;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        String JmenoPrijmeni  = "Karel Franta";
        LocalDate DatumNarozeni = LocalDate.of(2000,4,7);
        int Pocetsmluv = 5;
        double Celkmonzstvi = 48;
        String Adresa = "Brno";
        String SPZvozidla = "3B1 567";
        double Spotrebavozidla = 10.5;
        String IPadresa = "192.168. 0.1.";

        double Prodprumer = Celkmonzstvi/Pocetsmluv;

        System.out.println("Průměrné množství prodané mrkve na jednu smlouvu je: "+Prodprumer);

    }




}