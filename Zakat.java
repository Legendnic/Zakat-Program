public class Zakat{
    String name;
    long ic;
    String job;
    int dependent;
    double salary;
    
    public Zakat(String nm,long IC,String jb,int depend,double sal){
        name=nm;
        ic=IC;
        job=jb;
        dependent=depend;
        salary=sal;
    }
    public Zakat(Zakat zakat){
        name=zakat.name;
        ic=zakat.ic;
        job=zakat.job;
        dependent=zakat.dependent;
        salary=zakat.salary;
    }
    public String getName(){
        return name;
    }
    public String getJob(){
        return job;
    }
    public long getIc(){
        return ic;
    }
    public int getDependent(){
        return dependent;
    }
    public double getSalary(){
        return salary;
    }
    public String toString(){
        return("\nname: "+ name+ "\nIC: "+ ic + "\nJob: " + job+"\nFamily's Dependent: "+dependent+"\nSalary: RM " +salary);
    }
   
    public void setJob(String jb){
        job=jb;
    }
    public void setDepend(int depend){
        dependent=depend;
    }
    public void setSalary(double sal){
        salary=sal;
    }
   
}
