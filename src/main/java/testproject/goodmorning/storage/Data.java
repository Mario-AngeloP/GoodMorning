package testproject.goodmorning.storage;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;

public class Data {

    private static Data instance;
    @Getter
    private List<String> returns;

    public Data() {
        this.returns = Arrays.asList("morgen", "mittag", "abend");
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }
}
