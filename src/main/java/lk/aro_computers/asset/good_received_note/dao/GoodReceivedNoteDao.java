package lk.aro_computers.asset.good_received_note.dao;

import lk.aro_computers.asset.purchase_order.entity.PurchaseOrder;
import lk.aro_computers.asset.good_received_note.entity.GoodReceivedNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GoodReceivedNoteDao extends JpaRepository< GoodReceivedNote, Integer> {
    GoodReceivedNote findByPurchaseOrder(PurchaseOrder purchaseOrder);
}
