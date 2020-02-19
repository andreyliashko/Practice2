import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("pom.xml");
       Worker work1=(Worker) applicationContext.getBean("startWork");
       work1.printName();
        Worker work2=(Worker) applicationContext.getBean("startWork2");
        work2.printName();
        Worker work3=(Worker) applicationContext.getBean("startWork3");
        work3.getName();


    }
}
