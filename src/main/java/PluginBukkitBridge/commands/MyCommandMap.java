package PluginBukkitBridge.commands;

import org.bukkit.Server;
import org.bukkit.command.Command;
import org.bukkit.command.SimpleCommandMap;
import org.bukkit.command.defaults.ReloadCommand;

import java.util.Map;

/**
 * Created by florian on 13.10.14.
 */
public class MyCommandMap extends SimpleCommandMap{
    public MyCommandMap(Server server) {
        super(server);
        clearCommands();
    }

    @Override
    public synchronized void clearCommands() {
        for (Map.Entry<String, Command> entry : knownCommands.entrySet()) {
            entry.getValue().unregister(this);
        }
        knownCommands.clear();
        setDefaultCommands();
    }

    private void setDefaultCommands() {
        register("bukkit", new PluginsCommand("plugins"));
        register("bukkit", new DebugCommand("bbdebug"));
        register("bbhelp", new HelpCommand());
        register("reload", new ReloadCommand("reload"));
    }
}
