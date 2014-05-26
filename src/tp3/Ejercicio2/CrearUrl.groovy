package tp3
/**
 *
 * @author AlanSandoval
 */

class CrearUrl {
    def url
    def readLines(){
        map=[:] // tiene lado clave y valor
        this.url.toURL().eachLine{texto,indice->
        map[indice]=texto.size()
        }map // Retorno el Map
    }	
}

    def miUrl= new CrearUrl() 
    miUrl.url = "http://www.ibm.com/developerworks/java/library/j-pg04149/"
    maps=miUrl.readLines() // obtengo el map con completo 
    maps.eachWithIndex({it,indice->println "Indice:$indice  tiene $it"})


