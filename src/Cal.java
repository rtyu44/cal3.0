public class Cal {

    public static String calculate(Number first, Number second, String action) throws Exception {

        int result = switch (action) {
            case "+" -> first.getValue() + second.getValue();
            case "-" -> first.getValue() - second.getValue();
            case "*" -> first.getValue() * second.getValue();
            case "/" -> first.getValue() / second.getValue();
            default -> throw new Exception("спользуйте только +, -, *, /");
        };

        if (first.getType() != Roman.ROMAN) {
            return String.valueOf(result);
        } else {
            return NumberService.toRomanNumber(result);
        }
    }
}