package org.example.model;

import lombok.Data;

@Data
public class Source extends Entregable {
    private String language;

    public Source(String id, String title, boolean finalized, String language) {
        super(id, title, finalized);
        this.language = language;
    }

    @Override
    public void run() {
        System.out.println("Compilando código en " + language + " y ejecutando test unitarios...");
    }
}
