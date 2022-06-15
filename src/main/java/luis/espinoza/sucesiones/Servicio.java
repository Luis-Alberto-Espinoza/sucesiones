/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luis.espinoza.sucesiones;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Espinoza
 */
public class Servicio {

    static NumberFormat nf = new DecimalFormat("##.###");
    static Entity entidad = new Entity();
    static Ventana ventana = new Ventana();
    static SucesionAritmetica arit = new SucesionAritmetica();
    static SucesionGeometrica geo = new SucesionGeometrica();

    static String terminoGeneral;
    static String[] los20Primeros = new String[4];
    static String terminoDeseado = "0";
    static String sumatoria = "0";

    public static void guardarDatos(String datos[][]) {
        boolean falta = true;
        for (String[] dato : datos) {
            for (int j = 0; j < datos.length; j++) {
                if ("".equals(dato[j])) {
                    falta = false;
                }
            }
        }
        if (!falta) {
            JOptionPane.showMessageDialog(null, "No puede quedar ningún espacio vacio", "Error!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            // seteo el valor de los terminos 
            entidad.setAn(Double.parseDouble(datos[0][1]));
            entidad.setAo(Double.parseDouble(datos[1][1]));
            entidad.setAp(Double.parseDouble(datos[2][1]));

            //seteo el valor de los sub indices
            entidad.setN(Integer.parseInt(datos[0][0]));
            entidad.setO(Integer.parseInt(datos[1][0]));
            entidad.setP(Integer.parseInt(datos[2][0]));
            determinaSucesion();
        }
    }

    public static void determinaSucesion() {
        //el metodo determinarSiEs.... contiene un condicional que si se cumple
        //le enviara a la clase entidad el seteo de la variable sucesion
        //el cual lo usare como bandera
        if (arit.determinaSiEsAritmetica() || geo.determinaSiGeometrica()) {
            guardarPrimerosResultados();
            System.out.println("sucesion >> " + entidad.getSucesion());
        } else {
            System.out.println("sucesion >> " + entidad.getSucesion());
            JOptionPane.showMessageDialog(null, "Los números ingresados no corresponden a una sucesión Aritmetica o Geométrica");
        }
    }

    public static void guardarPrimerosResultados() {
        //segun la variable bandera "sucesion" se determinara el funcionamiento del programa
        switch (entidad.getSucesion()) {
            case "Aritmética":
                terminoGeneral = arit.terminoGeneralAritmetico();
                System.arraycopy(arit.aritmeticoVeinte(), 0, los20Primeros, 0, los20Primeros.length);
                break;

            case "Geométrica":
                terminoGeneral = geo.terminoGeneralGeometrico();
                System.arraycopy(geo.geometricaVeinte(), 0, los20Primeros, 0, los20Primeros.length);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Los números ingresados no corresponden a una sucesión Aritmetica o Geométrica");
                break;
        }
    }

    public static void guardarSegundosResultados(String subindice) {

        if (("".equals(subindice))) {
            JOptionPane.showMessageDialog(null, "Se necesita un valor de subindice para poder sumar\nNo puede quedar el espacio vacio", "Error!!!", JOptionPane.ERROR_MESSAGE);
        } else {
            //Aca se prepara la segunda parte de resultados a mostrar en el frame
            //cuando el usuario ingrese el sub indice y oprima "sumatoria"
            //en terminoDeseado se guardara el String del valor del termino a buscar
            //en sumatoria se guardara el string del resultado de la suma de los n terminos
            if ("Aritmética".equals(entidad.getSucesion())) {
                terminoDeseado = nf.format(arit.aritmeticoEncontrarUnValor(Integer.parseInt(subindice)));
                terminoDeseado = (new BigDecimal((terminoDeseado)).toPlainString());
                sumatoria = arit.aritmeticoSumatoria(subindice);
            } else {
                terminoDeseado = nf.format(geo.geometricoEncontrarUnValor(Integer.parseInt(subindice)));
                terminoDeseado = (new BigDecimal((terminoDeseado)).toPlainString());
                sumatoria = geo.geometricoSumatoria(subindice);
            }
        }

    }

}
