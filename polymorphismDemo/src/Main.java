public class Main {
    public static void main(String[] args) {
//BaseLogger[] loggers = new BaseLogger []{ new FileLogger(),new EmailLogger(),new DataBaseLogger(),new consoleLogger()};
//for (BaseLogger logger : loggers)
//    logger . Log ("Log mesajı");
//    }

        customerManager customerManager = new customerManager(new DataBaseLogger());
        customerManager.add();


    }

}