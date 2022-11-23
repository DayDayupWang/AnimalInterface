public class cat extends Animal implements Jumpping {

    public cat() {
    }

    public cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void jump() {
        System.out.println("猫会跳高");
    }
}
