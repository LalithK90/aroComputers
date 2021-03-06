package lk.aro_computers.asset.supplier.dao;

import lk.aro_computers.asset.employee.entity.Employee;
import lk.aro_computers.asset.supplier.entity.Supplier;
import lk.aro_computers.asset.supplier_item.entity.enums.ItemSupplierStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierDao extends JpaRepository<Supplier, Integer> {
    Supplier findFirstByOrderByIdDesc();

    Supplier findByIdAndItemSupplierStatus(Integer supplierId, ItemSupplierStatus itemSupplierStatus);

    Supplier findByName(String name);
    Supplier findByEmail(String email);

}
