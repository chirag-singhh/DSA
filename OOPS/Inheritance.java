class Pokemon{
    private int power;
    String type;

     Pokemon(String type,int power) {
        this.power=power;
        this.type=type;
    }

    public Pokemon() {
    }
    
    void print(){
        System.out.println(power+" "+type);
    }
    
}
 class LegendaryPokemon extends Pokemon{ //pokemon construtor defauklt bnaya kro 
    String ability;
    //subclass,child class, derived class

}
public class Inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewto = new LegendaryPokemon();
        mewto.ability="Morepower";
        mewto.type="fire";
    }
    
}
