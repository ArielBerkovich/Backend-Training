import org.apache.log4j.BasicConfigurator;
public class Main {
    public static void main(String args[]) {
        BasicConfigurator.configure();  // init log for java
        SampleConsumer mySampleConsumer = new SampleConsumer(Constants.KAFKA_SERVER_URL, Constants.KAFKA_SERVER_PORT, Constants.CLIENT_ID);
        mySampleConsumer.subscribe(Constants.TOPIC_NAME);
        Thread mySampleConsumerThread = new Thread(mySampleConsumer);
        mySampleConsumerThread.start();
    }
}