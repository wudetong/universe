package com.zcf.universe.common.result;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

/**
 * 封装结果集合
 *
 * @author six
 */
@Setter
@Getter
public class ResultVo implements Serializable {

    private static final long serialVersionUID = 7472072673863388869L;
    // 总条数
    private Long total;
    // 集合数据
    private List list;
}