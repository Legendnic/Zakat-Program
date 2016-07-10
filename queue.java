public class queue{
    node head,tail,current;
     int want=0;
    public queue(){}
    
    public boolean empty(){
        return (head==null);
    }
    
    public void enqueue(Zakat insert){
        node data= new node(insert);
        if(empty()){
            head=data;
            tail=data;
        }
        else{
            tail.next=data;
            tail=data;
        }
    }
    
    public Zakat dequeue(){
        Zakat remove=null;
        
        if(empty()){
            return remove;
        }
        remove=head.data;
        
        if(head==tail){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
        }
        return remove;
    }
   
  
}