package ArraysAlgorithm.ComprehensivePractice;

enum MenuOption {
    VIEW_ALL(1), SORT(2), SEARCH(3), ADD(4), DELETE(5), SAVE(6), LOAD(7), LOGIN(8), JOIN(9), LOGOUT(10), EXIT(0);

    private final int value;
    MenuOption(int value) { this.value = value; }
    public int getValue() { return value; }

    public static MenuOption from(int value) {
        for (MenuOption m : values()) {
            if (m.getValue() == value) return m;
        }
        return null;
    }
}
