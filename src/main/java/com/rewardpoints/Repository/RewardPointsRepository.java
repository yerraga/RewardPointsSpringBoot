package com.rewardpoints.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.rewardpoints.Entity.RewardPoints;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface RewardPointsRepository extends JpaRepository<RewardPoints, Long> {
    List<RewardPoints> findByCustomerIdAndDateBetween(String customerId, LocalDate startDate, LocalDate endDate);



}

