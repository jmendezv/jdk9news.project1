/**
 * 
 */
package es.smartcoding.jdk9news.project1;

/**
 * @author pep
 *
 */
public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception {
	Access access = new AccessImpl();
	/*
	 * 2 mayúscula, 3 minúsculas, 1 caracter especial, 2 dígitos
	 */
	access.register("pep", "AB!12def");

    }

}
