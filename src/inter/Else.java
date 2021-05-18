package inter;
import simbolos.*;

public class Else extends Instr{
    Expr expr;
    Instr instr1, instr2;

    public Else(Expr x, Instr s1, Instr s2){
        expr = x;
        instr1 = s1;
        instr2 = s2;
        if (expr.tipo != Tipo.Bool) expr.error("Se requiere boleano en if");
    }
    public void gen(int b, int a){
        int etiqueta1 = nuevaEtiqueta();
        int etiqueta2 = nuevaEtiqueta();
        expr.salto(0, etiqueta2);
        emitirEtiqueta(etiqueta1);
        emitirEtiqueta(etiqueta2);
    }
}
