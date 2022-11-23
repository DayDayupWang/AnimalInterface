
public class Animaldemo {
    public static void main(String[] args) {
        Jumpping j = new cat();
        j.jump();
        // Jumpping jo =new JumppingOperator();
        // Jumpping j=new cat();
        JumppingOperator jo = new JumppingOperator();
        jo.method(new Jumpping() {
            // 匿名内部类，填入一个method需要的类或对象即可，新创建的也可
            // 作用：方便重写
            @Override
            public void jump() {
                System.out.println("可以跳高了");
            }
        });

    }
}

// }
