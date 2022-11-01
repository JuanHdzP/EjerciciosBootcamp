public class Main {
    public static void main(String[] args) {
        //Primera parte
        int res = suma(5,10,15);
        System.out.println(res);


        //Segunda parte
        Coche miCoche = new Coche();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();
        miCoche.IncrementarPuerta();
        System.out.println("Mi coche tiene "+miCoche.puerta+" puertas");
    }

    //Funcion primera parte
    public static int suma(int a, int b, int c) {
        return a+b+c;
    }
}
//Clase segunda parte
class Coche{
    public int puerta = 0;
    public void IncrementarPuerta(){
        this.puerta++;
    }
}

