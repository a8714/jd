package com.roo.dao;


import com.roo.pojo.Item;
import org.springframework.data.jpa.repository.JpaRepository;
// Item的Dao接口
public interface ItemDao extends JpaRepository<Item, Long> {

}