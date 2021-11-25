package mail_sender;

import client.Client;
import client.Sex;

import static org.junit.jupiter.api.Assertions.*;

class MailInfoTest {
    private Client client;
    private MailCode code;
    private MailInfo info;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client = new Client("Arman", 18, Sex.MALE, "arman@gmail.com");
        code = MailCode.HAPPY_BIRTHDAY;
        info = new MailInfo(client, code);
    }
}