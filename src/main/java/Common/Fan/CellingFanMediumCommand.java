/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 21:43
 **/
package Common.Fan;

public class CellingFanMediumCommand implements Command {
    CellingFan cellingFan;
    int preSpeed;

    public CellingFanMediumCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    public void excute() {
        preSpeed = cellingFan.getSpeed();
        cellingFan.medium();
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