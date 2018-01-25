/**
 * 
 */
/**
 * @author pep
 *
 */
module jdk9news.project1 {

    /*
     * El módulo jdk9news.project1 necesita el módulo jdk9news.project2
     */
    requires jdk9news.project2;
    /*
     * Cualquier módulo que pueda acceder a jdk9news.project1 también sera capaz de leer jdk9news.project2
     */
    // requires transitive jdk9news.project2;
    
}