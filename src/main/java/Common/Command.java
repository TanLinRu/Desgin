/**
 * @program: desgin
 * @description:命令接口
 * @author: TLQ
 * @create: 2019-05-25 20:29
 **/
package Common;

public interface Command {
    public void execute();
    /**
     *@Description: 设置命令接受者
     *@Param: [cookApi]
     *@return: void
     *@Author: TLQ
     *@date: 2019/5/25 20:32
    **/
    public void setCookApi(CookApi cookApi);
    /**
     *@Description: 返回发起请求的桌号，就是点菜的桌号
     *@Param: []
     *@return: int
     *@Author: TLQ
     *@date: 2019/5/25 20:33
    **/
    public int getTableName();
}