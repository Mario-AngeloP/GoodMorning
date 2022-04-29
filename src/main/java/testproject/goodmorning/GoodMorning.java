package testproject.goodmorning;

import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;
import testproject.goodmorning.command.GoodCommand;

import java.util.Arrays;
import java.util.List;

public class GoodMorning extends JavaPlugin {

    private static GoodMorning instance;

    public void onEnable() {
        this.getCommand("guten").setExecutor(new GoodCommand());
    }

    public static GoodMorning getInstance() {
        if(instance == null)
            instance = new GoodMorning();
        return instance;
    }
}

