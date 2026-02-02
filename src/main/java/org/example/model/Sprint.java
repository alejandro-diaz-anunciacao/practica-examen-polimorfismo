package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Sprint<T extends Entregable> {
    private final String name;
    private final List<T> entregableList;
    
    public void execute() {
        System.out.println("Iniciando Sprint");
        for (T entregable: entregableList) {
            if (entregable != null) {
                entregable.run();
                entregable.setFinalized();
            }
        }
    }
}
