package com.yangtze.File.demo;

public class BeerProb {
    public static int TOTAL_BEER_NUMBER = 0; // 总共买几瓶酒

    public static int REMAIN_BOTTLE_NUMBER = 0; // 剩余几个瓶子

    public static int REMAIN_COVER_NUMBER = 0; // 剩余几个瓶盖

    public static void main(String[] args) {
        // 啤酒问题：啤酒2元/瓶，4个盖子可以换一瓶，2个空瓶可以换一瓶，请问10元可以喝多少瓶？
        buy(10);
        System.out.println(("总数：" + TOTAL_BEER_NUMBER + "剩余盖子数：" + REMAIN_COVER_NUMBER + "剩余瓶子数：" + REMAIN_BOTTLE_NUMBER));
    }

    public static void buy(int totalMoney) {
        // 1、先买了再说
        int iBeerNumberBought = totalMoney / 2;
        TOTAL_BEER_NUMBER += iBeerNumberBought;

        // 2、盖子和瓶子换算成钱，继续买酒。
        // 计算本轮总的盖子和瓶子数
        int iTotalBottleNumber = iBeerNumberBought + REMAIN_BOTTLE_NUMBER;
        int iTotalCoverNumber = iBeerNumberBought + REMAIN_COVER_NUMBER;

        int iTotalMoney = 0;

        if (iTotalBottleNumber >= 2) {
            iTotalMoney += (iTotalBottleNumber / 2) * 2;
        }
        REMAIN_BOTTLE_NUMBER = iTotalBottleNumber % 2;

        if (iTotalCoverNumber >= 4) {
            iTotalMoney += (iTotalCoverNumber / 4) * 2;

        }
        REMAIN_COVER_NUMBER = iTotalCoverNumber % 4;

        if (iTotalMoney >= 2) {
            buy(iTotalMoney);
        }

    }
}
