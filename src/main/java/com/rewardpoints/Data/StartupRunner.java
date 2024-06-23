package com.rewardpoints.Data;

import com.rewardpoints.Entity.RewardPoints;
import com.rewardpoints.Repository.RewardPointsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Component
public class StartupRunner implements CommandLineRunner {

    private final RewardPointsRepository rewardPointsRepository;

    public StartupRunner(RewardPointsRepository rewardPointsRepository) {
        this.rewardPointsRepository = rewardPointsRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<RewardPoints> listOfUsers = Arrays.asList(
                new RewardPoints(1L, "2024001", "Tony", "Stark", 200.00, LocalDate.of(2024, 1, 10)),
                new RewardPoints(2L, "2024002", "Steve", "Rogers", 150.00, LocalDate.of(2024, 2, 20)),
                new RewardPoints(3L, "2024003", "Bruce", "Banner", 75.00, LocalDate.of(2024, 3, 15)),
                new RewardPoints(4L, "2024001", "Tony", "Stark", 120.00, LocalDate.of(2024, 2, 15)),
                new RewardPoints(5L, "2024004", "Natasha", "Romanoff", 160.00, LocalDate.of(2024, 1, 30)),
                new RewardPoints(6L, "2024002", "Steve", "Rogers", 180.00, LocalDate.of(2024, 1, 25)),
                new RewardPoints(7L, "2024003", "Bruce", "Banner", 130.00, LocalDate.of(2024, 1, 20)),
                new RewardPoints(8L, "2024004", "Natasha", "Romanoff", 220.00, LocalDate.of(2024, 2, 18)),
                new RewardPoints(9L, "2024001", "Tony", "Stark", 80.00, LocalDate.of(2024, 3, 10)),
                new RewardPoints(10L, "2024005", "Clint", "Barton", 140.00, LocalDate.of(2024, 1, 15)),
                new RewardPoints(11L, "2024004", "Natasha", "Romanoff", 50.00, LocalDate.of(2024, 3, 12)),
                new RewardPoints(12L, "2024003", "Bruce", "Banner", 210.00, LocalDate.of(2024, 2, 28)),
                new RewardPoints(13L, "2024006", "Thor", "Odinson", 200.00, LocalDate.of(2024, 1, 25)),
                new RewardPoints(14L, "2024002", "Steve", "Rogers", 90.00, LocalDate.of(2024, 3, 5)),
                new RewardPoints(15L, "2024005", "Clint", "Barton", 180.00, LocalDate.of(2024, 2, 10)),
                new RewardPoints(16L, "2024001", "Tony", "Stark", 50.00, LocalDate.of(2024, 2, 28)),
                new RewardPoints(17L, "2024006", "Thor", "Odinson", 150.00, LocalDate.of(2024, 2, 20)),
                new RewardPoints(18L, "2024005", "Clint", "Barton", 70.00, LocalDate.of(2024, 3, 8)),
                new RewardPoints(19L, "2024002", "Steve", "Rogers", 130.00, LocalDate.of(2024, 2, 18)),
                new RewardPoints(20L, "2024006", "Thor", "Odinson", 100.00, LocalDate.of(2024, 3, 30)),
                new RewardPoints(21L, "2024004", "Natasha", "Romanoff", 135.00, LocalDate.of(2024, 2, 5)),
                new RewardPoints(22L, "2024003", "Bruce", "Banner", 95.00, LocalDate.of(2024, 1, 10)),
                new RewardPoints(23L, "2024001", "Tony", "Stark", 250.00, LocalDate.of(2024, 1, 25)),
                new RewardPoints(24L, "2024005", "Clint", "Barton", 60.00, LocalDate.of(2024, 1, 25)),
                new RewardPoints(25L, "2024003", "Bruce", "Banner", 175.00, LocalDate.of(2024, 3, 25)),
                new RewardPoints(26L, "2024006", "Thor", "Odinson", 210.00, LocalDate.of(2024, 2, 15)),
                new RewardPoints(27L, "2024005", "Clint", "Barton", 250.00, LocalDate.of(2024, 2, 5)),
                new RewardPoints(28L, "2024006", "Thor", "Odinson", 95.00, LocalDate.of(2024, 1, 15)),
                new RewardPoints(29L, "2024004", "Natasha", "Romanoff", 250.00, LocalDate.of(2024, 1, 10))
        );
        rewardPointsRepository.saveAll(listOfUsers);
    }
}
