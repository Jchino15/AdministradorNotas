/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package administradornotas;

import java.util.Scanner;

/**
 *
 * @author Miguel Zelaya
 */
public class AdministradorNotas {

    /**
     * @param args the command line arguments
     */
<<<<<<< HEAD
    public static void main(String[] args) {
    
        //llamada al metodo promedio//
        Notas llamada2 = new Notas();
        llamada2.promedio();
        System.out.println("**********************************");
        //llamada al metodo alumno//
        Alumno llamada3 = new Alumno();
        llamada3.datos();
        System.out.println("**********************************");   

        Interfaz llamada = new Interfaz();
        llamada.menu();

        System.out.println("**********************************");
        llamada2.busquedaSecuencial();
        System.out.println("**********************************");
        llamada2.busquedaBinaria();

        valores arre = new valores();
        arre.arreglo();   
        
<<<<<<< HEAD
        //Variable polimorfica
        CaractetristicasAlumno objcaracteristicasA=new CaractetristicasAlumno();
        Alumno objAlumno[]=new Alumno[1];
        objAlumno[0]=objcaracteristicasA; 
        
        //Cast
        Alumno newAlumno = (Alumno) objcaracteristicasA;
        
        objAlumno[0].Salud();
        objAlumno[0].datos();
        
    }
    public static void ordenarPorSeleccion(double[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    double temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
=======
    }

=======
public static void main(String[] args) {
    //llamada al metodo promedio//
    Notas llamada2 =new Notas();
    llamada2.promedio();
    System.out.println("**********************************");
    //llamada al metodo alumno//
    Alumno llamada3 = new Alumno();
    llamada3.datos();
    System.out.println("**********************************");
    
    
    // El arreglo
    double[] arreglo = {10, 2.8, 1, 9.6, 5, 3, 7, 8, 3.3, 4};
    System.out.println("Arreglo antes de modificar");
    for (double i : arreglo) {
        System.out.print(i);
        System.out.println(" ");
    }
        
    Scanner lector = new Scanner(System.in);
    System.out.println("Cuantas notas desea agregar: ");
    int lim = lector.nextInt();
        
    for(int i=0;i < lim;i++){
    System.out.println("Digite la nota que sea agregar: ");
    arreglo [i] = lector.nextDouble();
    }
        
    System.out.println("En que posicion se encuentra la nota que desea eliminar: ");
    int elim = lector.nextInt();
    arreglo [elim] = 0;
    
        
    ordenarPorSeleccion(arreglo);

    System.out.println("Arreglo después de ordenar...");
    for (double i : arreglo) {
    System.out.print(i);
    System.out.println(" ");
    }
    System.out.println("**********************************");
    llamada2.busquedaSecuencial();
    System.out.println("**********************************");
    llamada2.busquedaBinaria();
    
    comparar c = new valores();
    
    Scanner buscar = new Scanner(System.in);
    System.out.print("Ingrese el primer numero a evaluar: ");
    double primer = buscar.nextDouble();
    
    System.out.print("Ingrese el segundo numero a evaluar: ");
    double segundo = buscar.nextDouble();
    
    if(primer > segundo){
        c.mayornota();
    }else{
        c.menornota();
>>>>>>> 41104876fab11aa88008c08af0d98900d6864a5d
    }
    
    Interfaz llamada = new Interfaz();
    llamada.menu();
}
>>>>>>> bc449767fd6cb2fa8ae1717be3e7a2d99fbdaeb4

    public static void ordenarPorSeleccion(double[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    double temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
}
