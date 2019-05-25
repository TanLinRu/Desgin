/**
 * @program: desgin
 * @description: 做热菜的厨师
 * @author: TLQ
 * @create: 2019-05-25 21:01
 **/
package Common;

public class HotCook implements CookApi,Runnable {
//    厨师姓名
    private String name;

    public HotCook(String name) {
        this.name = name;
    }

    public void cook(int tableName, String name) {
        int cookTime = (int) (20*Math.random());
        System.out.println(this.name+"厨师正在为 "+tableName+"号桌做"+name);
        try {
            Thread.sleep(cookTime);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"厨师为 "+tableName+"号桌做好了"+name+",共耗时"+cookTime+"秒");
    }

    public void run() {
        while (true) {
            Command cmd = CommandQueue.getOneComand();
            if (cmd!=null) {
                cmd.setCookApi(this);
                cmd.execute();
            }
            try {
                Thread.sleep(1000L);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}