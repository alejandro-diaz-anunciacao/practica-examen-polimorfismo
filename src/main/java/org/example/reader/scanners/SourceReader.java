package org.example.reader.scanners;

import lombok.AllArgsConstructor;
import org.example.model.Source;
import org.example.reader.EntregableReader;
import org.example.reader.Reader;

import java.util.Scanner;

public class SourceReader extends EntregableReader implements Reader<Source> {
    private final Scanner scanner;

    public SourceReader(Scanner scanner, Scanner scanner1) {
        super(scanner);
        this.scanner = scanner1;
    }

    @Override
    public Source read() {
        System.out.println("Introduce los datos del Código fuente");
        String id = setId();

        String title = setTitle();

        boolean finalized = setFinalized();

        System.out.println("Lenguaje: ");
        String language = scanner.nextLine();

        return new Source(id, title, finalized, language);

    }
}
