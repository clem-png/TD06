
import java.util.ArrayList;
public class Telecommande {

    private ArrayList<Lampe> lampes;
    public Telecommande(){
        lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }

    public void activerLampe(int indiceLampe){
        throw new Error("code non écrit");
    }

    public void desactiverLampe(int indiceLampe){
        throw new Error("code non écrit");
    }

    public void activerTout(){
        throw new Error("code non écrit");
    }

    public String toString(){
        throw new Error("code non écrit");
    }

}
