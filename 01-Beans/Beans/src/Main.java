public class Main {
    public static void main(String[] args) {
        GreetingServiceIml greetingServiceIml = new GreetingServiceIml();
        MessageServer messageServer = new MessageServer();

        greetingServiceIml.setMessageServer(messageServer);

        greetingServiceIml.sendGreetingMsg();
    }
}