package org.example.reader.scanners;

import lombok.AllArgsConstructor;
import org.example.model.Diagram;
import org.example.reader.EntregableReader;
import org.example.reader.Reader;

import java.util.Scanner;


public class DiagramReader extends EntregableReader implements Reader<Diagram> {
    private final Scanner scanner;

    public DiagramReader(Scanner scanner, Scanner scanner1) {
        super(scanner);
        this.scanner = scanner1;
    }

    @Override
    public Diagram read() {
        System.out.println("Introduce los datos del diagrama");

        String id = setId();

        String title = setTitle();

        boolean finalized = setFinalized();

        System.out.println("Formato: ");
        String format = scanner.nextLine();

        return new Diagram(id, title, finalized, format);
    }
}
