package com.newDew.Instagram.repository;

import com.newDew.Instagram.entity.Conservation;
import org.springframework.data.repository.Repository;

import java.util.UUID;

public interface ConservationRepository extends Repository<Conservation, UUID> {
}