
package Interfaz;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Class4_Pago extends Class3_Precios{
    String nombres;
    String apellidos;
    long dniOCarnet;
    String grado;
    String nivel;
    long Tarjeta;
    String Fecha;
    int Cvv;
    double pMatricula;

    public Class4_Pago (String nombres, String apellidos, long dniOCarnet, String grado, String nivel, long Tarjeta, String Fecha, int Cvv){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dniOCarnet = dniOCarnet;
        this.grado = grado;
        this.nivel = nivel;
        this.Tarjeta = Tarjeta;
        this.Fecha = Fecha;
        this.Cvv = Cvv;
        this.pMatricula = CalcularMatricula(nivel, grado);
    }
    
    
    
    public static String FechaActual(){
        Date Fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(Fecha);
    }
    
    public String MostrarPagoN(){
        
        return "DATOS DEL PAGO EFECTUADO: "
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------"
                +"\n"+FechaActual()
                +"\nNombre del alumno: "+nombres
                +"\nApellido del alumno: "+apellidos
                +"\nDocumento del alumno: "+dniOCarnet
                +"\nGrado del alumno: "+grado
                +"\nNivel del alumno: "+nivel
                +"\n----------------------------------------------------------"
                +"\nPrecio de matricula: "+pMatricula
                +"\n----------------------------------------------------------";
    }
    
    public String MostrarPagoR(){
        FechaActual();
        return "DATOS DEL PAGO EFECTUADO: "
                +"\n----------------------------------------------------------"
                +"\n----------------------------------------------------------"
                +"\n"+FechaActual()
                +"\nDocumento del alumno: "+dniOCarnet
                +"\nGrado del alumno: "+grado
                +"\nNivel del alumno: "+nivel
                +"\n----------------------------------------------------------"
                +"\nPrecio de matricula: "+pMatricula
                +"\n----------------------------------------------------------";
    }
}
