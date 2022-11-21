import java.util.logging.Logger;

public class customerManager {
    public BaseLogger logger;
    public customerManager ( BaseLogger logger){
        this.logger = logger;

    }
public void add (){
    System.out.println("Müşteri Eklendi");
    DataBaseLogger Logger =new DataBaseLogger();
    Logger.log  ( "Log mesajı");
    this.logger.log("log mesajı");
}
}
