package org.example.SantiagoM;

import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        Scanner keyEntry = new Scanner(System.in);
        Integer menuOption;
        String colorLindo = "\u001B[36m";


        System.out.println("\n*******************");
        System.out.println("****** Uribe APP ******");
        System.out.println("*********************");

        System.out.println(colorLindo + "\n👕 Bienvenido a gestor de prendas...\n");
        System.out.println("🔎 ¿Qué quieres realizar?");
        System.out.println("1️⃣ Guardar una prenda en BD 🗄️");
        System.out.println("2️⃣ Mostrar el inventario de prendas 📦");
        System.out.println("3️⃣ Modificar datos de una prenda ✏️");
        System.out.println("4️⃣ Eliminar una prenda del sistema ❌");
        System.out.println("5️⃣ Presiona 5 para salir 🚪");

        while(menuOption!=5){
            System.out.println("Oe");
        }


    }
}
