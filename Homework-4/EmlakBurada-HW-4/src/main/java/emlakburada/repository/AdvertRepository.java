package main.java.emlakburada.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import emlakburada.model.Advert;

public interface AdvertRepository extends JpaRepository<Advert, Integer> {

    Advert findById(int id);

}
