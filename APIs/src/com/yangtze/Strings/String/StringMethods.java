package com.yangtze.Strings.String;

public class StringMethods {
    public static void main(String[] args) {
        // String 提供的操作字符串数据的常用方法
        // public int length()                                                  ：获取字符串的长度返回（就是字符个数）
        // public char charAt(int index)                                        ：获取某个索引位置处的字符返回
        // public char[] toCharArray()                                          ：将当前字符串转换成字符数组返回
        // public boolean equals(Object obj)                                    ：判断当前字符串与另一个字符串的内容是否一样（完全一样）
        // public boolean equalsIgnoreCase(String str)                          ：判断当前字符串与另一个字符串的内容是否一样（忽略大小写）
        // public String subString(int beginIndex, int endIndex)                ：根据开始和结束索引进行截取，得到新的字符串
        // public String subString(int beginIndex)                              ：从传入的索引处截取，截取到末尾，得到新的字符串返回
        // public String replace(CharSequence target, CharSequence replacement) ：使用新值，将字符串中的旧值替换，得到新的字符串
        // public boolean contains(CharSequence seq)                            ：判断字符串中是否包含了某个字符串
        // public boolean startsWith(String prefix)                             ：判断字符串是否以某个字符串内容开头，开头返回true，反之false
        // public String[] split(String regex)                                  ：把字符串按照某个字符串内容分割，并返回字符串数组回来

        String s1 = "itheima";
        String s2 = "ITHEIMA";

        // 截取字符串（左闭右开）
        String subStr1 = s1.substring(1, 2);
        System.out.println(subStr1);
        // 截取字符串（从当前索引一直截取到末尾）
        String subStr2 = s1.substring(3);
        System.out.println(subStr2);

        System.out.println(s1 == s2);
        System.out.println(s2.equalsIgnoreCase(s1));
        System.out.println(s2.equals(s1));

        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        char[] chars = s1.toCharArray();
        for (char ch : chars) {
            System.out.println(ch);
        }

        String trashInfo = "垃圾电影！";
        String result = trashInfo.replace("垃圾", "**");
        System.out.println(result);

        String info = "Java是世界上最好的编程语言之一，我爱Java!";
        System.out.println(info.contains("Java"));
        System.out.println(info.contains("JAVA"));
        System.out.println(info.contains("java"));

        String name = "张三丰";
        System.out.println(name.startsWith("张三丰"));
        System.out.println(name.startsWith("张三"));
        System.out.println(name.startsWith("张"));

        String receivedInfo = "张无忌、周芷若、殷素素、赵敏";
        String[] actors = receivedInfo.split("、");
        for (String actor : actors) {
            System.out.println(actor);
        }


    }
}
