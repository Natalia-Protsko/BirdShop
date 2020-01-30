package TV;

public class ButtonNum extends Button {
    private NumButton num;
    public ButtonNum(RemoteControl rc, int num){
        super(rc);
        this.num = NumButton.getNumButton(num);
    }

    protected void doPress(){
        rc.getTv().setChannel(num.getValue());
    }

}
