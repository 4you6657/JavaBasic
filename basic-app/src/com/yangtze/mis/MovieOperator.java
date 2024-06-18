package com.yangtze.mis;

public class MovieOperator {
    private Movie[] movies;

    public MovieOperator(Movie[] movies) {
        this.movies = movies;
    }

    // 需求1：展示系统全部电影信息
    public void printAllMovies() {
        System.out.println("系统全部电影信息如下：");
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("编号：" + m.getId());
            System.out.println("名称：" + m.getName());
            System.out.println("价格：" + m.getPrice());
            System.out.println("--------------------");
        }
    }

    public void selectMovieInfoById(int id) {
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id) {
                System.out.println("编号：" + movies[i].getId());
                System.out.println("名称：" + movies[i].getName());
                System.out.println("价格：" + movies[i].getPrice());
                System.out.println("评分：" + movies[i].getScore());
                System.out.println("导演：" + movies[i].getDirector());
                System.out.println("主演：" + movies[i].getActor());
                System.out.println("其它信息：" + movies[i].getInfo());
                return; // 代表已经找到了电影信息，没有必要全部遍历了。
            }
        }
        System.out.println("未找到相匹配的电影！");
    }
}
