package com.studydemo.springbootv.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

// 创建实体类用来和数据库的表绑定,类名和表名映射
@Entity
@Data
public class Book {
    @Id
    private Integer id;
    private String name;
    private String author;
    private float price;
}
