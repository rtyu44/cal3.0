class Number {

    private final int value;
    private final Roman type;

    Number(int value, Roman type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    Roman getType() {
        return type;
    }
}
