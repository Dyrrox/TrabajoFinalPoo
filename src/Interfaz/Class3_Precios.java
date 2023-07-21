
package Interfaz;

abstract class Class3_Precios {

    
    int CalcularMatricula(String Nivel, String Grado){
        int Matricula[][] = {{330, 330, 330, 330, 330, 330}, {350, 350, 350, 350, 350}};
        int Monto, N=0, G=0;
        if("PRIMARIA".equals(Nivel)){
            N = 0;
        }
        if("SECUNDARIA".equals(Nivel)){
            N = 1;
        }
        
        if("PRIMERO".equals(Grado)){
            G = 0 ;
        }
        if("SEGUNDO".equals(Grado)){
            G = 1 ;
        }
        if("TERCERO".equals(Grado)){
            G = 2 ;
        }
        if("CUARTO".equals(Grado)){
            G = 3 ;
        }
        if("QUINTO".equals(Grado)){
            G = 4 ;
        }
        if("SEXTO".equals(Grado)){
            G = 5 ;
        }
        Monto = Matricula[N][G];
        return Monto;
    }
}
