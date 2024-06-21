package com.rewardpoints.Controller;

import com.rewardpoints.Service.RewardsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/api/V1/rewardpoints")
public class RewardPointsController {

    @Autowired
    RewardsService rewardsService;

    @GetMapping("/{customerId}")
    public double getRewardPoints (@PathVariable String customerId, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate, @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate){
        return rewardsService.getRewardPoints(customerId, startDate, endDate);
    }
}
