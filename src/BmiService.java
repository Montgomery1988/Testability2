public class BmiService {
    public int calculate(float weight, float height) {
        int bodyMassIndex = (int) (weight / (height * height)); // пишут в Сети, что нет возведение в степень через **
        return bodyMassIndex;
    }
}
