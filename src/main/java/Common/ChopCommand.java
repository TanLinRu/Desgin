/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 20:35
 **/
package Common;

public class ChopCommand implements Command {

    /**
     *@Description:
     *@Param: 持有具体做菜的厨师对象
     *@return:
     *@Author: TLQ
     *@date: 2019/5/25 20:36
    **/
    private CookApi cookApi = null;

    //  点菜的桌号
    private int tableName;

        public void setCookApi(CookApi cookApi) {
            this.cookApi = cookApi;
    }

    public int getTableName() {
        return this.tableName;
    }

    public ChopCommand(int tableName){
            this.tableName = tableName;
    }

    public void execute() {
        this.cookApi.cook(tableName,"绿豆排骨煲");
    }




}