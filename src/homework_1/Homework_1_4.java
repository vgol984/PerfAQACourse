package homework_1;

//не знаю, надо ли было гуглить отдельно команду Math.round, изначально хотел решить через приведение типов, но узнал, что они всегда округляются в меньшую сторону

public class Homework_1_4 {
    public static void main(String[] args) {
        double n = 10.51;
        int a = (int)Math.round(n);
        System.out.println(a);
    }
}
