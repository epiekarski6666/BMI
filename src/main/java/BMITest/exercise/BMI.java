package BMITest.exercise;

public class BMI {
    // Napisz program, który obliczy wskaźnik BMI wg wzoru waga/wzrost2
    // BMI < 18,5 - "get some weight"
    // BMI = 25 and higher - "you need to grow"
    // else - "good weight"
    // weight or growth < 0? - "I don't think so"

    public String checkBmi(int weight, double growth) {
        String result = "";
        if (growth == 0) {
            result = "do not divide by 0";
        } else if (growth < 0 || weight < 0) {
            result = "I don't think so";
        } else {
            double BMI = weight / (growth * growth);
            if (BMI <= 18.5) {
                result = ("get some weight");
            } else if (BMI >= 25) {
                result = "you need to grow";
            } else if (BMI <= 0) {
                result = "I don't think so";
            } else {
                result = "good weight";
            }
        }
        return result;
    }
}
