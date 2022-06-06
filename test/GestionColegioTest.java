/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import colegio.Alumno;
import colegio.Curso;
import colegio.Docente;
import colegio.GestionColegio;
import colegio.Matricula;
//import org.junit.Test;
//import static org.junit.Assert.*;
import org.junit.Test;
import static junit.framework.Assert.assertEquals;



/**
 *
 * @author Miguel Zelaya
 */
public class GestionColegioTest {
    
    public GestionColegioTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
     @Test
    public void testAgregarAlumno() {
        System.out.println("agregarAlumno");
        Alumno unAlumno = null;
        GestionColegio.agregarAlumno(unAlumno);
        
    }

    /**
     * Test of agregarDocente method, of class GestionColegio.
     */
    @Test
    public void testAgregarDocente() {
        System.out.println("agregarDocente");
        Docente unDocente = null;
        GestionColegio.agregarDocente(unDocente);
        
    }

    /**
     * Test of agregarCurso method, of class GestionColegio.
     */
    @Test
    public void testAgregarCurso() {
        System.out.println("agregarCurso");
        Curso unCurso = null;
        GestionColegio.agregarCurso(unCurso);
        
    }

    /**
     * Test of agregarMatricula method, of class GestionColegio.
     */
    @Test
    public void testAgregarMatricula() {
        System.out.println("agregarMatricula");
        Matricula unaMatricula = null;
        GestionColegio.agregarMatricula(unaMatricula);
        
    }

    /**
     * Test of existeAlumno method, of class GestionColegio.
     */
    @Test
    public void testExisteAlumno() {
        System.out.println("existeAlumno");
        String identificacion = "";
        boolean expResult = false;
        boolean result = GestionColegio.existeAlumno(identificacion);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of existeDocente method, of class GestionColegio.
     */
    @Test
    public void testExisteDocente() {
        System.out.println("existeDocente");
        String identificacion = "";
        boolean expResult = false;
        boolean result = GestionColegio.existeDocente(identificacion);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of obtenerAlumnoPorIdentificacion method, of class GestionColegio.
     */
    @Test
    public void testObtenerAlumnoPorIdentificacion() {
        System.out.println("obtenerAlumnoPorIdentificacion");
        String identificacion = "";
        Alumno expResult = null;
        Alumno result = GestionColegio.obtenerAlumnoPorIdentificacion(identificacion);
        assertEquals(expResult, result);
        
    }

    /**
     * Test of existeCurso method, of class GestionColegio.
     */
    @Test
    public void testExisteCurso() {
        System.out.println("existeCurso");
        String codigo = "";
        boolean expResult = false;
        boolean result = GestionColegio.existeCurso(codigo);
        assertEquals(expResult, result);
        //negativa
    }

    /**
     * Test of estaMatriculado method, of class GestionColegio.
     */
    @Test
    public void testEstaMatriculado() {
        System.out.println("estaMatriculado");
        Matricula unaMatricula = null;
        boolean expResult = false;
        boolean result = GestionColegio.estaMatriculado(unaMatricula);
        assertEquals(expResult, result);
        //negativa
    }

    /**
     * Test of actualizarDocente method, of class GestionColegio.
     */
    @Test
    public void testActualizarDocente() {
        System.out.println("actualizarDocente");
        Docente unDocente = null;
        GestionColegio.actualizarDocente(unDocente);
        //negativa
    }
    
}
