package TV;

public enum NumButton {
    B1(1), B2(2),B3(3),B4(4),B5(5),B6(6),B7(7),B8(8),B9(9),B0(0);

    private int value;
    NumButton(int value){this.value = value;}

    public int getValue(){return value;}

    public static NumButton getNumButton(int i){
        return valueOf("B"+i);
    }


}
