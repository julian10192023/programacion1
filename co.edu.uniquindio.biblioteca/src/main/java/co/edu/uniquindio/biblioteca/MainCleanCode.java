package co.edu.uniquindio.biblioteca;

import co.edu.uniquindio.biblioteca.model.Libro;

public class MainCleanCode {

    public static void main(String[] args) {
        gestionarLibros();
    }
    private static void gestionarLibros() {
        //crear los 5 libros
        Libro libro1 = new Libro();
        libro1.setTitulo("Algoritmia 1");
        libro1.setGenero("Software");
        libro1.setAutor("Pedro perez");
        libro1.setAnioPublicacion(2022);
        libro1.setEditorial("UQ");
        libro1.setNumeroPagina(100);

        Libro libro2 = new Libro();
        libro2.setTitulo("Programacion 2");
        libro2.setGenero("Software");
        libro2.setAutor("Ana sofia henao");
        libro2.setAnioPublicacion(2021);
        libro2.setEditorial("Norma");
        libro2.setNumeroPagina(200);

        Libro libro3 = new Libro();
        libro3.setTitulo("Crepusculo");
        libro3.setGenero("Terror");
        libro3.setAutor("Any");
        libro3.setAnioPublicacion(2015);
        libro3.setEditorial("Norma");
        libro3.setNumeroPagina(250);

        Libro libro4 = new Libro();
        libro4.setTitulo("Cálculo integral");
        libro4.setGenero("Estudio");
        libro4.setAutor("Carlos arias");
        libro4.setAnioPublicacion(2022);
        libro4.setEditorial("UQ");
        libro4.setNumeroPagina(100);

        Libro libro5 = new Libro();
        libro5.setTitulo("Harry Potter");
        libro5.setGenero("Magia");
        libro5.setAutor(" J. K. Rowling");
        libro5.setAnioPublicacion(1997);
        libro5.setEditorial("AS");
        libro5.setNumeroPagina(325);

        //Obtener la cantidad de libros donde el título empiece por una vocal y consonante.
        calcularVocalesYConsonantes(libro1, libro2, libro3, libro4, libro5);

        //Modificar libro
        String tituloActual = "Cálculo integral";
        String titulonNuevo = "Cálculo integral y diferencial";
        modificarLibroPorTitulo(libro1, libro2, libro3, libro4, libro5, tituloActual, titulonNuevo);
    }

    public static void calcularVocalesYConsonantes(Libro libro1,
                                                   Libro libro2,
                                                   Libro libro3,
                                                   Libro libro4,
                                                   Libro libro5){
        int contadorVocal = 0;
        int contadorConsonante = 0;

        if(esVocal(libro1.getTitulo().charAt(0))){
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }

        if(esVocal(libro2.getTitulo().charAt(0))){
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }

        if(esVocal(libro3.getTitulo().charAt(0))){
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }

        if(esVocal(libro4.getTitulo().charAt(0))){
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }

        if(esVocal(libro5.getTitulo().charAt(0))){
            contadorVocal = contadorVocal + 1;
        }else{
            contadorConsonante = contadorConsonante + 1;
        }
        System.out.println("Cantidad de vocales es: "+ contadorVocal);
        System.out.println("Cantidad de consonantes es: "+ contadorConsonante);
    }

    private static void modificarLibroPorTitulo(Libro libro1,
                                                Libro libro2,
                                                Libro libro3,
                                                Libro libro4,
                                                Libro libro5,
                                                String tituloActual,
                                                String titulonNuevo) {
        if(libro1.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro1.setTitulo(titulonNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+libro1.getTitulo());
        }

        if(libro2.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro2.setTitulo(titulonNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+libro2.getTitulo());
        }

        if(libro3.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro3.setTitulo(titulonNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+libro3.getTitulo());
        }

        if(libro4.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro4.setTitulo(titulonNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+libro4.getTitulo());
        }

        if(libro5.getTitulo().equalsIgnoreCase(tituloActual)) {
            libro5.setTitulo(titulonNuevo);
            System.out.println("Libro encontrado con el nuevo titulo: "+libro5.getTitulo());
        }
    }

    private static boolean esVocal(char caracter) {
        if(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U'){
            return true;
        }else{
            return false;
        }
    }

    public static void crearVariables(){
        int edad = 25;
        double precio = 2000.5;
        boolean estado = true;
        String concatenado = "Mi edad es: "+ edad+ " y gano \n: "+precio+ " y estoy"+estado;
        System.out.println(concatenado);
    }
}

