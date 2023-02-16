package org.example;

public class Familia {

    public Animal papa;
    public Animal mama;
     public Animal hijo;



    public Familia() {
    }

    public Familia( Animal papa, Animal mama) {
        this.papa = papa;
        this.mama = mama;

    }

    public Familia(Animal papa, Animal mama, Animal hijo) {
        this.papa = papa;
        this.mama = mama;
        this.hijo = hijo;
    }



    public void imprimirFamilia(){

        //Este metodo muestra los nombres de los integrantes de la familia
        System.out.println(
                "El papá es: "+this.papa.getNombre() +
                        "\nLa mamá es: "+this.mama.getNombre()+
                            "\nEl hijo es: "+this.hijo.getNombre()
        );

    }

    public void tenerHijo(String nombre){
        
        if(this.mama.getPareja()!=null){

            Animal hijo= new Animal();
            hijo.setNombre(nombre);
            hijo.setPeso(1);
            double random = Math.random();
            if(random<0.5){
                hijo.setGenero("F");
            }else{
                hijo.setGenero("M");
            }
            this.hijo=hijo;

        }else{
            System.out.println("Aun no puedes tener hijos");
        }


    }




}
