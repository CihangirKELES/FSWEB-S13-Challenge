package org.example;

public class Company {
    private int id;
    private String name;
    private double giro;
    private String[] developerNames;

    //cons.
    public Company(int id, String name, double giro, String[] developerNames) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
        this.id = id;
        this.name = name;
        this.developerNames = developerNames;
    }

    //getter setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGiro() {
        return giro;
    }

    public void setGiro(double giro) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    //add employee method
    public void addEmployee(int index, String name) {
        if (index >= 0 && index < developerNames.length) {
            if (developerNames[index] == null) {
                developerNames[index] = name;
            } else {
                System.out.println("Index already has an employee.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    //toString
    @Override
    public String toString() {
        String developerNamesString = "{";
        for (int i = 0; i < developerNames.length; i++) {
            developerNamesString += developerNames[i] != null ? developerNames[i] : "null";
            if (i < developerNames.length - 1) {
                developerNamesString += ", ";
            }
        }
        developerNamesString += "}";
        return "Company{id=" + id + ", name='" + name + "', giro=" + giro + ", developerNames=" + developerNamesString + '}';
    }
}
