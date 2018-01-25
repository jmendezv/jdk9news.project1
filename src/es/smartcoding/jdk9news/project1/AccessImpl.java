/**
 * 
 */
package es.smartcoding.jdk9news.project1;

import es.smartcoding.jdk9news.project2.*;

/**
 * @author pep
 *
 */
public class AccessImpl implements Access {
    
    private Security security = new SecurityImpl();

    /* (non-Javadoc)
     * @see es.smartcoding.jdk9news.Access#register(java.lang.String, java.lang.String)
     */
    @Override
    public void register(String user, String password) throws Exception {
	if (security.isSecure(password)) {
	    security.register(user, password);
	} else {
	    Security.log(user, password);
	}
    }

}
