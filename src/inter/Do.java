package inter;
import simbolos.*;
public class Do extends Instr{
    Expr expr;
    Instr instr;
    public Do(){
        expr = null;
        instr = null;
    }
    public void inic(Instr s, Expr x){
        expr = x;
        instr = s;
        if (expr.tipo != Tipo.Bool) expr.error("Se requiere booleano en do");
    }
    public void gen(int b, int a){
        despues = a;
        int etiqueta = nuevaEtiqueta();
        instr.gen(b, etiqueta);
        emitirEtiqueta(etiqueta);
        expr.salto(b, 0);
    }
}
