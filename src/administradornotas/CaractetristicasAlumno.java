/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administradornotas;

<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 41104876fab11aa88008c08af0d98900d6864a5d
/**
 *
 * @author Miguel Zelaya
 */
public class CaractetristicasAlumno extends Alumno {
    private double peso;
    private double altura;
    private int IQ;

    public CaractetristicasAlumno(double peso, double altura,int iq) {
        this.peso = peso;
        this.altura = altura;
        this.IQ=iq;
    }
    public int getIQ() {
        return IQ;
    }

    public void setIQ(int IQ) {
        this.IQ = IQ;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public CaractetristicasAlumno()
    {
        super();
    }
    //Metodo para mostrar las caracteristicas del alumno
    public void DestresasCarac()
    {
        String nombre=this.getNombres();
        String apellido=this.getApellidos();
        
        if(getIQ()==110)
        {
            System.out.println(nombre+apellido+"Alumno con una inteligencia arriba de la media... Capaz de tener un aprendizaje acelerado");
        }
        if(getIQ()<110)
        {
            System.out.println(nombre+apellido+"Alumno con una inteligencia promedio o bajo el promedio... Se necesita ayudarle en ciertos ambitos para desarrollar sus habilidades");
            
        }
        if(getIQ()>120)
        {
            System.out.println(nombre+apellido+"Alumno dotado con una gran capacidad de inteligencia... Capaz de sobresalir en todas las areas en las que se especialicé");
        }
        
    }
<<<<<<< HEAD
    @Override
    public void datos()
    {
        ArrayList info = new ArrayList();
        info.add("Gerson");
        info.add("Argueta");
        info.add("18");
        info.add("15641216-4");
        System.out.println("Su información es: ");
        System.out.println(info);
    }
    //Metodo para saber la salud del alumno 
    @Override
=======
    //Metodo para saber la salud del alumno 
>>>>>>> 41104876fab11aa88008c08af0d98900d6864a5d
    public void Salud()
        {
            double IMC=getPeso()/(getAltura()*getAltura());
            if(IMC<18.5)
            {
                System.out.println("Tiene bajo peso");
            }
            if(IMC>+18.5 && IMC<=24.9)
            {
                System.out.println("Peso Saludable");
            }
            if(IMC>25.00)
            {
                System.out.println("Tiene Sobrepeso");
            }
        }
<<<<<<< HEAD
    
=======
>>>>>>> 41104876fab11aa88008c08af0d98900d6864a5d
}
