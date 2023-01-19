package com.exampletaxi.yandextaxischeduler.repository;

import com.exampletaxi.yandextaxischeduler.model.MomentPrice;
import io.micrometer.core.annotation.Timed;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PriceRepository extends CrudRepository<MomentPrice,Long> {


    List<MomentPrice> findAll();
}
