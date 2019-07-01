package generics.genericclass;

public class GenericHolder<E> {

    private E obj;

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}
