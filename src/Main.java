//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 98;
        float height = 1.87F;// почему-то только с буквой F ошибка исчезла. как в Питоне, просто float и число -- тут так не работает.
        int bodyMassIndex = service.calculate(weight,height);
        System.out.println(bodyMassIndex);
    }
    }