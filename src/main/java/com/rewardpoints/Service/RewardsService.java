package com.rewardpoints.Service;

import com.rewardpoints.Entity.RewardPoints;
import com.rewardpoints.Repository.RewardPointsRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rewardpoints.DTO.CustomerDTO;

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

        if (totalAmount < 100 && totalAmount >50){
            totalRewardPoints =  (totalAmount - 50);
        } else if (totalAmount >100) {
            totalRewardPoints = (50 + ((totalAmount -100 ) *2));
        }
        return totalRewardPoints;
    }

    public CustomerDTO getCustomerDetails(String customerId) {
        Optional<RewardPoints> rewardPoints = rewardPointsRepository.findByCustomerId(customerId).stream().findFirst();
        if (rewardPoints.isPresent()) {
            RewardPoints rewardPoints1 = rewardPoints.get();
            return new CustomerDTO(rewardPoints1.getFirstName(), rewardPoints1.getLastName());
        }
        throw new RuntimeException("User not found");
    }
}
