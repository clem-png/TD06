
import java.util.ArrayList;
public class Telecommande {

    private ArrayList<Appareil> app;
    public Telecommande(){
        app = new ArrayList<Appareil>();
    }


    public void ajouterApp(Appareil l){app.add(l);}

    public void activerApp(int indiceApp){
        try {
            app.get(indiceApp).allumer();
        }
        catch (IndexOutOfBoundsException e ){
            System.out.println("indice trop grand");
        }
    }

    public void desactiverApp(int indiceApp){
        app.get(indiceApp).eteindre();
    }

    public void activerTout(){
        for (int i = 0; i <app.size(); i++){
            app.get(i).allumer();
        }
    }

    public Appareil getApp(int indiceApp){
        return app.get(indiceApp);
    }

    public String toString(){
        String aff ="lampe";
        for (int i = 0; i <app.size(); i++){
            aff += app.get(i).toString() + "\n";
        }
        aff += "hifi \n";
        for (int i = 0; i <app.size(); i++){
            aff += app.get(i).toString() + "\n";
        }
        return aff;

    }

    public int getNombre(){
        return app.size();
    }

}
