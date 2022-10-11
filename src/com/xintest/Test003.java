package com.xintest;

public class Test003 {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("我和我的祖国");
        builder.append(',');
        builder.append("一刻也不能分割");
        builder.append('。');
        builder.append("无论我走到哪里,都留下一首赞歌。");
        builder.append("我歌唱每一座高山,我歌唱每一条河。");
        builder.append("袅袅炊烟,小小村落,路上一道辙。");
        builder.append("我永远紧依着你的心窝,你用你那母亲的脉搏,和我诉说。");
        String result = builder.toString();
        System.out.println(result);
    }
}
