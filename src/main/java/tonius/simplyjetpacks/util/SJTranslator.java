package tonius.simplyjetpacks.util;

import net.minecraft.util.StatCollector;

public class SJTranslator {

    public static String translate(String unlocalized) {
        return StatCollector.translateToLocal("simplyjetpacks." + unlocalized);
    }

}
