package tp3.Ejercicio2
import tp3.TP3

/**
 *
 * @author AlanSandoval
 */
class Url2 {
    def url
    def ReadLines(){
        map=[:] // tiene lado clave y valor
        this.url.toURL().eachLine{texto,indice->
        map[indice]=texto.size()
        }map // Retorno el Map
    }	
}

public static void main(String[] args) {
    def miUrl= new Url2() 
    miUrl.url = "http://www.ibm.com/developerworks/java/library/j-pg04149/"
    maps=readLines(); // obtengo el map con completo 
    maps.eachWithIndex({it,indice->println "Indice:$indice $it"})
}

