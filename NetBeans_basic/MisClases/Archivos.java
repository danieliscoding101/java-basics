
package clase14.MisClases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivos {
    public void GuardarDatos(Estudiante nuevo){
    try{
        //IMPORTAMOS LIBRERÍAS
        File f = new File("Estudiante.txt");
        FileWriter fw;
        BufferedWriter bw;
        if (f.exists()) {
            fw = new FileWriter(f, true); //IMPORTANTE LA OPCIÓN TRUE
            bw = new BufferedWriter(fw);
            bw.newLine();
            bw.close();
        
        }
        fw = new FileWriter(f, true); //COPIADO 
            bw = new BufferedWriter(fw);
            bw.write(nuevo.dni+ ";"+ nuevo.nombre+ ";" +nuevo.nota1 + ";"+ nuevo.nota2);
            bw.close();
            
            
            
    }catch (Exception e){
        System.out.println("Error al guardar los datos...");
    }
    
}
    
    public void LeerDatos(){
        try{
        File f = new File("Estudiante.txt");
            FileReader fr;
            BufferedReader br;
            if(f.exists()){
                fr = new FileReader(f);
                br = new BufferedReader(fr);
                String linea;
                Estudiante est;
                est = new Estudiante();
                System.out.println("____________________________________________________");
                System.out.println("DNI:          Nombre:      Nota1:      Nota2:    ");
                System.out.println("_____________________________________________________");
            
            while((linea = br.readLine())!= null){
                String[] arrayLinea = linea.split(";");
                est.dni = arrayLinea[0];
                est.nombre = arrayLinea[1];
                est.nota1 = Integer.parseInt(arrayLinea[2]);
                est.nota2= Integer.parseInt(arrayLinea[3]);
                
                System.out.printf("%s\t%s\t\t%d\t%d\t\n", est.dni, est.nombre
                , est.nota1, est.nota2);
                
//                System.out.println(est.dni + "   "+
//                        est.nombre+"      "+
//                        est.nota2);
//                
                
            }
                System.out.println("_________________________");
                
            }   
        
        
        }catch( Exception e){
            System.out.println("Error al leer los datos...");
            
            
        }

}
}
    

