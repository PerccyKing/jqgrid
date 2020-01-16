package cn.com.pism.jqgrid;

import cn.com.pism.jqgrid.constant.DataType;
import cn.com.pism.jqgrid.constant.MType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * JqGrid
 * @author wangyihuai
 * @date 2020/01/16 下午 12:52
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class JqGrid {
    
    /**
     * 获取数据的地址
     */
    private String url;
    
    /**
     * <p>
     * 从服务器端返回的数据类型，默认xml。
     * 可选类型：
     *      xml,{@link DataType#XML}
     *      local，{@link DataType#LOCAL}
     *      json，{@link DataType#JSON}
     *      jsonnp，{@link DataType#JSON_NP}
     *      script，{@link DataType#SCRIPT}
     *      xmlstring，{@link DataType#XML_STRING}
     *      jsonstring，{@link DataType#JSON_STRING}
     *      clientside{@link DataType#CLIENT_SIDE}
     * </p>
     * @see DataType
     */
    private String datatype;

    /**
     * ajax提交方式
     * @see MType
     */
    private String mtype;

    /**
     * 	列显示名称，是一个数组对象
     */
    private String[] colNames;

    /**
     * 设置表格列的属性
     */
    private String colModel;

}
