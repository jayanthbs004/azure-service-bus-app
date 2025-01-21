public class App {
    private static final String CONNECTION_STRING = "your_connection_string";
    private static final String QUEUE_NAME = "your_queue_name";

    public static void main(String[] args) {
        // Create a Service Bus client
        ServiceBusSenderClient senderClient = new ServiceBusClientBuilder()
                .connectionString(CONNECTION_STRING)
                .sender()
                .queueName(QUEUE_NAME)
                .buildClient();

        // Send a message
        String messageBody = "Hello, Azure Service Bus!";
        ServiceBusMessage message = new ServiceBusMessage(messageBody);
        senderClient.sendMessage(message);
        System.out.println("Message sent: " + messageBody);

        // Create a receiver client
        ServiceBusReceiverClient receiverClient = new ServiceBusClientBuilder()
                .connectionString(CONNECTION_STRING)
                .receiver()
                .queueName(QUEUE_NAME)
                .buildClient();

        // Receive a message
        ServiceBusReceivedMessage receivedMessage = receiverClient.receiveMessages(1).iterator().next();
        System.out.println("Message received: " + receivedMessage.getBody().toString());

        // Complete the message
        receiverClient.completeMessage(receivedMessage);

        // Close clients
        senderClient.close();
        receiverClient.close();
    }
}