
package Interfaz;

public class Class1_AlumnoNuevo extends Form3_AlumnoNuevo{
    
    
    public String MostrarAlumnoNuevo(){
        return "DATOS DEL ALUMNO NUEVO: "
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------"
                +"\nNombre: "+nombres
                +"\nApellido: "+apellidos
                +"\nDocumento de Identidad: "+dniOCarnet
                +"\nTelefono del padre o apoderado: "+telefono
                +"\nDireccion del domicilio: "+direccion
                +"\nCorreo del padre o apoderado: "+correo
                +"\nGrado: "+grado
                +"\nNivel: "+nivel
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------";
    }
}
