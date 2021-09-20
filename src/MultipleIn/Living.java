package MultipleIn;

public class Living implements  Human,Animal{

    @Override
    public void hunt() {
        System.out.println("Animal hunt for living");
    }

    @Override
    public void work() {
System.out.println("Human Work For Living");
    }
}
