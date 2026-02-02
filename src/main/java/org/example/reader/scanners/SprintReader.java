package org.example.reader.scanners;

import lombok.AllArgsConstructor;
import org.example.model.Entregable;
import org.example.model.Sprint;
import org.example.reader.Reader;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@AllArgsConstructor
public class SprintReader<T extends Entregable> implements Reader<Sprint<T>> {
    private final Scanner scanner;
    private final Reader<T> entregableReader;

    @Override
    public Sprint<T> read() {
        System.out.println("Introduce los datos del sprint");

        System.out.println("Nombre: ");
        String name = scanner.nextLine();

        System.out.println("Cúantos entregables tiene");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        List<T> entregablesList = new ArrayList<>();

        for (int i = 0; i < quantity ; i++) {
            entregablesList.add(entregableReader.read());
        }

        return new Sprint<>(name, entregablesList);
    }
}
