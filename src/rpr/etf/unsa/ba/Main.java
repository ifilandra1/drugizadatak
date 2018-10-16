package rpr.etf.unsa.ba;
import java.util.Scanner;

public class Main {

    public static  int sumacifara(int broj) {

int suma=0, pomocni=broj;
        while(pomocni>0) {
            suma+=pomocni%10;
            pomocni/=10;
        }
return suma;

    }

    public static void main(String[] args) {

System.out.println("Unesite broj n: ");
Scanner scan= new Scanner (System.in);
int n=scan.nextInt();

for(int i=1;i<=n;i++) {
    if( i%sumacifara(i)==0   )System.out.println(i);

}

    }
}
