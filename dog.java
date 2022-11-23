public class dog extends Animal implements Jumpping {

    public dog() {
    }

    public dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

    @Override
    public void jump() {
        System.out.println("狗会调高了");
    }

}
