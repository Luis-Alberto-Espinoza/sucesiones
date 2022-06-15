/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesiones;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static luis.espinoza.sucesiones.Servicio.entidad;

/**
 *
 * @author Espinoza
 */
public class SucesionAritmetica {
    static NumberFormat nf = new DecimalFormat("##.###");
     static String aux;

    public static boolean determinaSiEsAritmetica() {
        boolean esOno = false;
        //se restan los indices de a2 - a1
        // y - n = dividendo
        double dividendo1 = entidad.getAo() - entidad.getAn();
        double dividendo2 = entidad.getAp() - entidad.getAo();

        //se restan los terminos a2 - a1
        // ay - an = divisor
        double divisor1 = entidad.getO() - entidad.getN();
        double divisor2 = entidad.getP() - entidad.getO();

        //se realiza la division para determinar el paso
        // d = dividendo / divisor
        double resultado1 = dividendo1 / divisor1;
        double resultado2 = dividendo2 / divisor2;

        //si los resultados son iguales quiere decir que el paso es el mismo por ende es aritmetica
        if (resultado1 == resultado2) {

            //se setea a la clase entidad el paso 
            entidad.setD(resultado1);

            //se calcula "x", y despues se lo setea a la clase entidad
             //x = an - d * n
            double calculoDeX = entidad.getAn() - (entidad.getD() * entidad.getN());
            entidad.setX(calculoDeX);

            // se setea como bandera que cumple con la condicion de aritmetica
            entidad.setSucesion("Aritmética");
            esOno= true;
        }
        return esOno;
        
    }
  
    public static String[] aritmeticoVeinte() {
        
        String[] los20arit = {"","","","",""};
        for (int i = 1; i < 20; i++) {

            //se calcula en otro metodo el cada termino
            double result = aritmeticoEncontrarUnValor(i);
            
            if (i < 6) {
    //guardamos acumulativamente el resultado en una variable del tipo string para luego mostrarla 
                los20arit[0] = los20arit[0] + "a" + String.valueOf(i) + "= " + nf.format(result) + "  ";
            } else if (5 < i && i < 11) {
                los20arit[1] = los20arit[1] + "a" + String.valueOf(i) + "= " + nf.format(result) + "  ";
            } else if (10 < i && i < 16) {
                los20arit[2] = los20arit[2] + "a" + String.valueOf(i) + "= " + nf.format(result) + "  ";
            } else if(15<i) {
                los20arit[3] = los20arit[3] + "a" + String.valueOf(i) + "= " + nf.format(result) + "  ";
            }
        }
        return los20arit ;
    }

    public static double aritmeticoEncontrarUnValor(int i) {
        //(el termino general es) > an = d * n + x 
        return entidad.getD() * i + entidad.getX();
    }

    public static String terminoGeneralAritmetico() {
        // se arma el string que sera expuesto en el frame como termino general
        String texto = " La sucesión es " + entidad.getSucesion() + " an = " + nf.format( entidad.getD()) + " x n + " + nf.format(entidad.getX());
        return texto;
    }

    public static String aritmeticoSumatoria(String num) {
        //recibo el valor del indice hasta donde se quiere sumar
        //lo envio como parametro para calcular el valor del termino en esa pocision 
        double an = aritmeticoEncontrarUnValor(Integer.parseInt(num));

        //con la formula remplazamos los valores         
        //sumatoria = (( an + ay ) * n ) / 2 
        double sumatoria = ((an + entidad.getAn()) * Integer.parseInt(num)) / 2;

        //https://www.web-dev-qa-db-es.com/es/java/como-imprimo-un-valor-doble-sin-notacion-cientifica-utilizando-java/1072259054/
        String resultado = (new BigDecimal(nf.format (sumatoria)).toPlainString());

        return resultado;
    }

}
