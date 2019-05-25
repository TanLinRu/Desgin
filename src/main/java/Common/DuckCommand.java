/**
 * @program: desgin
 * @description:
 * @author: TLQ
 * @create: 2019-05-25 20:44
 **/
package Common;

public class DuckCommand implements Command {
//  做菜对象
    private CookApi cookApi;
    private int tableName;

    public DuckCommand(int tableName) {
        this.tableName = tableName;
    }

    public void execute() {
        this.cookApi.cook(tableName,"北京烤鸭");
    }

    public void setCookApi(CookApi cookApi) {
        this.cookApi = cookApi;
    }

    public int getTableName() {
        return this.tableName;
    }
}