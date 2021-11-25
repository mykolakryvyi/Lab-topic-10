package mail_sender;

import client.Client;

import java.util.HashMap;

public class MailInfo {
    private Client client;
    private MailCode mailCode;

    public MailInfo(Client client, MailCode mailCode) {
        this.client = client;
        this.mailCode = mailCode;
    }

    public String getText() {
        HashMap <String, String> templates = new HashMap<String, String>();
        templates.put("%NAME%", client.getName());
        String text = mailCode.generateText();
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

    public String getEmail() {
        return client.getEmail();
    }

    public Client getClient() {
        return client;
    }

    public MailCode getMailCode() {
        return mailCode;
    }
}