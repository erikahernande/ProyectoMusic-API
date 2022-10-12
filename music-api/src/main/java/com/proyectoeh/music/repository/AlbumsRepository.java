package com.proyectoeh.music.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectoeh.music.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
