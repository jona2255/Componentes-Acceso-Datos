package org.example;

import Ex2.AlumnePerAssignatura;
import Ex2.NouProfessor;
import ExGuiat.Comanda;
import ExGuiat.Producte;
import Ex1.Mates;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        // Ejercicio Guiado

        Producte nouProducte = new Producte(1,"Prana abc.234", 10, 3, 16);
        Comanda novaComanda = new Comanda();

        nouProducte.addPropertyChangeListener(novaComanda);
        nouProducte.setStockActual(2);

        if (novaComanda.isDemanar()){
            System.out.println("Realitzar comanda a producte: " + nouProducte.getDescripcio());
        } else {
            System.out.println("No es necesari realitzar comanda a producte: " + nouProducte.getDescripcio());

        }

        // Ejercicio 1

        Scanner scanner = new Scanner(System.in);

        List<Integer> listaNumeros = new ArrayList<>();

        System.out.println("¿Cuantos números quieres introducir?");
        int nums = scanner.nextInt();
        System.out.println("Introducelos");
        for (int i = 0; i < nums; i++) {

            listaNumeros.add(scanner.nextInt());
        }

        Mates mates = new Mates(listaNumeros);

        mates.media();
        mates.moda();
        mates.suma();

        // Ejercicio 2

        // El límite de alumnos para un solo profesor es 34, al llegar a 35 se necesitan 2 profesores.

        AlumnePerAssignatura alumnePerAssignatura = new AlumnePerAssignatura(20,1);
        NouProfessor nouProfessor = new NouProfessor();

        alumnePerAssignatura.addPropertyChangeListener(nouProfessor);
        alumnePerAssignatura.setInscrits(35);

        if (nouProfessor.isDemanar()){
            System.out.println("Es necesario cambiar a los profesores: " + alumnePerAssignatura.getInscrits() + " Alumnos y " + alumnePerAssignatura.getNumProfesores() + " Profesores");
        } else {
            System.out.println("No es necesario cambiar a los profesores: " + alumnePerAssignatura.getInscrits() + " Alumnos y " + alumnePerAssignatura.getNumProfesores() + " Profesores");

        }


    }
}
