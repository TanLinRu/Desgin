/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 21:39
 **/
package Common.Fan;

public class CellingFanLowCommand implements Command {
    CellingFan cellingFan;
//    记录之前的速度
    int preSpeed;
    public CellingFanLowCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    public void excute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.low();
    }

    public void undo() {
        if (preSpeed == CellingFan.HIGH) {
            cellingFan.high();
        }else if (preSpeed == CellingFan.MEDIUM) {
            cellingFan.medium();
        }else if (preSpeed == CellingFan.LOW) {
            cellingFan.low();
        }else if (preSpeed == CellingFan.OFF) {
            cellingFan.off();
        }
    }
}