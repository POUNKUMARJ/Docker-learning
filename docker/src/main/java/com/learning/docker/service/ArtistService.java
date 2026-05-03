//package com.learning.docker.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.java.learn.programming.dockerdemo.repo.ArtistRepository;
//import com.learning.docker.model.Artist;
//
//import java.util.*;
//
//@Service
//public class ArtistService {
//
//	@Autowired
//	private ArtistRepository artistRepository;
//
//	public Artist createArtist(Artist artist) {
//		return artistRepository.save(artist);
//	}
//
//	public List<Artist> getAllArtists() {
//		return artistRepository.findAll();
//	}
//
//	public Optional<Artist> getArtistById(Long id) {
//		return artistRepository.findById(id);
//	}
//
//	public void deleteArtist(Long id) {
//		artistRepository.deleteById(id);
//	}
//}
