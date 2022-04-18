class Number {

    private final int value;
    private final rm type;

    Number(int value, rm type) {
        this.value = value;
        this.type = type;
    }

    int getValue() {
        return value;
    }

    rm getType() {
        return type;
    }
}
