package testproject.goodmorning.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import testproject.goodmorning.GoodMorning;
import testproject.goodmorning.storage.Data;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class GoodCommand implements CommandExecutor {

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(args.length != 1 || !(args.length == 1 && Data.getInstance().getReturns().contains(args[0].toLowerCase()))) {
            sender.sendMessage("§aGuten " + String.join(" ", args) + "?");
            return false;
        }
        sender.sendMessage("§aGuten " + args[0] + "!");
        return false;
    }
}
