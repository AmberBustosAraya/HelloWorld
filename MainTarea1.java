/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maintarea1;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class MainTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[] args) {
        // TODO code application logic here
        String nombre = "";
        nombre = JOptionPane.showInputDialog("Digite su nombre:");
        double SSemanal;
        double TotalSin;
        double TotalCon;
        double TotalDeduc;
        //Solicitamos el dato
        SSemanal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su salario semanal"));
        //Asignamos el dato solicitado en las variables con sus respectivos metodos
        TotalCon=(deducciones(SSemanal));
        TotalSin=(NoDeducciones(SSemanal));
        TotalDeduc = (((SSemanal*4)/100) * 9.34);
        //Mostramos en pantalla
        JOptionPane.showMessageDialog(null,
                "\nNombre: " + nombre +
                "\nSalario semanal= " + SSemanal +
                "\nSalario mensual bruto= "+ TotalSin +
                "\nDeducciones mensuales 9.34%= " + TotalDeduc+
                "\nSalario mensual neto= " + TotalCon);
    }
     //Calculamos el salario mensual con deducciones
     public static double deducciones(double SalarioSemanal){

        double SalarioCon;
        SalarioCon = (SalarioSemanal*4) - (((SalarioSemanal*4)/100) * 9.34);

        return SalarioCon;
     }
     //Calculamos el salario mensual sin deducciones
     public static double NoDeducciones(double SalarioSemanal){

        double SalarioSin;
        SalarioSin = SalarioSemanal * 4;
        return SalarioSin;
        
    }
    
}
