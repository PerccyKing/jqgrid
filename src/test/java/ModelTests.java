import cn.com.pism.jqgrid.JqGrid;
import com.alibaba.fastjson.JSONObject;

/**
 * @author wangyihuai
 * @date 2020/01/16 上午 11:34
 */
public class ModelTests {
    public static void main(String[] args) {
        JqGrid jqGrid = new JqGrid();
        System.out.println(JSONObject.toJSONString(jqGrid));
    }
}
