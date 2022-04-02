public class TwoTypePair<T1, T2> {
    private T1 first;
    private T2 second;

    public TwoTypePair(){
        first = null;
        second = null;
    }

    public TwoTypePair(T1 first, T2 second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(T1 first){
        this.first = first;
    }

    public void setSecond(T2 second){
        this.second = second;
    }

    public T1 getFirst(){
        return this.first;
    }

    public T2 getSecond(){
        return this.second;
    }

    public String toString(){
        return("First: " + this.first.toString() + " Second: " + this.second.toString());
    }

    public boolean equals(Object object){
        if(object == null){
            return false;
        }else if(getClass() != object.getClass()){
            return false;
        }else{
            TwoTypePair<T1, T2> otherPair = (TwoTypePair<T1, T2>) object;
            return first.equals(otherPair.first) && second.equals(otherPair.second);
        }
    }
}
