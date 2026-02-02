package org.example.model;

public class Diagram extends Entregable{
    private String format;

    public Diagram(String id, String title, boolean finalized, String format) {
        super(id, title, finalized);
        this.format = format;
    }

    @Override
    public void run() {
        System.out.println("Exportando diagrama a formato " + format + " y generando vista previa...");
    }
}
