package io.github.shintar0.money_integrator;

public enum Categories {
    FOOD("食費"),
    COMMODITYS("日用品"),
    HOBBIES_AND_LEISURE("趣味・娯楽"),
    SOCIALIZINg("交際費"),
    TRANSPORTATION("交通費"),
    CLOTHING_AND_BEAUTY("衣服"),
    socializing 
    UTILITIES("光熱費"),
    INSURANCE("保険"),
    TAXES("税金"),
    SAVINGS("貯蓄"),
    INVESTMENTS("投資"),
    MISCELLANEOUS("雑費");

    private final String name;

    Categories(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
