import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dzien dobry");
        //typy proste
        //zmienne a nie obiekty
        //male litery
        //typy calkowite
        byte liczba1 = 124;
        short liczba2 = 12345;
        int liczba3 = 123456;
        long liczba4 = 123456789;
        System.out.println("Liczba całkowita " + liczba4);
        //typy zmiennoprzecinkowe
        float liczba5 = 23.65f; //na koncu f
        double liczba6 = 235.5654;
        //typ logiczny
        boolean czyPrawda = true; //false
        //typ znakowy
        char znak = 'a';

        //wylosuj liczbe z zakresu od 1 do 100
        //zgadnij wylosowana liczbe wpisujac ja z klawiatury

        int wylosowanaLiczba = (int) (Math.random() * 100 + 1);//rzutowanie
        double wylosowana2 = wylosowanaLiczba;
        System.out.println("Wulosowano " + wylosowanaLiczba);
        // odczyt z klawiatury
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int wpisanaLiczba = scanner.nextInt();
        System.out.println("Wpisano " + wpisanaLiczba);
        //instrukcja warunkowa
        if (wpisanaLiczba == wylosowanaLiczba) {
            System.out.println("Brawo, trafione");
        } else {
            System.out.println("Pudlo");
        }
        int roznica;
        if(wylosowanaLiczba > wpisanaLiczba){
            roznica = wylosowanaLiczba - wpisanaLiczba;
        }else{
            roznica = wpisanaLiczba - wylosowanaLiczba;
        }
        //wyrazenie warunkowe -> zwraca wartosc
        roznica = wylosowanaLiczba>wpisanaLiczba?wylosowanaLiczba-wpisanaLiczba:wpisanaLiczba-wylosowanaLiczba;
        System.out.println("Pomyliles sie o "+ roznica);
    }
}