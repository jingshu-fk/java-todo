package com.xintest.mystream.xiaocase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author SHUJINGPING
 * @description Stream流综合运用
 */
public class Test13 {
    public static void main(String[] args) {
        String actorManOne = "周润发";
        String actorManTwo = "成龙";
        String actorManThree = "刘德华";
        String actorManFour = "吴京";
        String actorManFive = "周星驰";
        String actorManSix = "李连杰";
        List<String> actorsMan = new ArrayList<String>();
        Collections.addAll(actorsMan, actorManOne, actorManTwo, actorManThree,
                actorManFour, actorManFive, actorManSix);

        String actorWomanOne = "林心如";
        String actorWomanTwo = "张曼玉";
        String actorWomanThree = "杨超越";
        String actorWomanFour = "林志玲";
        String actorWomanFive = "周冬雨";
        String actorWomanSix = "杨颖";
        List<String> actorsWoman = new ArrayList<String>();
        Collections.addAll(actorsWoman, actorWomanOne, actorWomanTwo, actorWomanThree,
                actorWomanFour, actorWomanFive, actorWomanSix);

        Stream<String> actorsStreamMan = actorsMan.stream().
                filter(s -> s.length() == 3).
                limit(2);
        Stream<String> actorsStreamWoman = actorsWoman.stream().
                filter(s -> s.startsWith("杨")).
                skip(1);

        Stream.concat(actorsStreamMan, actorsStreamWoman).forEach(s -> {
            Actor actor = new Actor(s);
            System.out.println(actor.getName());
        });
    }
}
