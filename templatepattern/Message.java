/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package templatepattern;

/**
 *
 * @author Lenovo
 */


public class Message {
    private String description;
    private MessageType type;
    private NetworkType networkType;

    public Message(String description, MessageType type, NetworkType networkType) {
        this.description = description;
        this.type = type;
        this.networkType = networkType;
    }

    public String getDescription() {
        return description;
    }

    public MessageType getType() {
        return type;
    }

    public NetworkType getNetworkType() {
        return networkType;
    }
}


 enum MessageType {
    ERROR,
    WARNING,
    INFO
}
enum NetworkType {
    FACEBOOK(Facebook.class),
    TWITTER(Twitter.class),
    LINKEDIN(LinkedIn.class);

    private final Class<? extends Network> value;

    NetworkType(Class<? extends Network> value) {
        this.value = value;
    }

    public Class<? extends Network> getValue(String networkType) {
        return value;
    }
}
