//RMI=Remote method infocation
import java.rmi.Naming;
public class Server {

    public static void main(String[] args){
        try{
            Calculatorimpl obj = new Calculatorimpl();
            Naming.rebind("rmi://localhost/Caluclator",obj);
            System.out.println("RMI Server Started...");
        }
        catch (Exception e){
                System.out.println(e);
            
        }
    }
}