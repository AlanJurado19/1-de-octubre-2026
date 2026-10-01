import java.util.Stack;

public class Pilaint {

    Stack <Integer> numeros;

    public Pilaint(){
        numeros = new Stack<Integer>();
    }

    public boolean isEmpy(){
        return numeros.isEmpty();
    }

    public void push(Integer dato){
        numeros.push(dato);
    }

    public Integer pop () throws Exception{
        if (!isEmpy()){
            return numeros.pop();
        }
        throw new Exception("La pila esta vacia");
    }

    public Integer peek () throws Exception{
        if (!isEmpy()){
            return numeros.peek();
        }
        throw new Exception("La pila esta vacia");
    }
    public int search(Integer i)throws Exception{
        if (!isEmpy()){
            return numeros.search(i);
        }
        throw new Exception("La pila esta vacia");
    }

    public String sacarPila(){

        return "";
    }

}
