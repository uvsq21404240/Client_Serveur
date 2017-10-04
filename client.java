
/**
 * Write a description of class client here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class client
{
    // instance variables - replace the example below with your own
    private String nom;
    private String message;
    private serveur s;
    private client a;
    

    /**
     * Constructor for objects of class client
     */
    public client(String nom)
    {
        // initialise instance variables
        this.nom = nom;
    }
    public boolean Seconnecter(serveur s)
    {
        s.connecter(this);
        this.s = s;
        return true;
    }
    
    public String envoyer(String a)
    {
        this.message = this.nom.concat(a) ;
        s.diffuser(message);
        return message;
       
    }
    public String recevoir(String b)
    {
        return b;
        
    }
    
}
