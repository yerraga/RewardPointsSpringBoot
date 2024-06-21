package com.rewardpoints.Service;

import com.rewardpoints.Entity.RewardPoints;
import com.rewardpoints.Repository.RewardPointsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RewardsService {
    @Autowired
    RewardPointsRepository rewardPointsRepository;

    public double getRewardPoints(String customerId, LocalDate startDate, LocalDate endDate){
        double totalAmount = 0;
        double totalRewardPoints = 0;
        List<RewardPoints> rewardsPointlist = rewardPointsRepository.findByCustomerIdAndDateBetween(customerId, startDate, endDate);
        for (RewardPoints rewardPoints1 : rewardsPointlist){
            totalAmount += rewardPoints1.getAmount();
        }
        log.info("Total amount spent : ", totalAmount);

        if (totalAmount < 100 && totalAmount >50){
            totalRewardPoints =  (totalAmount - 50);
        } else if (totalAmount >100) {
            totalRewardPoints = (50 + ((totalAmount -100 ) *2));
        }
        return totalRewardPoints;
    }
}
