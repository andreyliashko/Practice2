import java.util.Collection;

public class Worker {
    private String name;
    private Collection<String> names;
    Worker(){
        this.name="here must be your name";
    }
    Worker(String name){
        this.name=name;
    }
    public void setWorkerName(String name){ this.name=name; }
    public void setWorkers(Collection<String> allNames)
    {this.names=allNames; }
    public void getName(){
        if(names!=null) {

            String res = "";
            for (String result : this.names) {
                res += result + "\n";
            }
            System.out.println(res);
        }
    }
    public void printName(){
        System.out.println(name+"/n");
    }

}
