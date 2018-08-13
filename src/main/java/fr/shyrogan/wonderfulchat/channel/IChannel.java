package fr.shyrogan.wonderfulchat.channel;

import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.entity.Player;

import java.util.Collection;

/**
 * Interface used to represent a channel inside of our chat.
 *
 * A Channel represents a "Category" to our Chat. Meaning you can
 * restrain people receiving messages from it.
 *
 * @author Sébastien (Shyrogan)
 */
public interface IChannel {

    /**
     * Returns this channel's name, it is used
     * to get and recognize our channel from other.
     *
     * @return Channel's name.
     */
    String getName();

    /**
     * Returns our channel's prefix. This one is normally
     * at the beginning of each messages but it might not
     * if you create your own implementation of that interface.
     *
     * @return Channel's prefix.
     */
    BaseComponent getPrefix();

    /**
     * Modifiy our stored prefix. This one is normally
     * at the beginning of each messages but it might not
     * if you create your own implementation of that interface.
     *
     * @param prefix Channel's new prefix.
     */
    void setPrefix(BaseComponent prefix);

    /**
     * Returns every people receiving message from our
     * channel.
     *
     * I highly recommend you to allow modification operations like add/remove.
     *
     * @return Collection of Listeners (Player).
     */
    Collection<Player> getListeners();

    /**
     * Basically turn our String into a BaseComponent then send it
     * using Channel's
     *
     * @param text
     */
    default void send(String text) {

    }


    /**
     * Send a Spigot's chat component de Listeners
     *
     * @param text Text
     */
    void send(BaseComponent text);

}