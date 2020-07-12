package lk.aroComputers.aro.asset.color.dao;


import lk.aroComputers.aro.asset.color.entity.ItemColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemColorDao extends JpaRepository<ItemColor, Integer> {

}
