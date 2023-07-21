
package Interfaz;


public class Class2_AlumnoRegular extends Form4_AlumnoRegular{
    
    public String MostrarAlumnoRegular(){
        return "DATOS DEL ALUMNO REGULAR: "
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------"
                +"\nDocumento de Identidad: "+dniOCarnet
                +"\nGrado: "+grado
                +"\nNivel: "+nivel
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------";
    }
}
