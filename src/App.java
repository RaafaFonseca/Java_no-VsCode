import pacote.Dog;
import pacote.Person;

public class App {
    public static void main(String[] args) throws Exception {
        Dog cachorro = new Dog();
        Person pessoa = new Person();

        cachorro.latir();
        pessoa.falar();
    }
}
