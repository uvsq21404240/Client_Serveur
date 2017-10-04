import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Write a description of class serveur here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class serveur
{
   
    public LinkedList l;
    /**
     * Constructor for objects of class serveur
     */
    public serveur()
    {
        l = new LinkedList();
    }

    public boolean connecter(client t)
    {
            l.add(t);
            return true;
        
    }
    public void diffuser(String t)
    {
        int i;
        client c;
        for(i = 0 ; i < l.size(); i++)
        {
            c = (client) l.get(i);
            c.recevoir(t);
        }
        }
        
    }

