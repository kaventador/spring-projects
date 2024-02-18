package ir.academy.blog.modules.posts.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import javax.swing.text.html.parser.Entity;

@ٍEntity
@Table(name = "category_tbl")

public class Category {
    @Id
    @GeneratedValue
}
