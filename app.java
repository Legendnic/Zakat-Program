import java.util.*;
import java.io.IOException;

public class app{
    public static void main (String[] args){
        
        queue people = new queue();
        queue temp=new queue();
        queue temp2=new queue();
        Scanner in = new Scanner(System.in);
        //scanner and queue
        
        String name;
        String job;
        long ic;
        int dependent;
        double salary;
         Zakat data;
         Zakat data2;
        //zakat's data declaration
        
        int count=0;
        int choice;
        int choice2;
        //loop declaration
     
        
        do{
            System.out.println("\nChoose your action: ");
            System.out.println("1. Insert data ");
            System.out.println("2. Display All Data ");
            System.out.println("3. Search And Display ");
             System.out.println("4. Search And Update ");
             System.out.println("5. Delete Data ");
            
            System.out.print("\nYour Choice: ");
            choice=in.nextInt();
         
            if(choice==1){
                System.out.print("\nInsert number of data: ");
                count=in.nextInt();
                
                for(int i=0;i<count;i++){
                    in.nextLine();
                    System.out.print("\nName: ");
                    name=in.nextLine();
                   
                    System.out.print("Identity Card: ");
                    ic=in.nextLong();
                    in.nextLine();
                    System.out.print("Job: ");
                    job=in.nextLine();
                    
                    System.out.print("Total Family's Dependent: ");
                    dependent=in.nextInt();
                    
                    System.out.print("Salary: RM ");
                    salary=in.nextDouble();
                    
                    data = new Zakat(name,ic,job,dependent,salary);
                    people.enqueue(data);
                }
            }
            else if(choice == 2){
                people.current=people.head;
                while(!people.empty()){
                    data=new Zakat(people.dequeue());
                    System.out.println("\n"+data.toString());
                    if(data.getSalary()<=3000)
                         System.out.println("Qualify to receive zakat!");
                        
                    else
                         System.out.println("Not Qualified!");
                    temp.enqueue(data);
                }
                temp.current=temp.head;
                
                while(!temp.empty()){
                    data=new Zakat(temp.dequeue());
                    people.enqueue(data);
                }
            }
            else if(choice==3){
                
                System.out.print("Enter the IC number:  ");
                long IC=in.nextLong();
                
                people.current=people.head;
                
                while(!people.empty()){
                     data=new Zakat(people.dequeue());
                    if(IC==data.getIc()){
                         System.out.println("\n"+data.toString());
                         if(data.getSalary()<=3000)
                            System.out.println("Qualify to receive zakat!");
                        
                         else
                            System.out.println("Not Qualified!");
                    }
                    temp.enqueue(data);
                }
                
                temp.current=temp.head;
                   while(!temp.empty()){
                    data=new Zakat(temp.dequeue());
                    people.enqueue(data);
                }
            }
            else if(choice==4){
                System.out.print("Enter IC number: ");
                long Ic=in.nextLong();
                people.current=people.head;
                
                while(people.current!=null){
                    if(Ic==people.current.data.getIc()){
                        in.nextLine();
                        System.out.print("\nEnter Job: "); 
                        job=in.nextLine();
                        System.out.print("Enter dependent: "); 
                        dependent=in.nextInt();
                        System.out.print("Enter Salary: "); 
                        salary=in.nextDouble();
                        
                        people.current.data.setJob(job);
                        people.current.data.setDepend(dependent);
                        people.current.data.setSalary(salary);
                        people.current=people.current.next;
                    }
                    else{
                        people.current=people.current.next;
                    }
                }
            }
            else if(choice==5){
                System.out.println("\nWould you remove the data?");
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print("\nState Your Number: ");
                choice2=in.nextInt();
                
                people.current=people.head;
                if(choice2==1){
                    System.out.println(people.dequeue());
                }
                else{
                    System.out.println("Wrong Number!");
                }
            }
            
        }while((choice == 1) || (choice ==2) || (choice==3) || (choice==4) || (choice==5));
        
       
}
}