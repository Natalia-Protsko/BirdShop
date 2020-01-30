package TV;

public class ButtonVolume extends Button {

    private int sign ;

    public ButtonVolume(RemoteControl rc, int sign){
        super(rc);
        this.sign = sign;
    }
    protected void doPress(){
        rc.getTv().setVolume(rc.getTv().getVolume()+sign);
    }
}
