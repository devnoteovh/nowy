package ovh.devnote.nowy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        int a=1;
        a=a+1;
        System.out.println(a);
        long l =2147483649L;

        //int[] tab = new int[(int) l];
        //System.out.println( Integer.parseInt(Long.toString(l)));

        char c='c';
        // String s = new String();
        String s="123";
        System.out.println(s);

        double d= 10.2;
        float f=10.2f;

        Scanner sc = new Scanner(System.in);

//        System.out.println("podaj wiek ");
//
//        String line = sc.nextLine();
//
//        int wiek = Integer.parseInt(line);
//        System.out.println("podaj wage ");
//        line = sc.nextLine();
//        double waga = Double.parseDouble(line);
//
//        char c1 =  sc.nextLine().charAt(0);

        int[] tablica = new int[10];
        for(int i=0;i<tablica.length;i++){

             tablica[i]=i;
        }

        for(int i=0;i<tablica.length;i++){
            if(i>5) {
                System.out.println(tablica[i]);
                System.out.println("dodatkowy napis");
            }
            else{
                System.out.println("mniejsze od indexu 5");
            }
        }


        int j=10;
        do{
            System.out.println(j);
        }while(j<10);

        System.out.println("podaj plec" );
        String plec = sc.nextLine();

        if ( plec.equals("kobieta")){
            //...
        }

        switch (plec){
            case "kobieta" :{ System.out.println("plec to kobieta");break; }
            case "mezczyzna" :{ System.out.println("plec to mezczyzna");break; }
            default: System.out.println("inna plec");
        }


        for(int i=0;i<tablica.length;i++){
             if( i>6)break;
            System.out.println(tablica[i]);
        }

        for(int i=0;i<tablica.length;i++){
            if( i>6)continue;
            System.out.println(tablica[i]);
        }

        for(int i=0;i<tablica.length;i++){
            if( i==6)break;
            System.out.println(tablica[i]);
        }

        for(int i=0;i<tablica.length;i++){
            if( i==6)continue;
            System.out.println(tablica[i]);
        }

    }

}
