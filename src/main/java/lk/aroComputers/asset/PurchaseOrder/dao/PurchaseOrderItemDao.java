package lk.aroComputers.asset.PurchaseOrder.dao;

import lk.aroComputers.asset.PurchaseOrder.entity.PurchaseOrder;
import lk.aroComputers.asset.PurchaseOrder.entity.PurchaseOrderItem;
import lk.aroComputers.asset.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PurchaseOrderItemDao extends JpaRepository< PurchaseOrderItem, Integer> {
    PurchaseOrderItem findByPurchaseOrderAndItem(PurchaseOrder purchaseOrder, Item item);
    List<PurchaseOrderItem> findByPurchaseOrder(PurchaseOrder purchaseOrder);
}