package simbolos;
import analizadorLexico.*;
public class Arreglo extends Tipo{
    public Tipo de;
    public int size = 1;
    public Arreglo(int tm, Tipo p){
        super("[]", Etiqueta.INDEX, tm*p.anchura);
        size = tm;
        de = p;
    }
    public String toString(){
        return "["+size+"] "+de.toString();
    }
}
