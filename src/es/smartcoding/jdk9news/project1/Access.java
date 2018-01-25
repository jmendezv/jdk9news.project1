package es.smartcoding.jdk9news.project1;

/**
 * 
 * @author pep
 *
 */
public interface Access {
    
    /**
     * 
     * @param user
     * @param password
     * @throws Exception
     */
    public abstract void register(String user, String password) throws Exception;
}
