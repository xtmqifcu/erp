package com.bearxyz.repository;

import com.bearxyz.domain.po.business.PurchasingOrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * Created by bearxyz on 2017/8/24.
 */
public interface PurchasingOrderItemRepository extends JpaRepository<PurchasingOrderItem, String>, JpaSpecificationExecutor<PurchasingOrderItem> {

}
