public class GreetingServiceIml implements GreetingService{

    private MessageServer messageServer;

    public void setMessageServer(MessageServer messageServer){
        this.messageServer = messageServer;
    }

    @Override
    public void sendGreetingMsg(){
        if(messageServer!=null){
            System.out.println("Message service initialized....");
            System.out.println(messageServer.getMessage());

        }else {
            System.out.println("Message service is not initialized...");
        }
    }

}
