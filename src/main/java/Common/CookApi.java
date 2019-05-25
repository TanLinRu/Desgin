/**
 * @program: desgin
 * @description: 厨师接口
 * @author: TLQ
 * @create: 2019-05-25 20:30
 **/
package Common;

public interface CookApi {
    /**
     *@Description: 做菜方法
     *@Param: [tableName, name]
     *@return: void
     *@Author: TLQ
     *@date: 2019/5/25 20:31
    **/
    public void cook(int tableName,String name);
}