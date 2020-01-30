package TV;

public class Demo {

    public static void main(String[] args) {

        TV tv = new TV();
        RemoteControl rc = new RemoteControl();
        rc.setTv(tv);

        rc.pressRedButton();


        rc.press5();

        rc.press0();

        rc.decChannel();
        rc.decChannel();

        rc.incChannel();

        rc.pressRedButton();

        //rc.pressBtnF1();


    }

}
