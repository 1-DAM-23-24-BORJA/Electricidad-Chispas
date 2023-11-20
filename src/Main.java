public class Main {
    public static void main(String[] args) {

        Client client1 = new Client();
        client1.setName("pepe");
        client1.setSurname("JIMENEZ");
        client1.setFullName(client1.getName()+client1.getSurname());
        System.out.println(client1.getFullName());



    }
}