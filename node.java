public class node{
    Zakat data;
    node next;
    int index=0;
    public node(Zakat dat){
        data=dat;
    }
    public int totalIndex(){
        return index++;
    }
}