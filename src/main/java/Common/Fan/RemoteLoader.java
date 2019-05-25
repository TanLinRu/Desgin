/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 21:49
 **/
package Common.Fan;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        CellingFan cellingFan = new CellingFan();
        CellingFanOffCommand cellingFanOffCommand = new CellingFanOffCommand(cellingFan);
        CellingFanHighCommand cellingFanHighCommand = new CellingFanHighCommand(cellingFan);
        CellingFanLowCommand cellingFanLowCommand = new CellingFanLowCommand(cellingFan);
        CellingFanMediumCommand cellingFanMediumCommand = new CellingFanMediumCommand(cellingFan);
        remoteControl.setCommand(cellingFanMediumCommand);
        remoteControl.buttonWasPushed();
        remoteControl.setCommand(cellingFanHighCommand);
        remoteControl.buttonWasPushed();
        remoteControl.setCommand(cellingFanOffCommand);
        remoteControl.buttonWasPushed();
        remoteControl.undoButtonWasPushed();
    }

}