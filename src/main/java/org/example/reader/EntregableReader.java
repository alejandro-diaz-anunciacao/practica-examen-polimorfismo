package org.example.reader;

import lombok.AllArgsConstructor;

import java.util.Scanner;

@AllArgsConstructor
public abstract class EntregableReader {
    private final Scanner scanner;

    protected String setId() {
        System.out.println("ID: ");
        String id = scanner.nextLine();
        return id;
    }

    protected String setTitle() {
        System.out.println("Título: ");
        String title = scanner.nextLine();
        return title;
    }

    protected boolean setFinalized() {
        boolean finalized;
        int option = 0;

        do {
            System.out.println("¿Esta finalizado?");
            System.out.println("1. Sí");
            System.out.println("2. No");
            option = scanner.nextInt();
            scanner.nextLine();
            if (option != 1 || option != 2) {
                System.out.println("Carácter nó valido");
            }
        } while (option != 1 || option != 2);

        if (option == 1) {
            finalized = true;
        } else {
            finalized = false;
        }

        return finalized;
    }
}
