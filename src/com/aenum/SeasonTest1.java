package com.aenum;

/**
 * @date 2022.1.25
 * @Description 枚举类的基本使用
 * 使用enum定义的枚举类默认继承了java.lang.Enum类，因此不能再继承其他类
 * 枚举类的构造器只能使用private权限修饰符
 * 枚举类的所有实例必须在枚举类中显式列出(, 分隔; 结尾)。列出的实例系统会自动添加public static final 修饰
 * 必须在枚举类的第一行声明枚举类对象
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        Season1 summer = Season1.SUMMER;
//        System.out.println(summer.getSeasonName());
        System.out.println(summer.toString());
        System.out.println("*****************");
        // 1、values返回所有的枚举类对象组成的数组
        Season1[] values = Season1.values();
        for (Season1 value : values) {
            System.out.println(value);
        }
        System.out.println("*****************");
        // 2、valueOf
        Season1 winter = Season1.valueOf("WINTER");
        System.out.println(winter);
    }
}

enum Season1 {
    SPRING("春天", "春暖花开"),
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINTER("冬天", "冰天雪地");

    private final String seasonName;
    private final String seasonDesc;

    Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
}
