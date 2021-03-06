package lk.aro_computers.asset.item.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFilter;
import lk.aro_computers.asset.brand.entity.Brand;
import lk.aro_computers.asset.category.entity.Category;
import lk.aro_computers.asset.item.entity.enums.WarrantyPeriod;
import lk.aro_computers.asset.item_color.entity.ItemColor;
import lk.aro_computers.asset.common_asset.model.enums.LiveDead;
import lk.aro_computers.asset.item.entity.enums.ItemStatus;
import lk.aro_computers.asset.ledger.entity.Ledger;
import lk.aro_computers.asset.purchase_order_item.entity.PurchaseOrderItem;
import lk.aro_computers.asset.supplier_item.entity.SupplierItem;
import lk.aro_computers.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Item")
public class Item extends AuditEntity {

    @Size( min = 3, message = "Item name cannot be accepted. required more than 3 characters" )
    private String name;

    @NotEmpty
    private String rop;

    @Column( unique = true )
    private String code;

    @Column( nullable = false, precision = 10, scale = 2 )
    private BigDecimal sellPrice;

    @Enumerated( EnumType.STRING )
    private ItemStatus itemStatus;

    @Enumerated(EnumType.STRING)
    private LiveDead liveDead;

    @Enumerated(EnumType.STRING)
    private WarrantyPeriod warrantyPeriod;

    @ManyToOne
    private Category category;

    @ManyToOne
    private Brand brand;

    @ManyToOne
    private ItemColor itemColor;

    @OneToMany( mappedBy = "item" )
    private List< SupplierItem > supplierItem;

    @OneToMany( mappedBy = "item" )
    @JsonBackReference
    private List< Ledger > ledgers;

    @OneToMany( mappedBy = "item" )
    private List< PurchaseOrderItem > purchaseOrderItems;
}
