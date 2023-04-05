
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
        lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        lampes.get(indiceLampe).eteindre();
    }

    public void activerTout(){
        for (int i = 0; i <lampes.size(); i++){
            lampes.get(i).allumer();
        }
    }

    public String toString(){
        String aff ="";
        for (int i = 0; i <lampes.size(); i++){
            aff += lampes.get(i).toString();
        }
        return aff;

    }

    public ArrayList<Lampe> getLampe(){
        return lampes;
    }

}
