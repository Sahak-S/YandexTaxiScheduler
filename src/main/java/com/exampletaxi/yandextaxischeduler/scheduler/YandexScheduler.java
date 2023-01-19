package com.exampletaxi.yandextaxischeduler.scheduler;

import com.exampletaxi.yandextaxischeduler.model.Coordinate;
import com.exampletaxi.yandextaxischeduler.properties.CoordinateProperties;
import com.exampletaxi.yandextaxischeduler.service.TaxiService;
import io.micrometer.core.annotation.Timed;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class YandexScheduler {
    private final TaxiService taxiService;
    private final CoordinateProperties coordinateProperties;

    @Timed
    @Scheduled(fixedDelay = 30_000)
    public void  updatePrices(){
        Coordinate startPoint = new Coordinate(coordinateProperties.getStartLatitude(), coordinateProperties.getStartLongitude());
        Coordinate endPoint = new Coordinate(coordinateProperties.getFinishLatitude(), coordinateProperties.getFinishLongitude());
        taxiService.getPrice(startPoint, endPoint);
    }
}
