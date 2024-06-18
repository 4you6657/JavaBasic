package com.yangtze.mis;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // 1、设计 电影类
        // 2、设计 电影操作类
        // 3、准备全部电影数据
        Movie[] movies = new Movie[4];
        movies[0] = new Movie(1, "流浪地球", 28.0, 8.8, "郭帆", "吴京", "人类命运共同体1");
        movies[1] = new Movie(2, "流浪地球2", 28.0, 7.8, "郭帆", "吴京", "人类命运共同体2");
        movies[2] = new Movie(3, "流浪地球3", 28.0, 9.8, "郭帆", "吴京", "人类命运共同体3");
        movies[3] = new Movie(4, "流浪地球4", 28.0, 6.8, "郭帆", "吴京", "人类命运共同体4");

        // 4、创建 电影操作类的 实例化对象，接收电影数据，并对其进行业务处理
        MovieOperator operator = new MovieOperator(movies);
        // operator.printAllMovies();
        // operator.selectMovieInfoById(3);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("电影信息系统");
            System.out.println("1、查询全部电影信息");
            System.out.println("2、根据id查询某个电影的详细信息展示");
            System.out.println("请您输入操作命令");
            int command = sc.nextInt();
            switch (command) {
                case 1:
                    operator.printAllMovies();
                    break;
                case 2:
                    // 根据id查询某个电影的详细信息
                    System.out.println("请输入要查询的电影id");
                    int id = sc.nextInt();
                    operator.selectMovieInfoById(id);
                    break;
                default:
                    System.out.println("有问题的输入命令");
            }
        }

    }
}
