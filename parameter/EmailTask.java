public class EmailTask {

    public static void printEmails(Set<String> emails) {

        for (String email : emails) {

            System.out.println(email);

        }

    }



    public static void main(String[] args) {

        Set<String> emails = Set.of("example1@test.com", "example2@test.com", "example3@test.com");

        printEmails(emails);

    }

}