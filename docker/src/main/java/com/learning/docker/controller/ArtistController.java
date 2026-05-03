package com.learning.docker.controller;

//import java.net.URI;
//import java.util.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import com.learning.docker.model.Artist;
//import com.learning.docker.service.ArtistService;

@RestController
//@RequestMapping("/v1/artists")
public class ArtistController {

	@GetMapping("/print")
	public String printValues() {
		return "<h1>Successfully Printed !!!!!</h1>";
	}

//	@Autowired
//	private ArtistService artistService;
//
//	@PostMapping
//	public ResponseEntity<Artist> createArtist(@RequestBody Artist artist) {
//		Artist created = artistService.createArtist(artist);
//		return ResponseEntity.created(URI.create("/v1/artists/" + created.getId())).body(created);
//	}
//
//	@GetMapping
//	public ResponseEntity<List<Artist>> getAllArtists() {
//		List<Artist> artists = artistService.getAllArtists();
//		return ResponseEntity.ok(artists);
//	}
//
//	@GetMapping("/{id}")
//	public ResponseEntity<Artist> getArtistById(@PathVariable Long id) {
//		Optional<Artist> artist = artistService.getArtistById(id);
//		return artist.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.ok(null));
//	}
//
//	@DeleteMapping("/{id}")
//	public ResponseEntity<Void> deleteArtist(@PathVariable Long id) {
//		if (artistService.getArtistById(id).isPresent()) {
//			artistService.deleteArtist(id);
//			return ResponseEntity.noContent().build();
//		}
//		return ResponseEntity.notFound().build();
//	}
}
