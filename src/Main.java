import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        float[] numeros = new float[5];
        System.out.println("guardando los datos en el arreglo:");
        for (int i=0;i<5;i++){
            System.out.println((i+1)+"dijite un numero:");
            numeros[i] = ingresar.nextFloat();

        }
        System.out.println("/nimprimir los elementos del arreglo");
        for ( float i:numeros){
            System.out.println(i);
        }
    }
}