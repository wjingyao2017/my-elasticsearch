package yang.yang.elastic.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import yang.yang.elastic.demo.model.Car;
import yang.yang.elastic.demo.repository.CarRepository;

/**
 * Created by yanyan on 2017/06/14.
 */
@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car findOne(String id) {
        return this.carRepository.findById(id).orElse(null);
    }

    @Override
    public long countAll() {
        return this.carRepository.count();
    }

    @Override
    public Iterable<Car> findAll() {
        return this.carRepository.findAll();
    }
}