package com.abdus.airecruitmentplatform;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository extends JpaRepository<candidate, Long> {
    boolean existsByEmail(String email);
}