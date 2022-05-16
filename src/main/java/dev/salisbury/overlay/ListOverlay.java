package dev.salisbury.overlay;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import static dev.salisbury.overlay.Main.translate;

public class ListOverlay implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String s, String[] args) {
        if (!(sender instanceof Player)) {
            if (cmd.getName().equalsIgnoreCase("list")) {
                sender.sendMessage("");
                sender.sendMessage(translate(" &e&lServer Name"));
                sender.sendMessage(translate(" &e▌&fPlayers Online: &e" + Bukkit.getServer().getOnlinePlayers().size() + "&f/&e" + Bukkit.getServer().getMaxPlayers()));
                sender.sendMessage("");
            }
        } else {
            Player p = (Player) sender;
            if (cmd.getName().equalsIgnoreCase("list")) {
                p.sendRawMessage("");
                p.sendRawMessage(translate(" &e&lServer Name"));
                p.sendRawMessage(translate(" &e▌&fPlayers Online: &e" + Bukkit.getServer().getOnlinePlayers().size() + "&f/&e" + Bukkit.getServer().getMaxPlayers()));
                p.sendRawMessage("");
            }
        }
        return false;
    }

}
