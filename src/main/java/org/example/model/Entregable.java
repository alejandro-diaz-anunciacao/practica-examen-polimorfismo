package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Entregable implements Reproducible {
    private final String id;
    private final String title;
    private boolean finalized;

    @Override
    public abstract void run();

    public void setFinalized() {
        if (finalized) {
            System.out.println("El entregable " + title + " ya estaba finalizado");
        } else {
            this.finalized = true;
        }
    }
}
