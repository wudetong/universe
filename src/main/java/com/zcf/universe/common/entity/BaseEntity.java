package com.zcf.universe.common.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 实体类公共字段类
 *
 * @author six
 * @date new Date()
 */
@Getter
@Setter
public class BaseEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "create_time")
    @JsonSerialize(using = DateSerializer.class)
    private Date createTime;

    @Column(name = "update_time")
    @JsonSerialize(using = DateSerializer.class)
    private Date updateTime;
}