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
public class SucesionGeometrica {
static NumberFormat nf = new DecimalFormat("##.###");
    // static Entity entidad = new Entity();
    public static boolean determinaSiGeometrica() {
        boolean esOno = false;
        //teniendo en cuenta la sig. sucesion  an, ao, ap
        //Donde an es el termino  y n el sub indice de an
        // ao es el termino siguiente y o el sub indice de ao
        // se calcula r1 == r; enviando al metodo calculoR el "SEGUNDO" y el "PRIMER" termino ingresado
        double r1 = calculoR(entidad.getO(), entidad.getN(), entidad.getAo(), entidad.getAn());

        // se calcula r2 == r; enviando al metodo calculoR el "TERCERO" y el "SEGUNDO" termino ingresado
        double r2 = calculoR(entidad.getP(), entidad.getO(), entidad.getAp(), entidad.getAo());

        //Si los dos resultados coinciden es que es geometricaVeinte 
        if (r1 == r2) {
            // se setea el valor de r
            entidad.setR(r2);

            //se seta la variable sucesion con el String de geometricaVeinte
            entidad.setSucesion("Geométrica");
              esOno = true;
        }
        return esOno;
     
    }

    public static String[] geometricaVeinte() {
        String[] los20geo = {"", "", "", "", ""};
        //an = ay * r * pot(n - y) [termino general]
        // r  = raiz de (n - y)  an / ay
        // sumatoria(n) = a1 * ( (r pot(n)) - 1 ) / (r - 1)
        for (int i = 1; i < 20; i++) {
//nos apoyamos en el metodo encontrarunvalor para calcular cada uno de los terminos
            double resultado = geometricoEncontrarUnValor(i);
// Cadada valor devuelto lo concateno para armar un String que sera usado para mostrar los valores
            if (i < 6) {
                los20geo[0] = los20geo[0] + "a" + String.valueOf(i) + "= " + nf.format(resultado) + "  ";
            } else if (5 < i && i < 11) {
                los20geo[1] = los20geo[1] + "a" + String.valueOf(i) + "= " + nf.format(resultado) + "  ";
            } else if (10 < i && i < 16) {
                los20geo[2] = los20geo[2] + "a" + String.valueOf(i) + "= " + nf.format(resultado) + "  ";
            } else if (15 < i) {
                los20geo[3] = los20geo[3] + "a" + String.valueOf(i) + "= " + nf.format(resultado) + "  ";
            }
        }
        return los20geo;
    }

    public static double geometricoEncontrarUnValor(int x) {
        //siendo la formula general an = ay * r^(n-y)
        int potencia = x - entidad.getN();// se calcula (n-y)
        double base = entidad.getR();// se busca a r
        double ax = entidad.getAn() * Math.pow(base, potencia);// se remplaza la formula general
        return ax;
    }

    public static String terminoGeneralGeometrico() {
        // se arma el string que sera expuesto en el frame como termino general
        String a1 = nf.format(geometricoEncontrarUnValor(1));
        String texto = " La sucesión es " + entidad.getSucesion() + " an = " + a1 + " x " + nf.format(entidad.getR()) + "^(n - 1)";
        return texto;
    }

    public static double calculoR(int n, int y, double an, double ay) {
        //siendo la formula general an = ay * r^(n-y)
        //despejando r nos queda 
        //r = raiz de (n-y) de (an/ay)
        int indice = n - y;
        double radicando = an / ay;
        
        //si a math.pow, en el termino del indice, le colocolamos 
        //1.0/n en vez de darnos la potencia nos dara la raiz n = enecima
//https://www.lawebdelprogramador.com/foros/Java/300918-como-saco-potencia-y-raiz-enesima.html
        double r = Math.pow(radicando, 1.0 / indice);
        return r;
    }

    public static String geometricoSumatoria(String num) {
        //recibo el valor del indice hasta donde se quiere sumar
        int n = Integer.parseInt(num);

        //con la formula remplazamos los valores         
        //sumatoria de "n" terminos es = ( a1 (r^n - 1 )) / (r - 1) 
        double sumatoria = (entidad.getAn() * ((Math.pow(entidad.getR(), n)) - 1)) / (entidad.getR() - 1);

        //para evitar que en el resultado se vea la notacion cientifica "E"
//https://www.web-dev-qa-db-es.com/es/java/como-imprimo-un-valor-doble-sin-notacion-cientifica-utilizando-java/1072259054/
        String resultado = (new BigDecimal(nf.format(sumatoria)).toPlainString());
        return resultado;
    }
}
