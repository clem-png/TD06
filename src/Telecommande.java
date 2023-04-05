
import java.util.ArrayList;
public class Telecommande {

    private ArrayList<Lampe> lampes;
    private ArrayList<Hifi> hifis;
    public Telecommande(){
        lampes = new ArrayList<Lampe>();
        hifis = new ArrayList<Hifi>();
    }


    public void ajouterLampe(Lampe l){
        lampes.add(l);
    }

    public void ajouterHifi(Hifi hifi) {
        hifis.add(hifi);
    }

    public void activerLampe(int indiceLampe){
        try {
            lampes.get(indiceLampe).allumer();
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("indice trop grand");
        }
    }
    public void activerHifi(int indiceHifi) {
        hifis.get(indiceHifi).allumer();
    }

    public void desactiverLampe(int indiceLampe){
        lampes.get(indiceLampe).eteindre();
    }


    public void desactiverHifi(int indiceHifi) {
        hifis.get(indiceHifi).eteindre();
    }

    public void activerTout(){
        for (int i = 0; i <lampes.size(); i++){
            lampes.get(i).allumer();
        }
    }

    public String toString(){
        String aff ="lampe";
        for (int i = 0; i <lampes.size(); i++){
            aff += lampes.get(i).toString() + "\n";
        }
        aff += "hifi \n";
        for (int i = 0; i <hifis.size(); i++){
            aff += hifis.get(i).toString() + "\n";
        }
        return aff;

    }

    public ArrayList<Lampe> getLampe(){
        return lampes;
    }

    public ArrayList<Hifi> getHifi() { return  hifis;}

}
